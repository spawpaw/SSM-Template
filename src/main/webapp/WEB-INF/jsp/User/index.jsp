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
<body>
<%@include file="../../common/head_user.jsp" %>
<!-- body -->

<div class="row wrap">
    <div class="col-xs-4 wrap-announce">
        <img src="<%=request.getContextPath()%>/public/pic/rocket.svg">
    </div>
    <div class="col-xs-8">
        <div class="announce-container">
            <h2 class="announce-name">最新公告</h2>
            <p class="announce-text">
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
                计算机学院实验室开放啦！即日起，面向全体计算机学院学子，均可使用本网站进行电脑预约
            </p>
        </div>
    </div>
</div>
<%@include file="../../common/foot.jsp" %>
<%@include file="../../common/js.jsp" %>
<script type="text/javascript">
    $(document).ready(
        function () {
            var svcPrefix = "/lab/svc/";
            var url = svcPrefix + "dic/";
            $.ajax({
                type: "GET",
                url: url
            }).success(function (data) {
//                console.log(data);
//                define nonymous function
                var changeMajors = function (department) {
                    var obj_major = document.getElementById('major');
                    obj_major.length = 0;
                    if (department.majors.length != 0) {
                        for (var j = 0; j < department.majors.length; j++) {
                            obj_major.options[j] = new Option(department.majors[j].major, department.majors[j].major);
                        }
                    }
                };
                var changeClass = function (major) {
                    var obj_class = document.getElementById('class');
                    obj_class.length = 0;
                    if (major.mclasses.length != 0) {
                        for (var j = 0; j < major.mclasses.length; j++) {
                            obj_class.options[j] = new Option(major.mclasses[j], major.mclasses[j]);
                        }
                    }
                };
                var changeLaboratory = function (building) {
                    var obj_adminLaboratory = document.getElementById('adminLaboratory');
                    obj_adminLaboratory.length = 0;
                    if (building.rooms.length != 0) {
                        for (var j = 0; j < building.rooms.length; j++) {
                            obj_adminLaboratory.options[j] = new Option(building.rooms[j].room, building.rooms[j].room);
                        }
                    }
                };
                var obj_identity = document.getElementById('identity');
                for (var i = 0; i < data.roles.length - 1; i++) {
                    obj_identity.options[i] = new Option(data.roles[i], data.roles[i]);
                }
                var obj_college = document.getElementById('college');
                for (var i = 0; i < data.departments.length; i++) {
                    obj_college.options[i] = new Option(data.departments[i].department, data.departments[i].department);
                }
                var obj_adminBuilding = document.getElementById('adminBuilding');
                for (var i = 0; i < data.buildings.length; i++) {
                    obj_adminBuilding.options[i] = new Option(data.buildings[i].building, data.buildings[i].building);
                }

//                initializ
                changeMajors(data.departments[0]);
                changeClass(data.departments[0].majors[0]);
                changeLaboratory(data.buildings[0]);

//                define change function
                $("#college").change(function () {
                    for (var i = 0; i < data.departments.length; i++) {
                        if ($("#college").val() == data.departments[i].department) {
                            changeMajors(data.departments[i]);
                            changeClass(data.departments[i].majors[0]);
                            break;
                        }
                    }
                });
                $("#major").change(function () {
                    outerloop:
                        for (var i = 0; i < data.departments.length; i++) {
                            if ($("#college").val() == data.departments[i].department) {
                                for (var j = 0; j < data.departments[i].majors.length; j++) {
                                    if ($("#major").val() == data.departments[i].majors[j].major) {
                                        changeClass(data.departments[i].majors[j]);
                                        break outerloop;
                                    }
                                }
                            }
                        }
                });
                $("#adminBuilding").change(function () {
                    for (var i = 0; i < data.buildings.length; i++) {
                        if ($("#adminBuilding").val() == data.buildings[i].building) {
                            changeLaboratory(data.buildings[i]);
                        }
                    }
                });
            }).error(function (data) {
//                alert("发生错误！")
            });

//            initialize
            $("#email_box").hide();
            $("#building_box").hide();
            $("#laboratory_box").hide();
            $("#email").attr("disabled", "disabled");
            $("#adminBuilding").attr("disabled", "disabled");
            $("#adminLaboratory").attr("disabled", "disabled");

//            change
            $("#identity").change(function () {
                if ("学生" == $("#identity").val()) {
                    $("#userLabel").html("学号（作为帐号）");
                    $("#email_box").hide();
                    $("#building_box").hide();
                    $("#laboratory_box").hide();
                    $("#email").attr("disabled", "disabled");
                    $("#adminBuilding").attr("disabled", "disabled");
                    $("#adminLaboratory").attr("disabled", "disabled");
                    $("#class_box").show();
                    $("#major_box").show();
                    $("#college_box").show();
                    $("#major").removeAttr("disabled");
                    $("#class").removeAttr("disabled");
                    $("#college").removeAttr("disabled");
                } else if ("教师" == $("#identity").val()) {
                    $("#userLabel").html("电话（作为帐号）");
                    $("#building_box").hide();
                    $("#laboratory_box").hide();
                    $("#class_box").hide();
                    $("#major_box").hide();
                    $("#major").attr("disabled", "disabled");
                    $("#class").attr("disabled", "disabled");
                    $("#adminBuilding").attr("disabled", "disabled");
                    $("#adminLaboratory").attr("disabled", "disabled");
                    $("#email_box").show();
                    $("#college_box").show();
                    $("#email").removeAttr("disabled");
                    $("#college").removeAttr("disabled");
                } else if ("实验室管理员" == $("#identity").val()) {
                    $("#userLabel").html("电话（作为帐号）");
                    $("#email_box").hide();
                    $("#college_box").hide();
                    $("#class_box").hide();
                    $("#major_box").hide();
                    $("#major").attr("disabled", "disabled");
                    $("#class").attr("disabled", "disabled");
                    $("#email").attr("disabled", "disabled");
                    $("#college").attr("disabled", "disabled");
                    $("#building_box").show();
                    $("#laboratory_box").show();
                    $("#adminBuilding").removeAttr("disabled");
                    $("#adminLaboratory").removeAttr("disabled");
                }
            });
        })
</script>
</body>
</html>