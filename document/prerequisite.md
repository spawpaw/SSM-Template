# 准备


## 1.安装JDK

1. 到oracle官网,根据你系统的版本[下载jdk](http://www.oracle.com/technetwork/java/javase/downloads/jdk8-downloads-2133151.html)
2. 安装jdk，中间会提示安装jre，按提示安装即可  
记住这一步jdk的安装目录  
例如 Windows: `C:\opt\Java\jdk1.8.0_91`  Linux: `/usr/java/jdk1.8.0_91`

3. 设置环境变量
- Windows： 
  1. 进入`控制面板\系统和安全\系统 > 高级系统设置>环境变量`
  2. 添加 `JAVA_HOME` 环境变量，修改其值为刚刚安装JDK的目录，例如 `C:\opt\Java\jdk1.8.0_91`
  3. 添加 `CLASSPATH` 环境变量，修改其值为 `;.;%JAVA_HOME%/lib/tools.jar;%JAVA_HOME%/lib/dt.jar;%JAVA_HOME%/bin;`
  4. 修改 `PATH` 环境变量，追加 `%JAVA_HOME%/bin`
  5. 在命令行输入 `java -version` 如果没有报错，则表示JDK安装成功
  
- Linux:
  1. 为所有用户安装JDK，则在`/etc/profile`中追加，若只为当前用户安装JDK，则在`~/.profile` 中添加下列内容:
  ```bash
  JAVA_HOME=/usr/java/jdk1.8.0_91
  CLASSPATH=.:$JAVA_HOME/lib.tools.jar
  PATH=$JAVA_HOME/bin:$PATH
  export JAVA_HOME CLASSPATH PATH
  ```
  2. 在终端输入 `source /etc/profile` 使设置生效
  3. 在命令行输入 `java -version` 如果没有报错，则表示JDK安装成功
  

## 2.安装Maven
1. 到maven[官网下载maven](http://maven.apache.org/download.cgi)
或者直接点击下载 :[Maven 3.5 zip](http://mirrors.tuna.tsinghua.edu.cn/apache/maven/maven-3/3.5.0/binaries/apache-maven-3.5.0-bin.zip)
2. 解压下载的安装包 例如解压到 `C:\lib\Maven\apache-maven-3.3.9`
3. 在maven安装目录下新建文件夹 `repository`
4. 修改maven的conf目录下的`settings.xml`,将localRepository标签改为 `<localRepository>C:\opt\Maven\apache-maven-3.3.9\repository</localRepository>`
5. 修改maven源（国内源速度更快）
在`settings.xml` 中找到`<mirrors>`标签，在其中加上如下代码
```xml
<mirror>  
  <id>alimaven</id>  
  <mirrorOf>central</mirrorOf>  
  <name>aliyun maven</name>  
  <url>http://maven.aliyun.com/nexus/content/groups/public/</url>  
</mirror>
```
## 3.安装Tomcat
1. 下载tomcat：
在官网根据系统版本下载： [官网下载](http://tomcat.apache.org/download-80.cgi)
或者直接下载：[Tomcat 8.5 64位](http://mirror.bit.edu.cn/apache/tomcat/tomcat-8/v8.5.14/bin/apache-tomcat-8.5.14-windows-x64.zip)
2. 将Tomcat解压，例如解压到`C:\opt\apache-tomcat-8.5.14`
## 4.安装Postman（不是必须的，仅用于测试）
[前往官网下载](https://www.getpostman.com/apps)
## 5.安装IDEA
1. [前往官网下载IDEA（注意要下载Ultimate版）](http://www.jetbrains.com/idea/#chooseYourEdition)
2. 安装IDEA

3. IDEA关于Maven的配置  
打开IDEA，点击右下角的`Configure > Project Defaults > Settings`
在`default Settings` 页面中，点击左侧的`Buid,Excute,Deployment > Maven` 中
- 将 `Maven home directory` 修改为你自己maven的安装目录，例如`C:\lib\Maven\apache-maven-3.3.9`
- 将`User settings file` 修改为 `C:\opt\Maven\apache-maven-3.3.9\conf\settings.xml`
- 将`local repository` 修改为 `C:\opt\Maven\apache-maven-3.3.9\repository`
- 点击`ok` 保存设置
4. IDEA关于JDK的配置
点击`Configure > Project Defaults > project structure` 
点击`new` >`jdk` , 选择你的jdk安装目录