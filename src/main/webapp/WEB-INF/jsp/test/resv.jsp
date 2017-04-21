<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html lang="zh-CN">
<head>
    <!--<link href="//cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap-theme.css" rel="stylesheet">-->
    <link href="//cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap-theme.min.css" rel="stylesheet">

    <!--<link href="//cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.css" rel="stylesheet">-->
    <link href="//cdn.bootcss.com/bootstrap/3.0.1/css/bootstrap.min.css" rel="stylesheet">

    <!-- jQuery文件。务必在bootstrap.min.js 之前引入 -->
    <script src="http://cdn.static.runoob.com/libs/jquery/2.1.1/jquery.min.js"></script>

    <!-- 最新的 Bootstrap 核心 JavaScript 文件 -->
    <script src="//cdn.bootcss.com/bootstrap/3.0.1/js/bootstrap.min.js"></script>

    <script type="text/javascript">
        //局部刷新
        function changeContent(page) {
            $("#content").load(page);
        }

        function log(msg) {
            $("#message").append("<p>" + msg + "</p>");
        }
        /*
         * 加载完页面数据后，初始化基本数据
         * 如预[约管理]和[我的预约]选项卡的气泡
         */
        function onLoaded() {

        }
    </script>
    <style>
        /*去掉连接下划线*/
        a, a:hover, a:visited, a:link, a:active {
            text-decoration: none;
        }

        .row {
            margin-left: 0;
            margin-right: 0;
        }

    </style>
    <meta charset="UTF-8">
    <title>紫金预约系统</title>
</head>
<body>
<div class="container-fluid">
    <!--导航栏-->
    <div class="row">
        <div class="col-md-12">
            <nav class="navbar navbar-default navbar-inverse" role="navigation">
                <div class="navbar-header">

                    <button type="button" class="navbar-toggle" data-toggle="collapse"
                            data-target="#bs-example-navbar-collapse-1">
                        <span class="sr-only">Toggle navigation</span><span class="icon-bar"></span><span
                            class="icon-bar"></span><span class="icon-bar"></span>
                    </button>
                    <a class="navbar-brand" href="#">紫金学院预约管理系统</a>
                </div>

                <div class="collapse navbar-collapse" id="bs-example-navbar-collapse-1">
                    <ul class="nav navbar-nav">
                        <li class="active">
                            <a href="#">Link</a>
                        </li>
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">One more separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                    <form class="navbar-form navbar-left" role="search">
                        <div class="form-group">
                            <input type="text" class="form-control"/>
                        </div>
                        <button type="submit" class="btn btn-default">
                            Submit
                        </button>
                    </form>
                    <ul class="nav navbar-nav navbar-right">
                        <li>
                            <a href="#">Link</a>
                        </li>
                        <li class="dropdown">
                            <a href="#" class="dropdown-toggle" data-toggle="dropdown">Dropdown<strong
                                    class="caret"></strong></a>
                            <ul class="dropdown-menu">
                                <li>
                                    <a href="#">Action</a>
                                </li>
                                <li>
                                    <a href="#">Another action</a>
                                </li>
                                <li>
                                    <a href="#">Something else here</a>
                                </li>
                                <li class="divider">
                                </li>
                                <li>
                                    <a href="#">Separated link</a>
                                </li>
                            </ul>
                        </li>
                    </ul>
                </div>

            </nav>
        </div>
    </div>

    <%--log--%>
    <div class="row">
        <div class="col-md-12">
            <div class="alert alert-success alert-dismissable">

                <button class="close" aria-hidden="true" type="button" data-dismiss="alert">
                    ×
                </button>
                <h4>
                    statues:
                </h4>
                <div id="message">

                </div>
            </div>
        </div>
    </div>
    <hr/>
    <!--登陆框-->
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <label class="col-sm-2 control-label" for="userName">
                    用户名
                </label>
                <div class="col-sm-10">
                    <input class="form-control" id="userName" type="text"/>
                </div>
            </div>
            <div class="row">
                <label class="col-sm-2 control-label" for="password">
                    密码
                </label>
                <div class="col-sm-10">
                    <input class="form-control" id="password" type="password"/>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-curPage-2 col-sm-10">
                    <div class="checkbox">
                        <label>
                            <input type="checkbox"/> 记住密码
                        </label>
                    </div>
                </div>
            </div>
            <div class="row">
                <div class="col-sm-curPage-2 col-sm-10">

                    <button class="btn btn-default" onclick="login()">
                        登陆
                    </button>
                    <script>
                        function login() {
                            //TODO 关闭登录按钮
                            var request = {userName: $("#userName").val(), password: $("#password").val()};
                            var svcPrefix = "/lab/svc/";
                            var viewPrefix = "/lab/";

                            var url = svcPrefix + "users/login";
                            $.ajax({
                                type: "POST",
                                url: url,
                                contentType: "application/json",  //发送信息至服务器时内容编码类型。
                                dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
                                data: JSON.stringify(request)
                            }).success(function (data) {
                                log("登录请求success，返回数据：" + JSON.stringify(data))
                                //TODO 处理返回数据
                            }).error(function (data) {
                                //TODO 弹框提醒网络错误
                                log("登陆遇到错误" + JSON.stringify(data));
                            }).complete(function () {
                                //TODO 开启登陆按钮
                                log("complete");
                            });
                        }
                    </script>
                </div>
            </div>
        </div>
    </div>
    <hr/>
    <div class="row">
        <div class="col-md-12">
            <div class="row">
                <input id="resvEntityId" title="resvEntityId" class="col-md-2">
                <input id="startTime" title="startTime" class="col-md-2">
                <input id="endTime" title="endTime" class="col-md-2">
                <button class="btn btn-default" onclick="createResv()">
                    添加用户
                </button>
                <script>
                    function createResv() {
                        var request = {
                            resvEntityId: $("#userName").val(),
                            startTime: $("#userName").val(),
                            endTime: $("#userName").val()
                        };
                        log("request:" + JSON.stringify(request));
                        var svcPrefix = "/lab/svc/";
                        var targetURL = svcPrefix + "Resv/";
                        $.ajax({
                            type: "POST",
                            url: targetURL,
                            contentType: "application/json",  //发送信息至服务器时内容编码类型。
                            dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
                            data: JSON.stringify(request)
                        }).success(function (data) {
                            log("success:" + JSON.stringify(data));
                        }).error(function (data) {
                            log("error:" + JSON.stringify(data));
                        }).complete(function () {
                            log("complete:");
                        });

                    }
                </script>
            </div>
        </div>
    </div>
    <hr/>
</div>
</body>
</html>