<%@ page import="java.util.List" %>
<%@ page import="dao.DeptHandle" %><%--
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
    <title>员工管理</title>
</head>
<body>
<div>
    <table style="text-align: center" border="3" width="1550">
        <tr>
            <td width="300">员工编号</td>
            <td width="300">员工姓名</td>
            <td width="300">员工职务</td>
            <td width="300">员工上司</td>
            <td width="300">员工入职日期</td>
            <td width="300">员工部门ID</td>
            <td width="300">管理</td>
        </tr>
        <c:forEach items="${allStaffs}" var="staff">
            <tr>
                <td>${staff.staffId}</td>
                <td>${staff.staffName}</td>
                <td>${staff.staffPost}</td>
                <td>${staff.staffBoss}</td>
                <td>${staff.staffHireDate}</td>
                <td>${staff.deptId}</td>
                <td><a href="${pageContext.request.contextPath}/StaffAlterFz01Servlet?id=${staff.staffId}">修改</a>
                    <a href="${pageContext.request.contextPath}/StaffDelete?id=${staff.staffId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center">
        <a href="${pageContext.request.contextPath}/jsp/manage/addStaff.jsp">添加</a>
    </div>
</div>
</body>
</html>
