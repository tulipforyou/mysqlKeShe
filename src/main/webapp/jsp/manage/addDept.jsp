<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午7:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加部门项</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddDept" method="post">

    <!--
        border用来规定表格边框的宽度
        align表格在网页中的对齐方式
        cellpadding规定单元边缘和其中内容的空白大小
        cellspacing规定单元格之间的空白大小
    -->
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">部门名称：</td>
            <td width="300" ><input type="text" name="deptName"/></td>
        </tr>
        <tr>
            <td width="125" height="35">部门地址：</td>
            <td width="300"><input type="text" name="deptAddr"/></td>
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
