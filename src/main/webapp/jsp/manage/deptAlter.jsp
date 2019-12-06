<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午4:10
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>部门修改</title>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/DeptAlterServlet">
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">部门ID：</td>
            <td width="300" ><input type="text" name="deptId" value="${aDept.deptId}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">部门名称：</td>
            <td width="300" ><input type="text" name="deptName" value="${aDept.deptName}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">部门地址：</td>
            <td width="300"><input type="text" name="deptAddr" value="${aDept.deptName}"/></td>
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
