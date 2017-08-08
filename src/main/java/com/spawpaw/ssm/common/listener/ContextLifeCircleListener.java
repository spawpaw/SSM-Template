package com.spawpaw.ssm.common.listener;

import com.spawpaw.ssm.common.config.Config;

import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.io.*;

/**
 * 监听Servlet的生命周期并做出相应动作，如在容器初始化时压缩jsp/html代码
 *
 * @author BenBenShang spawpaw@hotmail.com 2017.2.21 .
 */
public class ContextLifeCircleListener implements ServletContextListener {

    /**
     * 容器初始化时执行的操作
     */
    @Override
    public void contextInitialized(ServletContextEvent servletContextEvent) {
        System.err.println("context initialized\n\n\n\n\n");

        //压缩代码
        //raw:22kb->13kb
        //zip:4352b->3489b
        if (Config.optimize_jsp) {
            //要压缩的文件的目录
            optimizeFile(servletContextEvent.getServletContext().getRealPath("WEB-INF/common/"));
            optimizeFile(servletContextEvent.getServletContext().getRealPath("WEB-INF/jsp/"));
        }
    }

    @Override
    public void contextDestroyed(ServletContextEvent servletContextEvent) {

    }

    /**
     * 压缩指定文件（去掉多余的换行和空格，本方法并不是使用zip等方式压缩，而是精简代码）
     * 支持html/jsp/js/css
     *
     * @param path 存放要压缩的代码的文件夹，该文件夹下的所有文件都将被压缩
     */
    private void optimizeFile(String path) {
        File file = new File(path);
        if (file.exists()) {
            File[] files = file.listFiles();
            if (files.length == 0) {
                System.out.println("文件夹是空的!");
                return;
            } else {
                for (File file2 : files) {
                    if (file2.isDirectory()) {
                        System.out.println("文件夹:" + file2.getAbsolutePath());
                        optimizeFile(file2.getAbsolutePath());
                    } else {
                        System.out.println("正在压缩文件:" + file2.getAbsolutePath());
                        try {
                            //读取文件
                            String content = "";


                            try {
                                FileInputStream in = new FileInputStream(file2);
                                // size  为字串的长度 ，这里一次性读完
                                int size = in.available();
                                byte[] buffer = new byte[size];
                                in.read(buffer);
                                in.close();
                                content = new String(buffer, "UTF-8");
                            } catch (IOException e) {
                                e.printStackTrace();
                            }
                            content = HtmlCompressor.compress(content);

                            //写入文件
                            FileOutputStream writerStream = new FileOutputStream(file2, false);
                            BufferedWriter writer = new BufferedWriter(new OutputStreamWriter(writerStream, "UTF-8"));
                            writer.write(content);
                            writer.close();
                            System.out.println("content:  " + content);
                        } catch (Exception e) {
                            e.printStackTrace();
                        }
                    }
                }
            }
        } else {
            System.out.println("文件不存在!");
            System.out.println("path" + path);
        }
    }
}
