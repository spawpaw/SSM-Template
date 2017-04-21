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
    <div class="col-xs-1"></div>
    <div class="col-xs-10 wrap-appoint">
        <div class="appoint-container">
            <ul class="appoint-tabs">
                <li>
                    <input type="radio" name="appoint-tabs" id="appoint-tab1" checked/>
                    <label class="appoint-label" for="appoint-tab1">预约电脑</label>
                    <div id="appoint-tab-content1" class="tab-content">
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_building">选择楼栋：</label>
                            <select id="single_building" class="form-control">
                            </select>
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_laboratory">选择实验室：</label>
                            <select id="single_laboratory" class="form-control">
                            </select>
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_device">选择设备：</label>
                            <select id="single_device" class="form-control">
                            </select>
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_begin_time">开始时间：</label>
                            <input type="text" class="form-control" id="single_begin_time" placeholder="开始时间">
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_end_time">结束时间：</label>
                            <input type="text" class="form-control" id="single_end_time" placeholder="结束时间">
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="single_application">课程：</label>
                            <input type="text" class="form-control" id="single_application" placeholder="用途">
                        </div>
                        <br>
                        <div style="clear:both;margin-top: 150px;">
                            <button class="btn btn-default" style="margin-left: 82%" onclick="appoint(1)">申请预约</button>
                        </div>
                    </div>
                </li>
                <li>
                    <input type="radio" name="appoint-tabs" id="appoint-tab2"/>
                    <label for="appoint-tab2">预约实验室</label>
                    <div id="appoint-tab-content2" class="tab-content">
                        <div class="form-group appoint-group col-xs-2">
                            <label for="building">选择楼栋：</label>
                            <select id="building" class="form-control">
                            </select>
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="laboratory">选择实验室：</label>
                            <select id="laboratory" class="form-control">
                            </select>
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="begin_time">开始时间：</label>
                            <input type="text" class="form-control" id="begin_time" placeholder="开始时间">
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="end_time">结束时间：</label>
                            <input type="text" class="form-control" id="end_time" placeholder="结束时间">
                        </div>
                        <div class="form-group appoint-group col-xs-2">
                            <label for="application">课程：</label>
                            <input type="text" class="form-control" id="application" placeholder="用途">
                        </div>
                        <br>
                        <div style="clear:both;margin-top: 150px;">
                            <button class="btn btn-default" style="margin-left: 82%" onclick="appoint(2)">申请预约</button>
                        </div>
                    </div>
                </li>
            </ul>
        </div>
    </div>
    <div class="col-xs-1"></div>
</div>

<%@include file="../../common/foot.jsp" %>
<%@include file="../../common/js.jsp" %>
<script type="text/javascript">
    var appoint = function (num) {//预约
        var svcPrefix = "/lab/svc/";
        var url = svcPrefix + "ssmtemplate/";
        var viewPrefix = "/lab/appoint";
        var startTime;
        var endTime;
        var obj_appoint;
        if (num == 1) {
            obj_appoint = $("#single_device").val();
            startTime = (Date.parse(new Date($("#single_begin_time").val())));
            endTime = (Date.parse(new Date($("#single_end_time").val())));
        } else {
            obj_appoint = $("#laboratory").val();
            startTime = (Date.parse(new Date($("#begin_time").val())));
            endTime = (Date.parse(new Date($("#end_time").val())));
        }
        if (startTime >= endTime) {
            alert("开始时间不得大于结束时间");
            return;
        }
        var request = {
            startTime: startTime,
            endTime: endTime,
            resvEntityId: obj_appoint
        };
        $.ajax({
            type: "POST",
            url: url,
            contentType: "application/json",  //发送信息至服 务器时内容编码类型。
            dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
            data: JSON.stringify(request)
        }).success(function (data) {
            console.log(JSON.stringify(data));
            alert("预约成功！");
            window.location.href = viewPrefix;
        }).error(function (data) {
            alert("发生错误！");
        }).complete(function () {
        });
    };
    var getDevice = function (roomId) {//获取设备
        var svcPrefix = "/lab/svc/";
        var url = svcPrefix + "resvEntity/";
        document.getElementById('single_device').length = 0;
        $.ajax({
            type: "GET",
            url: url,
            contentType: "application/json",  //发送信息至服 务器时内容编码类型。
            dataType: "json",  // 预期服务器返回的数据类型。如果不指定，jQuery 将自动根据 HTTP 包 MIME 信息来智能判断，比如XML MIME类型就被识别为XML。
            data: "roomId=" + roomId
        }).success(function (data) {
            var obj_device = document.getElementById('single_device');
            obj_device.length = 0;
            if (data.length != 0) {
                for (var i = 0; i < data.length; i++) {
                    obj_device.options[i] = new Option(data[i].name, data[i].id);
                }
            }
        }).error(function (data) {
            alert("发生错误");
        }).complete(function () {
        });
    };
    $(document).ready(
        function () {//字典
            var svcPrefix = "/lab/svc/";
            var url = svcPrefix + "dic/";
            $.ajax({
                type: "GET",
                url: url
            }).success(function (data) {
                var changeLaboratory = function (building, name) {
                    var obj_laboratory = document.getElementById(name);
                    obj_laboratory.length = 0;
                    if (building.rooms.length != 0) {
                        for (var j = 0; j < building.rooms.length; j++) {
                            obj_laboratory.options[j] = new Option(building.rooms[j].room, building.rooms[j].id);
                        }
                    }
                };
                var obj_single_building = document.getElementById('single_building');
                for (var i = 0; i < data.buildings.length; i++) {
                    obj_single_building.options[i] = new Option(data.buildings[i].building, data.buildings[i].building);
                }
                var obj_building = document.getElementById('building');
                for (var i = 0; i < data.buildings.length; i++) {
                    obj_building.options[i] = new Option(data.buildings[i].building, data.buildings[i].building);
                }

//                initializ
                changeLaboratory(data.buildings[0], "laboratory");
                changeLaboratory(data.buildings[0], "single_laboratory");
                getDevice(data.buildings[0].rooms[0].id);

//                change
                $("#single_building").change(function () {
                    for (var i = 0; i < data.buildings.length; i++) {
                        if ($("#single_building").val() == data.buildings[i].building) {
                            changeLaboratory(data.buildings[i], "single_laboratory");
                            getDevice(data.buildings[i].rooms[0].id);
                        }
                    }
                });
                $("#single_laboratory").change(function () {
                    getDevice($("#single_laboratory").val());
                });
                $("#building").change(function () {
                    for (var i = 0; i < data.buildings.length; i++) {
                        if ($("#building").val() == data.buildings[i].building) {
                            changeLaboratory(data.buildings[i], "laboratory");
                        }
                    }
                });
            }).error(function (data) {
                console.log("error");
            });
        });
    var myDate = new Date();
    var nowTime = myDate.getFullYear() + "-" + (myDate.getMonth() + 1) + "-" + myDate.getDate();
    $('#single_begin_time').datetimepicker({
        format: 'yyyy-mm-dd hh:ii',
        autoclose: true,
        language: "zh-CN",
        startDate: nowTime
    });
    $('#single_end_time').datetimepicker({
        format: 'yyyy-mm-dd hh:ii',
        autoclose: true,
        language: "zh-CN",
        startDate: nowTime
    });
    $('#begin_time').datetimepicker({
        format: 'yyyy-mm-dd hh:ii',
        autoclose: true,
        language: "zh-CN",
        startDate: nowTime
    });
    $('#end_time').datetimepicker({
        format: 'yyyy-mm-dd hh:ii',
        autoclose: true,
        language: "zh-CN",
        startDate: nowTime
    });
</script>
</body>
</html>