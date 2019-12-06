<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午3:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>部门管理</title>
</head>
<body>
<div>
    <table style="text-align: center" border="3" width="1550">
        <tr>
            <td width="300">部门编号</td>
            <td width="300">部门名称</td>
            <td width="300">部门地址</td>
            <td width="300">管理</td>
        </tr>
        <c:forEach items="${allDepts}" var="dept">
            <tr>
                <td>${dept.deptId}</td>
                <td>${dept.deptName}</td>
                <td>${dept.deptAddr}</td>
                <td><a href="${pageContext.request.contextPath}/DeptAlterFz01Servlet?id=${dept.deptId}">修改</a>
                    <a href="${pageContext.request.contextPath}/DeptDelete?id=${dept.deptId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center">
        <a href="${pageContext.request.contextPath}/jsp/manage/addDept.jsp">添加</a>
    </div>
</div>
</body>
</html>
