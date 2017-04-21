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
</head>
<body class="manage-body">
<%@include file="../../common/head_admin.jsp" %>

<!-- body -->
<div class="row manage">
    <%@include file="../../common/sidebar.jsp" %>
    <div class="col-xs-10 manage-container">

    </div>
</div>

<%@include file="../../common/foot.jsp" %>
<%@include file="../../common/js.jsp" %>
<script type="text/javascript">
    $(document).ready(
        function () {
            $("#identity").change(function () {
                if (3 == $("#identity").val()) {
                    $("#phone_box").hide();
                    $("#email_box").hide();
                    $("#college_box").hide();
                    $("#building_box").hide();
                    $("#laboratory_box").hide();
                    $("#phone").attr("disabled", "disabled");
                    $("#email").attr("disabled", "disabled");
                    $("#college").attr("disabled", "disabled");
                    $("#adminBuilding").attr("disabled", "disabled");
                    $("#adminLaboratory").attr("disabled", "disabled");
                    $("#major_box").show();
                    9
                    $("#stuNumber_box").show();
                    $("#class_box").show();
                    $("#major").removeAttr("disabled");
                    $("#stuNumber").removeAttr("disabled");
                    $("#class").removeAttr("disabled");
                } else if (2 == $("#identity").val()) {
                    $("#phone_box").show();
                    $("#email_box").show();
                    $("#college_box").show();
                    $("#major").attr("disabled", "disabled");
                    $("#stuNumber").attr("disabled", "disabled");
                    $("#class").attr("disabled", "disabled");
                    $("#adminBuilding").attr("disabled", "disabled");
                    $("#adminLaboratory").attr("disabled", "disabled");
                    $("#building_box").hide();
                    $("#laboratory_box").hide();
                    $("#class_box").hide();
                    $("#stuNumber_box").hide();
                    $("#major_box").hide();
                    $("#phone").removeAttr("disabled");
                    $("#email").removeAttr("disabled");
                    $("#college").removeAttr("disabled");
                } else if (1 == $("#identity").val()) {
                    $("#building_box").show();
                    $("#laboratory_box").show();
                    $("#adminBuilding").removeAttr("disabled");
                    $("#adminLaboratory").removeAttr("disabled");
                    $("#phone_box").hide();
                    $("#email_box").hide();
                    $("#college_box").hide();
                    $("#class_box").hide();
                    $("#stuNumber_box").hide();
                    $("#major_box").hide();
                    $("#major").attr("disabled", "disabled");
                    $("#stuNumber").attr("disabled", "disabled");
                    $("#class").attr("disabled", "disabled");
                    $("#phone").attr("disabled", "disabled");
                    $("#email").attr("disabled", "disabled");
                    $("#college").attr("disabled", "disabled");
                }
            });
        })
</script>
</body>
</html>