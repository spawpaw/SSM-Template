package com.spawpaw.ssm.util;

import org.mybatis.generator.api.MyBatisGenerator;
import org.mybatis.generator.config.Configuration;
import org.mybatis.generator.config.xml.ConfigurationParser;
import org.mybatis.generator.exception.InvalidConfigurationException;
import org.mybatis.generator.exception.XMLParserException;
import org.mybatis.generator.internal.DefaultShellCallback;

import java.io.File;
import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

/**
 * Mybatis mapper代码自动生成
 *
 * @author BenBenShang spawpaw@hotmail.com 2017/9/27
 */
public class MybatisGeneratorRunner {
    private static final boolean overwrite = true;

    public static void main(String[] args) {
        try {
            File file = new File("");
            System.out.println("准备生成..");
            System.out.println(file.getAbsolutePath());
            List<String> warnings = new ArrayList<String>();
            File configFile = new File("src/main/resources/generatorConfig.xml");
            ConfigurationParser cp = new ConfigurationParser(warnings);
            Configuration config = cp.parseConfiguration(configFile);
            DefaultShellCallback callback = new DefaultShellCallback(overwrite);
            MyBatisGenerator myBatisGenerator = new MyBatisGenerator(config, callback, warnings);
            myBatisGenerator.generate(null);
        } catch (SQLException | InterruptedException | IOException | XMLParserException | InvalidConfigurationException e) {
            e.printStackTrace();
        }
    }
}
