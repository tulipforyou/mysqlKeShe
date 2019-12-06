<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午1:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>管理员管理</title>
</head>
<body>
<div>
    <table style="text-align: center" border="3" width="1550">
        <tr>
            <td width="300">管理员编号</td>
            <td width="300">管理员姓名</td>
            <td width="300">管理员密码</td>
            <td width="300">管理员注册日期</td>
            <td width="300">管理</td>
        </tr>
        <c:forEach items="${allAdmin}" var="admin">
            <tr>
                <td>${admin.adminId}</td>
                <td>${admin.adminName}</td>
                <td>${admin.adminPassword}</td>
                <td>${admin.adminSignDate}</td>
                <td><a href="${pageContext.request.contextPath}/AdminAlterFz01Servlet?id=${admin.adminId}">修改</a>
                    <a href="${pageContext.request.contextPath}/AdminDelete?id=${admin.adminId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center">
        <a href="${pageContext.request.contextPath}/jsp/manage/addAdmin.jsp">添加</a>
    </div>
</div>
</body>
</html>
