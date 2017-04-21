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
            <nav class="navbar navbar-default" role="navigation">
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

    <div class="row">

        <!--左侧展示-->
        <div class="col-md-7">
            <div class="carousel slide" id="carousel-14599">
                <ol class="carousel-indicators">
                    <li class="active" data-target="#carousel-14599" data-slide-to="0">
                    </li>
                    <li data-target="#carousel-14599" data-slide-to="1">
                    </li>
                    <li data-target="#carousel-14599" data-slide-to="2">
                    </li>
                </ol>
                <div class="carousel-inner">
                    <div class="item active">
                        <img alt="Carousel Bootstrap First"
                             src="http://lorempixel.com/output/sports-q-c-1600-500-1.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                First Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="Carousel Bootstrap Second"
                             src="http://lorempixel.com/output/sports-q-c-1600-500-2.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Second Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                    <div class="item">
                        <img alt="Carousel Bootstrap Third"
                             src="http://lorempixel.com/output/sports-q-c-1600-500-3.jpg"/>
                        <div class="carousel-caption">
                            <h4>
                                Third Thumbnail label
                            </h4>
                            <p>
                                Cras justo odio, dapibus ac facilisis in, egestas eget quam. Donec id elit non mi porta
                                gravida at eget metus. Nullam id dolor id nibh ultricies vehicula ut id elit.
                            </p>
                        </div>
                    </div>
                </div>
                <a class="left carousel-control" href="#carousel-14599" data-slide="prev"><span
                        class="glyphicon glyphicon-chevron-left"></span></a> <a class="right carousel-control"
                                                                                href="#carousel-14599"
                                                                                data-slide="next"><span
                    class="glyphicon glyphicon-chevron-right"></span></a>
            </div>
            <p>
                Lorem ipsum dolor sit amet, <strong>consectetur adipiscing elit</strong>. Aliquam eget sapien sapien.
                Curabitur in metus urna. In hac habitasse platea dictumst. Phasellus eu sem sapien, sed vestibulum
                velit. Nam purus nibh, lacinia non faucibus et, pharetra in dolor. Sed iaculis posuere diam ut cursus.
                <em>Morbi commodo sodales nisi id sodales. Proin consectetur, nisi id commodo imperdiet, metus nunc
                    consequat lectus, id bibendum diam velit et dui.</em> Proin massa magna, vulputate nec bibendum nec,
                posuere nec lacus.
                <small>Aliquam mi erat, aliquam vel luctus eu, pharetra quis elit. Nulla euismod ultrices massa, et
                    feugiat ipsum consequat eu.
                </small>
            </p>
        </div>
        <!--右侧登陆框-->
        <div class="col-md-5">
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
                            var svcPrefix = "/resvsys/svc/";
                            var viewPrefix = "/resvsys/";

                            var url = svcPrefix + "users/login";
                            $.ajax({
                                type: "POST",
                                url: url,
                                contentType: "application/json",  //发送信息至服务器时内容编码类型。
                                dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
                                data: JSON.stringify(request)
                            }).success(function (data) {
                                //TODO 处理返回数据
                                if (data.result == false) {
                                    if (data.code == "USER_VERIFY_FAILURE") {
                                        alert("用户名或密码错误");
                                    } else {
                                        alert("登陆遇到未知错误")
                                    }
                                } else {
                                    window.location.href = viewPrefix;
                                }
                            }).error(function () {
                                //TODO 弹框提醒网络错误
                            }).complete(function () {
                                //TODO 开启登陆按钮
                                console.log("complete");
                            });
                        }
                    </script>
                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>