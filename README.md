# SSM 整合框架(Spring+SpringMvc+Mybatis)
# 一、 开发指引
如果你的电脑上还没有安装jdk,maven,tomcat,请先安装这些软件([查看指引](./document/prerequisite.md))

如果你的电脑已经配置好了环境,那么直接将本项目pull到本地即可

> 打开todo列表(在IDEA中,按`alt+6`或者点击`view > tool window > TODO`),即可看到所有在新建项目时需要手动配置的条目,如数据库密码等  
> 可以直接使用mybatisGenerator生成dao层

# 二、特性

## 0. 支持jdk1.7+
- 满足几乎所有的**新**项目的部署环境,如果你使用的不是古董级服务器环境,那么就赶紧迁移到jdk1.7+吧
- 可以使用泛型

## 1.统一的响应体
在开发时,经常需要对接口进行封装,来传递一些额外信息,本模版已经定义好了一个ControllerAdvice,用于对所有接口所返回的数据用一个统一的格式进行封装

实现方式:在`....common.controller.ControllerAdvice`中使用泛型封装所有接口的数据(如果返回值类型是CommonResponse或其子类,则不会重复封装),
```json
{
    "code":0,
    "msg":"str",
    "data":"T"
}
```


## 2.统一的异常处理
建议全部使用`RuntimeException`,这样你就不必反复的写try..catch..
你可以在`....exception.ExceptionInfoService`中注册你自己的异常的相关信息(异常、对应的代码和描述),
示例中已经包含了所有spring异常体系中的异常和部分java异常体系中的异常
(如果你在抛出异常时指定message,那么在这里注册的异常描述`msg`会失效)

## 3.统一的权限控制
#### step1
如果需要对某个接口进行权限验证，则直接在上面加上`@RequiredAuth`注解，AuthInterceptor会自动拦截所有请求并判断当前session的用户是否拥有指定的权限。

#### step2
在AuthInterceptor修改`hasPermission()`方法，从session中取得用户所具有的权限列表。
