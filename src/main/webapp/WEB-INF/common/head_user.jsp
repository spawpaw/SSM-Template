<%--
  Created by IntelliJ IDEA.
  User: 陈文航
  Date: 2017/4/1 0001
  Time: 13:55
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!-- header -->
<div class="row header manage-cover-box">
    <div class="col-xs-12 manage-cover-box-child"></div>
    <div class="col-xs-4"><a href="/lab/index"><img class="logo"
                                                    src="<%=request.getContextPath()%>/public/pic/logo.png"></a></div>
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
        <button class="btn btn-default user-sign" href="#" role="button" data-toggle="modal" data-target="#login"
                style="display: ${sessionScope.user eq null?"inline":"none"}">登录
        </button>
        <button class="btn btn-default user-sign" href="#" role="button" data-toggle="modal" data-target="#register"
                style="display: ${sessionScope.user eq null?"inline":"none"}">
            注册
        </button>
        <a data-toggle="dropdown" href="#" class="menu-word"
           style="display: ${sessionScope.user eq null?"none":"block"}">
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
<br>


<!-- login -->
<div class="modal fade" id="login" tabindex="-1" role="dialog" aria-labelledby="myLogin">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myLogin">登录</h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label for="userName">帐号：</label>
                    <input type="text" class="form-control" id="userName" placeholder="帐号">
                </div>
                <div class="form-group">
                    <label for="password">密码：</label>
                    <input type="password" class="form-control" id="password" placeholder="密码">
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button class="btn btn-primary" onclick="login()">登录</button>
                <script>
                    function login() {
                        var request = {userName: $("#userName").val(), password: $.md5($("#password").val())};
                        var svcPrefix = "/lab/svc/";
                        var viewPrefix = "/lab/";

                        var url = svcPrefix + "user/login";
                        $.ajax({
                            type: "POST",
                            url: url,
                            contentType: "application/json",  //发送信息至服务器时内容编码类型。
                            dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
                            data: JSON.stringify(request)
                        }).success(function (data) {
                            if (data.result == false) {
                                if (data.code == "USER_VERIFY_FAILURE") {
                                    alert("用户名或密码错误");
                                } else {
                                    alert("登陆遇到未知错误")
                                }
                            } else {
                                window.location.href = viewPrefix;
                            }
                        }).error(function (data) {
//                            alert("发生错误");
                        }).complete(function () {
                        });
                    }
                </script>
            </div>
        </div>
    </div>
</div>
<!-- register -->
<div class="modal fade" id="register" tabindex="-1" role="dialog" aria-labelledby="myRegister">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span
                        aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myRegister">注册</h4>
            </div>
            <div class="modal-body">
                <div class="form-group">
                    <label for="identity">请选择身份：</label>
                    <select id="identity" class="form-control">
                    </select>
                </div>
                <div class="form-group">
                    <label for="userNumber" id="userLabel">学号（作为帐号）：</label>
                    <input type="text" class="form-control" id="userNumber" placeholder="学号">
                </div>
                <div class="form-group">
                    <label for="userPassword">密码：</label>
                    <input type="password" class="form-control" id="userPassword"
                           placeholder="以字母开头，长度在6-18之间，只能包含字符、数字和下划线">
                </div>
                <div class="form-group">
                    <label for="rePassword">确认密码：</label>
                    <input type="password" class="form-control" id="rePassword" placeholder="确认密码">
                </div>
                <div class="form-group">
                    <label for="name">姓名：</label>
                    <input type="text" class="form-control" id="name" placeholder="姓名">
                </div>
                <div id="college_box" class="form-group">
                    <label for="college">系别：</label>
                    <select id="college" class="form-control">
                    </select>
                </div>
                <div id="major_box" class="form-group">
                    <label for="major">专业：</label>
                    <select id="major" class="form-control">
                    </select>
                </div>
                <div id="email_box" class="form-group">
                    <label for="email">邮箱：</label>
                    <input type="email" class="form-control" id="email" placeholder="邮箱">
                </div>
                <div id="class_box" class="form-group">
                    <label for="class">班级：</label>
                    <select id="class" class="form-control">
                    </select>
                </div>
                <div id="building_box" class="form-group">
                    <label for="adminBuilding">楼栋：</label>
                    <select id="adminBuilding" class="form-control">
                    </select>
                </div>
                <div id="laboratory_box" class="form-group">
                    <label for="adminLaboratory">实验室：</label>
                    <select id="adminLaboratory" class="form-control">
                    </select>
                </div>
            </div>
            <div class="modal-footer">
                <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                <button class="btn btn-primary" onclick="register()">注册</button>
                <script>
                    var myPasswordCheck = function (value) {
                        var reg = /[a-zA-Z]\w{5,17}$/;
                        if (!reg.test(value)) {
                            return false;
                        } else {
                            return true;
                        }
                    };
                    function register() {
                        if (!myPasswordCheck($("#userPassword").val())) {
                            alert("请输入正确格式密码，以字母开头，长度在6-18之间，只能包含字符、数字和下划线");
                            return;
                        }
                        var svcPrefix = "/lab/svc/";
                        var viewPrefix = "/lab/";
                        var url = svcPrefix;
                        if ($("#userPassword").val() != $("#rePassword").val()) {
                            alert("两次密码输入不一致!");
                            return;
                        }
                        if ($("#identity").val() == "学生") {
                            url += "user/student/";
                        } else if ($("#identity").val() == "教师") {
                            url += "user/teacher/";
                        } else if ($("#identity").val() == "实验室管理员") {
                            url += "user/labAdmin/";
                        }
                        var request = {
                            loginName: $("#userNumber").val(),
                            pasword: $.md5($("#userPassword").val()),
                            name: $("#name").val(),
                            email: $("#email").val(),
                            department: $("#college").val(),
                            major: $("#major").val(),
                            mclass: $("#class").val()
                        };
                        $.ajax({
                            type: "POST",
                            url: url,
                            contentType: "application/json",  //发送信息至服 务器时内容编码类型。
                            dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
                            data: JSON.stringify(request)
                        }).success(function (data) {
                            if (data.result == false) {
                                alert("注册失败")
                            } else {
                                window.location.href = viewPrefix;
                            }
                        }).error(function (data) {
//                            alert("发生错误");
                        }).complete(function () {
                        });
                    }
                </script>
            </div>
        </div>
    </div>
</div>