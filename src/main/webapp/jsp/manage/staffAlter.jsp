<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午4:26
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>员工修改</title>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/StaffAlterServlet">
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">员工ID：</td>
            <td width="300" ><input type="text" name="staffId" value="${aStaff.staffId}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">员工姓名：</td>
            <td width="300" ><input type="text" name="staffName" value="${aStaff.staffName}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">员工职务：</td>
            <td width="300"><input type="text" name="staffPost" value="${aStaff.staffPost}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">员工上司:</td>
            <td width="300"><input type="text" name="staffBoss" value="${aStaff.staffBoss}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">入职日期：</td>
            <td width="300">
                <input type="text" name="staffHireDate" value="${aStaff.staffHireDate}" disabled/>
            </td>
        </tr>
        <tr>
            <td width="125" height="35">所属部门ID：</td>
            <td width="300">
<%--                <input type="text" name="deptId"   value="${aStaff.deptId}"/>--%>
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
