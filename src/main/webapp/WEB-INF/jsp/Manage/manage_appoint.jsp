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
        url: '/lab/svc/ssmtemplate/review/?curPage=' + '1' + '&pageSize=' + '100',
        method: 'GET',   //请求方式（*）
        toolbar: '#toolbar',  //工具按钮用哪个容器
        striped: true,   //是否显示行间隔色
        cache: false,   //是否使用缓存，默认为true，所以一般情况下需要设置一下这个属性（*）
        pagination: true,   //是否显示分页（*）
        sortable: false,   //是否启用排序
        sortOrder: "asc",   //排序方式
        sidePagination: "client",  //分页方式：client客户端分页，server服务端分页（*）
        pageNumber: 1,   //初始化加载第一页，默认第一页
        pageSize: 50,   //每页的记录行数（*）
        queryParams: function (param) {
            return {};
        },
        pageList: [10, 25, 50, 100], //可供选择的每页的行数（*）
        strictSearch: true,
        clickToSelect: true,  //是否启用点击选中行
        height: 650,   //行高，如果没有设置height属性，表格自动根据记录条数觉得表格高度
        uniqueId: "id",   //每一行的唯一标识，一般为主键列
        cardView: false,   //是否显示详细视图
        detailView: false,   //是否显示父子表
        columns: [{
            field: 'id',
            title: '序号'
        }, {
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
            title: '状态'
        }]
    });
</script>
</body>
</html>