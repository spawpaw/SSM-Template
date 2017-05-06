<%@ page import="com.spawpaw.ssmtemplate.common.config.Config" %>
<%--
  @author: 尚奔奔
  @date: 2017/5/6 13:49
  统一的js资源
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<% if (Config.USE_CDN) { %>
<% } else { %>
<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="<%=request.getContextPath()%>/public/js/jquery.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="<%=request.getContextPath()%>/public/js/jquery.md5.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap.min.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap-table.min.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap-editable.min.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap-table-zh-CN.min.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap-datetimepicker.min.js"></script>
<script src="<%=request.getContextPath()%>/public/js/bootstrap-datetimepicker.zh-CN.js"></script>
<% } %>