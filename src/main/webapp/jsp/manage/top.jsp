<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/27
  Time: 下午9:57
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <meta http‐equiv="Content‐Type" content="text/html; charset=UTF‐8" />
    <title></title>
</head>
<body>
<div style="text-align: center;background: aqua;width: auto;height: 70px">
    <span>当前登录用户是：${SuccessAdmin}</span>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span><a href="${pageContext.request.contextPath}/QuitServlet" target="first">点击退出</a></span>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="font-size: 50px">员工工资管理系统</span>
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
    <span style="font-size: 15px">
       登录时间是：${SuccessAdminAtTime}
    </span>
</div>
</body>

</html>
