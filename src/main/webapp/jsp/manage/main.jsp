<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/27
  Time: 下午9:58
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <meta http‐equiv="Content‐Type" content="text/html; charset=UTF‐8" />
    <%--     防止重定向后css样式不能用--%>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
                request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">
    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/css02.css">
    <title>主页</title>
</head>
<body>
    <img src="${pageContext.request.contextPath}/img/wbq.jpg" width="1700" height="850" alt="图片丢失"/>
<div>
    <h1>
        欢迎使用企业工资管理系统
    </h1>
    <h2>
        V1.0
    </h2>
    <h3>
        <p>
            This is a free responsive designed by Sun Chaohui at HFUT at Nov. 30th 2019 .
            Download it on <a href="https://github.com/tulipforyou" target="_blank"><strong>github</strong></a>, customize and use it as you like!
        </p>
    </h3>


</div>
</body>

</html>
