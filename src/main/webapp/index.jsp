<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/24
  Time: 下午8:16
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>管理员登录</title>
    <link rel="stylesheet" type="text/css" href="css/css01.css"/>
</head>
<body>
<div id="top">
    <h1>企业工资管理系统</h1>
</div>
<div style="text-align: center;font-size: 20px">
    <h1>${msgAdmin}</h1>
</div>
<div id="login">
    <h2>Login</h2>
    <form method="post" action="${pageContext.request.contextPath}/LoginServlet">
        <label>
            <input type="text" required="required" placeholder="用户名" name="username"/>
            <div id="un">${registerInfo}</div>
        </label>
        <label>
            <input type="password" required="required" placeholder="密码" name="password"/>
        </label>
        <button class="but" type="submit">登录</button>
    </form>
    <p>没有账号？点击 <a href="jsp/register.jsp">注册</a>
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        &nbsp;&nbsp;&nbsp;&nbsp;&nbsp;
        <a href="jsp/reset.jsp">忘记密码</a>
    </p>

</div>
<div id="foot">
    <p>Designed by Sun Chaohui!</p>
</div>
</body>
</html>
