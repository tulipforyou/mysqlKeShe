<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午7:33
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>添加管理员</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddAdmin" method="post">

    <!--
        border用来规定表格边框的宽度
        align表格在网页中的对齐方式
        cellpadding规定单元边缘和其中内容的空白大小
        cellspacing规定单元格之间的空白大小
    -->
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">管理员姓名：</td>
            <td width="300" ><input type="text" name="adminName"/></td>
        </tr>
        <tr>
            <td width="125" height="35">管理员密码：</td>
            <td width="300"><input type="text" name="adminPassword"/></td>
        </tr>
        <tr>
            <td width="125" height="35">注册日期:</td>
            <td width="300"><input type="text" name="adminSignDate" value="日期为当前时间" disabled/></td>
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
