<%@page language="java" contentType="text/html; charset=utf-8" pageEncoding="utf-8"%>
<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>实验室管理</title>
</head>
<body>
<div class="container-fluid">
    <div class="row">
        <div class="col-md-12">
            <div class="tabbable" id="tabs-700746">
                <ul class="nav nav-tabs">
                    <li class="active">
                        <a href="#panel-showRooms" data-toggle="tab">查看教室</a>
                    </li>
                    <li>
                        <a href="#panel-addLotsOfRooms" data-toggle="tab">批量添加教室</a>
                    </li>
                </ul>
                <div class="tab-content">
                    <div class="tab-pane active" id="panel-showRooms">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4> 您可以选择条件来筛选教室，或修改教室信息
                                </div>

                                <div class="col-md-12">
                                    <table class="table">
                                        <thead>
                                        <tr>
                                            <th>
                                                #
                                            </th>
                                            <th>
                                                Product
                                            </th>
                                            <th>
                                                Payment Taken
                                            </th>
                                            <th>
                                                Status
                                            </th>
                                        </tr>
                                        </thead>
                                        <tbody>
                                        <tr>
                                            <td>
                                                1
                                            </td>
                                            <td>
                                                TB - Monthly
                                            </td>
                                            <td>
                                                01/04/2012
                                            </td>
                                            <td>
                                                Default
                                            </td>
                                        </tr>
                                        <tr class="active">
                                            <td>
                                                1
                                            </td>
                                            <td>
                                                TB - Monthly
                                            </td>
                                            <td>
                                                01/04/2012
                                            </td>
                                            <td>
                                                Approved
                                            </td>
                                        </tr>
                                        <tr class="success">
                                            <td>
                                                2
                                            </td>
                                            <td>
                                                TB - Monthly
                                            </td>
                                            <td>
                                                02/04/2012
                                            </td>
                                            <td>
                                                Declined
                                            </td>
                                        </tr>
                                        <tr class="warning">
                                            <td>
                                                3
                                            </td>
                                            <td>
                                                TB - Monthly
                                            </td>
                                            <td>
                                                03/04/2012
                                            </td>
                                            <td>
                                                Pending
                                            </td>
                                        </tr>
                                        <tr class="danger">
                                            <td>
                                                4
                                            </td>
                                            <td>
                                                TB - Monthly
                                            </td>
                                            <td>
                                                04/04/2012
                                            </td>
                                            <td>
                                                Call in to confirm
                                            </td>
                                        </tr>
                                        </tbody>
                                    </table>
                                    <ul class="pagination">
                                        <li>
                                            <a href="#">上一页</a>
                                        </li>
                                        <li>
                                            <a href="#">1</a>
                                        </li>
                                        <li>
                                            <a href="#">2</a>
                                        </li>
                                        <li>
                                            <a href="#">3</a>
                                        </li>
                                        <li>
                                            <a href="#">4</a>
                                        </li>
                                        <li>
                                            <a href="#">5</a>
                                        </li>
                                        <li>
                                            <a href="#">下一页</a>
                                        </li>
                                    </ul>
                                </div>
                            </div>
                        </div>
                    </div>
                    <div class="tab-pane" id="panel-addLotsOfRooms">
                        <div class="row">
                            <div class="col-md-12">
                                <div class="alert alert-success alert-dismissable">
                                    <button type="button" class="close" data-dismiss="alert" aria-hidden="true">
                                        ×
                                    </button>
                                    <h4>
                                        提示：
                                    </h4>直接将教室信息复制到下边的文本框中，每行代表一个教室，从左到右每列分别代表 <strong>教室名</strong> ;
                                    每列用tab隔开，例如
                                    <p>实B-204</p>
                                    <p>实B-205</p>
                                </div>
                            </div>
                        </div>
                        <form role="form">
                            <div class="form-group">
                                <textarea class="form-control" rows="10"></textarea>
                            </div>
                            <button type="submit" class="btn btn-default">
                                批量添加
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