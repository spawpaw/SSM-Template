# SSM-Template
Spring+SpringMVC+Mybatis 整合框架的基本模板

# 准备

在开始使用本模版前，你需要先安装如下软件
- IntelliJ IDEA
- Maven
- Tomcat

[点击这里](./prerequisite.md)查看需要安装的软件详情


# 导入项目
在IDEA中，依次点击`file > new project from version control > git`,输入`https://github.com/spawpaw/SSM-Template.git`  下载本项目

下载完毕后，打开本项目，在右下角弹出的提示框中点击`add as maven project` 或者右键点击`pom.xml > maven > import`  


# 运行
想要在本地运行，需要配置一下Tomcat，
依次点击idea的`run`>`edit configurations`,在弹出的窗口中，点击左上角的绿色加号，添加Tomcat

再为Tomcat添加一个artifact： `ssm:war-explode`

然后就可以点击运行按钮(快捷键`shift+f10`)开始运行本项目


如果要打包本项目并部署到服务器，则按照刚才添加Tomcat的步骤添加maven运行项，
然后将Maven的commandline修改为 `clean tomcat7:deploy`
之后运行maven，即可在`/target`目录下生成一个war包，将war包放至tomcat的`webapps`目录下，就可发布了

# 测试
本项目中有如下几个示例接口：

| 方法   | 路径           | 请求体                                  | 说明 |
|:----:  | :----          | :----                                   |:---- |
| `POST` | `/user`        | `{"user_name":"str","password":"str"}`  | 用于注册的请求 |
| `GET ` | `/user`        | 无                                      | 获取当前登录的用户的信息 |
| `PUT ` | `/user`        | `{"password":"str"}`                    | 修改当前登录的用户的密码 |
| `GET ` | `/user/logout` | `{}`                                    | 登出当前用户（清空当前session） |

推荐使用postman来测试这些接口



