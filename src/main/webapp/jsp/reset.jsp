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
    <title>密码重置</title>

    <%--     防止重定向后css样式不能用--%>
    <%
        String path = request.getContextPath();
        String basePath = request.getScheme() + "://" + request.getServerName() + ":" +
                request.getServerPort() + path + "/";
    %>
    <base href="<%=basePath%>">

    <link rel="stylesheet" type="text/css" href="<%=basePath%>css/css03.css"/>

    <script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-3.4.1.min.js"></script>
    <script type="text/javascript">

        $(function () {//网页加载完成后执行这个函数
            $("input[name='username']").blur(verifyUsername);  //username的input失去焦点后执行
        });
        function verifyUsername() {
            //$("input[name='username']").val();
            $.ajax({
                url:"${pageContext.request.contextPath}/UserNameServlet",
                type:"post",
                cache:false,
                dataType:"json",
                data:{
                    username:$("input[name='username']").val()
                },
                success:function (msg) {
                    if(!msg.isExist){
                        $("#un").html("<span style='color: #2b30bd; '>存在此用户</span>");
                    }else{
                        $("#un").html("<span style='color: red; '>用户名不存在</span>");
                    }
                }
            });
        }
    </script>

</head>
<body>
<div id="register">
    <h1>密码重置</h1>
</div>
<div id="login">
    <h2>Reset</h2>
    <form method="post" action="${pageContext.request.contextPath}/ResetServlet">
        <label>
            <input type="text" name="username" placeholder="用户名"/>
            <div id="un">${resetInfo}</div>
        </label>
        <label>
            <input type="password" required="required" placeholder="密码" name="password1"/>
        </label>
        <label>
            <input type="password" required="required" placeholder="验证密码" name="password2"/>
        </label>
        <button class="but" type="submit">注册</button>
    </form>
</div>
<div id="foot">
    <p>Designed by Sun Chaohui!</p>
</div>
</body>
</html>
