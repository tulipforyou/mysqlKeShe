<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/27
  Time: 下午9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>管理首页</title>
</head>
<!‐‐将原来的body换成frameset‐‐>
<frameset rows="80,*" border="2">
    <!‐‐noresize 表示不能修改框架的大小‐‐>
    <frame src="${pageContext.request.contextPath}/jsp/manage/top.jsp" noresize="noresize"/>
    <!‐‐下面又分成左右两个部分‐‐>
    <frameset cols="120, *">
        <frame src="${pageContext.request.contextPath}/jsp/manage/left.jsp" />
        <frame src="${pageContext.request.contextPath}/jsp/manage/main.jsp" name="main"/>
    </frameset>
</frameset>
</html>
