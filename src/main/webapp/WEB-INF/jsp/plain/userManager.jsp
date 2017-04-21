<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>用户管理</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="tabbable" id="tabs-700746">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#panel-changePsw" data-toggle="tab">修改密码</a>
                    </li>
                    <li>
                        <a href="#panel-addUser" data-toggle="tab">添加用户</a>
                    </li>
                    <li>
                        <a href="#panel-addLotsOfUser" data-toggle="tab">批量添加</a>
                    </li>
                    <li>
                        <a href="#panel-userRoles" data-toggle="tab">用户类型管理</a>
                    </li>
                    <li>
                        <a href="#panel-labAdmins" data-toggle="tab">教室管理员</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="panel-changePsw">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4> 修改单个用户的密码
                                </div>

                                <div class="col-md-12">
                                    <form role="form">
                                        <div class="form-group">

                                            <label for="exampleInputEmail1" class="col-sm-2 control-label">
                                                用户名
                                            </label>
                                            <input type="email" class="form-control" id="exampleInputEmail1"/>
                                        </div>
                                        <div class="form-group">

                                            <label for="exampleInputPassword1" class="col-sm-2 control-label">
                                                密码
                                            </label>
                                            <input type="password" class="form-control" id="exampleInputPassword1"/>
                                        </div>
                                        <button type="submit" class="btn btn-default">
                                            修改
                                        </button>
                                    </form>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="panel-addUser">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4> 添加单个用户
                                </div>
                                <form role="form">
                                    <div class="form-group">
                                        <label for="uname" class="col-sm-2 control-label">
                                            用户名
                                        </label>
                                        <input type="email" class="form-control" id="uname"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="psw" class="col-sm-2 control-label">
                                            密码
                                        </label>
                                        <input type="email" class="form-control" id="psw"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="name" class="col-sm-2 control-label">
                                            姓名
                                        </label>
                                        <input type="email" class="form-control" id="name"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="tel" class="col-sm-2 control-label">
                                            电话
                                        </label>
                                        <input type="email" class="form-control" id="tel"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="coll" class="col-sm-2 control-label">
                                            学院
                                        </label>
                                        <input type="email" class="form-control" id="coll"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="email" class="col-sm-2 control-label">
                                            邮箱
                                        </label>
                                        <input type="email" class="form-control" id="email"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="spec" class="col-sm-2 control-label">
                                            专业
                                        </label>
                                        <input type="email" class="form-control" id="spec"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="class" class="col-sm-2 control-label">
                                            班级
                                        </label>
                                        <input type="email" class="form-control" id="class"/>
                                    </div>
                                    <div class="form-group">
                                        <label for="num" class="col-sm-2 control-label">
                                            学号
                                        </label>
                                        <input type="email" class="form-control" id="num"/>
                                    </div>


                                    <button type="submit" class="btn btn-default">
                                        注册
                                    </button>
                                </form>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="panel-addLotsOfUser">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4>直接将学生信息复制到下边的文本框中，每行代表一个学生，从左到右每列分别代表 <strong>姓名</strong> ;
                                    每列用tab隔开
                                </div>
                            </div>
                        </div>
                        <form role="form">
                            <div class="form-group">
                                <textarea class="form-control" rows="10"></textarea>
                            </div>
                            <button type="submit" class="btn btn-default">
                                批量注册
                            </button>
                        </form>
                    </div>
                    <div class="tab-pane" id="panel-userRoles">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4>直接将学生信息复制到下边的文本框中，每行代表一个学生，从左到右每列分别代表 <strong>姓名</strong> ;
                                    每列用tab隔开
                                </div>
                            </div>
                        </div>
                        <form role="form">
                            <div class="form-group">
                                <textarea class="form-control" rows="10"></textarea>
                            </div>
                            <button type="submit" class="btn btn-default">
                                批量注册
                            </button>
                        </form>
                    </div>
                    <div class="tab-pane" id="panel-labAdmins">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4>直接将学生信息复制到下边的文本框中，每行代表一个学生，从左到右每列分别代表 <strong>姓名</strong> ;
                                    每列用tab隔开
                                </div>
                            </div>
                        </div>
                        <form role="form">
                            <div class="form-group">
                                <textarea class="form-control" rows="10"></textarea>
                            </div>
                            <button type="submit" class="btn btn-default">
                                批量注册
                            </button>
                        </form>
                    </div>

                </div>
            </div>
        </div>
    </div>
</div>
</body>
</html>