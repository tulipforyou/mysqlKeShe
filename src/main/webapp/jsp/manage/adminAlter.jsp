<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午2:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理员信息修改</title>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/AdminAlterServlet">
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">管理员ID：</td>
            <td width="300" ><input type="text" name="adminId" value="${aAdmin.adminId}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">管理员姓名：</td>
            <td width="300" ><input type="text" name="adminName" value="${aAdmin.adminName}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">管理员密码：</td>
            <td width="300"><input type="text" name="adminPassword" value="${aAdmin.adminPassword}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">注册日期:</td>
            <td width="300"><input type="text" name="adminSignDate"  value="${aAdmin.adminSignDate}" disabled/></td>
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
