<%@ page import="java.util.List" %>
<%@ page import="dao.DeptHandle" %><%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午7:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加员工</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddStaff" method="post">

    <!--
        border用来规定表格边框的宽度
        align表格在网页中的对齐方式
        cellpadding规定单元边缘和其中内容的空白大小
        cellspacing规定单元格之间的空白大小
    -->
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">员工姓名：</td>
            <td width="300" ><input type="text" name="staffName"/></td>
        </tr>
        <tr>
            <td width="125" height="35">员工职务：</td>
            <td width="300"><input type="text" name="staffPost"/></td>
        </tr>
        <tr>
            <td width="125" height="35">员工上司:</td>
            <td width="300"><input type="text" name="staffBoss"/></td>
        </tr>
        <tr>
            <td width="125" height="35">入职日期：</td>
            <td width="300">
                <input type="text" name="staffHireDate" value="入职日期为注册日期" disabled/>
            </td>
        </tr>
        <tr>
            <td width="125" height="35">所属部门ID：</td>
            <td width="300">
<%--                <input type="text" name="deptId"  />--%>
                <label>
                    <select name="deptId">
                        <c:forEach items="${listForStaffIds}" var="d">
                            <option value="${d}">${d}</option>
                        </c:forEach>
                    </select>
                </label>
            </td>
        </tr>
        <tr>
            <td width="125" height="35" colspan="2">
                <input type="submit" value="提交"/>
                <input type="reset" value="重置"/>
            </td>

        </tr>
    </table>
</form>
</body>
</html>
