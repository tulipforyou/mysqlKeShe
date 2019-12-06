<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="model.deptLinkStaff" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午8:32
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>员工综合管理</title>
</head>
<body>
<div>
    <table style="text-align: center" border="3" width="1550">
        <tr>
            <td width="300">部门编号</td>
            <td width="300">员工编号</td>
            <td width="300">员工姓名</td>
            <td width="300">员工职务</td>
            <td width="300">员工上司</td>
            <td width="300">员工入职日期</td>
            <td width="300">部门名称</td>
            <td width="300">部门地址</td>
            <td width="300">管理</td>
        </tr>
        <c:forEach items="${allDeptAndStaff}" var="das">
            <tr>
                <td>${das.dd.deptId}</td>
                <td>${das.sd.staffId}</td>
                <td>${das.sd.staffName}</td>
                <td>${das.sd.staffPost}</td>
                <td>${das.sd.staffBoss}</td>
                <td>${das.sd.staffHireDate}</td>
                <td>${das.dd.deptName}</td>
                <td>${das.dd.deptAddr}</td>
                <td><a href="${pageContext.request.contextPath}/AStaffByAllDeptAndStaff?id=${das.sd.staffId}">员工管理</a>
                </td>
            </tr>
        </c:forEach>
    </table>
<%--    <div style="text-align: center">--%>
<%--        <a href="${pageContext.request.contextPath}/jsp/manage/addAdmin.jsp">添加</a>--%>
<%--    </div>--%>
</div>
</body>
</html>
