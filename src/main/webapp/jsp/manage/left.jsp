<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/27
  Time: 下午9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http‐equiv="Content‐Type" content="text/html; charset=UTF‐8" />
    <title></title>
</head>
<body>
<h3>菜单项</h3>
<a href="${pageContext.request.contextPath}/jsp/manage/welcome.jsp" target="main">系统介绍</a>
<hr />
<a href="${pageContext.request.contextPath}/AdminShowServlet" target="main">管理员管理</a>
<hr />
<a href="${pageContext.request.contextPath}/StaffShowServlet" target="main">员工表管理</a>
<hr />
<a href="${pageContext.request.contextPath}/SalShowServlet" target="main">工资表管理</a>
<hr />
<a href="${pageContext.request.contextPath}/DeptShowServlet" target="main">部门表管理</a>
<hr />
<a href="${pageContext.request.contextPath}/deptAndStaffShowServlet" target="main">员工综合查看</a>
</body>
</html>
