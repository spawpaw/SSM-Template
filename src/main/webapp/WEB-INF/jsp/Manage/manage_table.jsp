<%--
  Created by IntelliJ IDEA.
  User: 陈文航
  Date: 2017/4/18 0018
  Time: 21:16
  To change this template use File | Settings | File Templates.
--%>
<%@page language="java" contentType="text/html;charset=UTF-8" pageEncoding="utf-8" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- The above meta must be placed in the front  -->
    <title>计算机学院实验室</title>
    <%@include file="../../common/css.jsp" %>
    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://cdn.bootcss.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://cdn.bootcss.com/respond.js/1.4.2/respond.min.js"></script>
    <![endif]-->
    <!-- Latest compiled and minified CSS -->

</head>
<body class="manage-body">
<%@include file="../../common/head_admin.jsp" %>

<!-- body -->
<div class="row manage">
    <%@include file="../../common/sidebar.jsp" %>
    <div class="col-xs-10 manage-container">
        <table id="table_appoint"></table>
    </div>
</div>

<%@include file="../../common/foot.jsp" %>
<%@include file="../../common/js.jsp" %>
<script type="text/javascript">
    $('#table_appoint').bootstrapTable({
        url: '/lab/svc/ssmtemplate/review/?curPage=' + '1' + '&pageSize=' + '10',
        columns: [{
            field: 'building',
            title: '楼栋'
        }, {
            field: 'room',
            title: '实验室'
        }, {
            field: 'entityName',
            title: '设备名'
        }, {
            field: 'statues',
            title: '待审核'
        }]
    });
</script>
</body>
</html>