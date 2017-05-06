<%@ page import="com.spawpaw.ssmtemplate.common.config.Config" %>
<%--
  @author: 尚奔奔
  @date: 2017/5/6 13:49
  统一的css资源
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if (Config.USE_CDN) {
%>

<%
    }else {
%>

<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/public/css/bootstrap.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/public/css/style.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/public/css/bootstrap-datetimepicker.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/public/css/bootstrap-table.min.css">
<link rel="stylesheet" type="text/css" href="<%=request.getContextPath()%>/public/css/bootstrap-editable.css">
<%
    }
%>