<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="zh-cn">
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
<body onload="onLoaded()">
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
    <!--main-->
    <div class="row">
        <!--左侧选项卡-->
        <div class="col-md-2">
            <!--系统管理-->
            <div class="list-group">
                <a href="#" class="list-group-item active">系统管理</a>
                <div class="list-group-item">

                    <h4 class="list-group-item-heading" onclick="changeContent('userManager.jsp')">
                        <a href="#">用户管理</a>
                    </h4>
                    <p class="list-group-item-text">
                        管理当前活动账户的子用户
                    </p>
                </div>
                <div class="list-group-item">
                    <h4 class="list-group-item-heading" onclick="changeContent('roomManager.jsp')">
                        <a href="#">教室管理</a>
                    </h4>
                    <p class="list-group-item-text">
                        管理当前账户所管辖的教室
                    </p>
                </div>
                <div class="list-group-item">
                    <span class="badge">14</span>
                    <h4 class="list-group-item-heading" onclick="changeContent('appointmentManager.html')">
                        <a href="#">预约管理</a>
                    </h4>
                    <p class="list-group-item-text">
                        审核预约申请
                    </p>
                </div>
            </div>
            <!--个人管理-->
            <div class="list-group">
                <a href="#" class="list-group-item active">个人管理</a>
                <div class="list-group-item">
                    <h4 class="list-group-item-heading" onclick="changeContent('profile.html')">
                        <a href="#">个人信息</a>
                    </h4>
                    <p class="list-group-item-text">
                        修改个人信息
                    </p>
                </div>
                <div class="list-group-item">
                    <span class="badge">14</span>
                    <h4 class="list-group-item-heading" onclick="changeContent('myResv.jsp')">
                        <a href="#">我的预约</a>
                    </h4>
                    <p class="list-group-item-text">
                        查看/修改自己的预约
                    </p>
                </div>
            </div>

        </div>
        <!--右侧内容-->
        <div id="content" class="col-md-10">
            <div class="row">
                <div class="col-md-12">
                    <div class="alert alert-success alert-dismissable">
                        <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                            ×
                        </button>
                        <h4>
                            提示：
                        </h4> 请从左侧选择一项操作
                    </div>
                </div>
            </div>
        </div>
    </div>
    <!--footer-->
    <div class="row">
        <div class="col-md-12">
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
    </div>
</div>
</body>
</html>