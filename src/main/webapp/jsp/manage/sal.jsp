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
    <title>工资管理</title>
</head>
<body>
<div>
    <table style="text-align: center" border="3" width="1550">
        <tr>
            <td width="300">工资ID</td>
            <td width="300">员工ID</td>
            <td width="300">基本工资</td>
            <td width="300">奖金</td>
            <td width="300">加班工资</td>
            <td width="300">代缴费用</td>
            <td width="300">其他</td>
            <td width="300">总计</td>
            <td width="300">管理</td>
        </tr>
        <c:forEach items="${allSal}" var="sal">
            <tr>
                <td>${sal.salId}</td>
                <td>${sal.staffId}</td>
                <td>${sal.salBase}</td>
                <td>${sal.salComm}</td>
                <td>${sal.salExtra}</td>
                <td>${sal.salDeduct}</td>
                <td>${sal.salElse}</td>
                <td>${sal.salElse+sal.salComm+sal.salExtra-sal.salDeduct+sal.salBase}</td>
                <td>
                    <a href="${pageContext.request.contextPath}/SalAlterFz01Servlet?id=${sal.salId}">修改</a>
                    <a href="${pageContext.request.contextPath}/SalDelete?id=${sal.salId}">删除</a>
                </td>
            </tr>
        </c:forEach>
    </table>
    <div style="text-align: center">
        <a href="${pageContext.request.contextPath}/jsp/manage/addSal.jsp">添加</a>
    </div>
</div>
</body>
</html>
