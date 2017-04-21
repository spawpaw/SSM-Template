<%--
  Created by IntelliJ IDEA.
  User: 陈文航
  Date: 2017/4/20 0020
  Time: 16:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html lang="zh-cn">
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

    <style type="text/css">* {
        padding: 0;
        margin: 0;
    }

    div {
        padding: 4px 48px;
    }

    body {
        background: #fff;
        font-family: "微软雅黑";
        color: #333;
        font-size: 24px
    }

    h1 {
        font-size: 100px;
        font-weight: normal;
        margin-bottom: 12px;
    }

    p {
        line-height: 1.8em;
        font-size: 36px
    }

    a, a:hover {
        color: blue;
    }</style>
</head>
<body>
<div style="padding: 24px 48px;"><h1>:(</h1>
    <p>您尚未登录或登录已过期，该功能需登陆后使用！</p><br>
    <br>
    <div style="font-size: 20px;">
        <form id="form1">
            &nbsp;&nbsp;&nbsp; &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
            <span id='div1'>
            </span>
            <span>秒后跳转</span>
        </form>
    </div>
</div>
</body>
</html>
<script type="text/javascript">
    //设定倒数秒数
    var t = 4;
    //显示倒数秒数
    function showTime() {
        t -= 1;
        document.getElementById('div1').innerHTML = t;
        if (t == 0) {
            location.href = '/lab/index';
        }
        //每秒执行一次,showTime()
        setTimeout("showTime()", 1000);
    }


    //执行showTime()
    showTime();
</script>