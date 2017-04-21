<%--
  Created by IntelliJ IDEA.
  User: 陈文航
  Date: 2017/4/1 0001
  Time: 13:56
  To change this template use File | Settings | File Templates.
--%>
<%@ page language="java" pageEncoding="UTF-8" contentType="text/html;charset=UTF-8" %>
<!-- header -->
<div class="row header manage-cover-box">
    <div class="col-xs-12 manage-cover-box-child"></div>
    <div class="col-xs-4"><a href="/lab/index"><img class="logo" src="<%=request.getContextPath()%>/public/pic/logo.png"></a></div>
    <div class="col-xs-6">
        <h4><a class="menu-word" href="/lab/index">公告</a></h4>
        <h4><a class="menu-word" href="/lab/appoint">预约</a></h4>
        <h4><a class="menu-word" href="/lab/share">资源共享</a></h4>
        <h4><a class="menu-word" href="/lab/course">精品课程</a></h4>
        <h4 class="menu-sys">
            <span class="menu-word menu-word-sys">系统管理</span>
            <!-- <div class="nav-down"> -->
            <div class="nav-down-child">
                <a class="menu-word" href="/lab/manage_appoint">预约管理</a>
                <a class="menu-word" href="/lab/manage_user">其他管理</a>
            </div>
            <!-- </div> -->
        </h4>
        <h4><a class="menu-word" href="#">个人中心</a></h4>
    </div>
    <div class="col-xs-2">
        <a data-toggle="dropdown" href="#" class="menu-word">
            <span class="user-info">
            <h4>欢迎您,${sessionScope.user.name}</h4>
            <span class="caret"></span>
            </span>
        </a>
        <ul class="user-menu pull-right dropdown-menu dropdown-yellow dropdown-caret dropdown-close">
            <li>
                <a href="#" onclick="logout()">
                    <i class="icon-off"></i>
                    退出
                </a>
                <script>
                    function logout() {
                        var svcPrefix = "/lab/svc/";
                        var url = svcPrefix + "user/logout";
                        var viewPrefix = "/lab/";
                        $.ajax({
                            type: "GET",
                            url: url
                        }).success(function (data) {
                            window.location.href = viewPrefix;
                        }).error(function (data) {
                            console.log("error");
                        });
                    }
                </script>
            </li>
        </ul>
    </div>
</div>
