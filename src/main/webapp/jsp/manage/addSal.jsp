<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/12/6
  Time: 上午10:53
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>添加工资信息</title>
</head>
<body>
<form action="${pageContext.request.contextPath}/AddSal" method="post">
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">员工ID：</td>
<%--            <td width="300"><input type="text" name="staffId"/></td>--%>
            <td width="300">
                <label>
                    <select name="staffId">
                        <c:forEach items="${listForSalIds}" var="d">
                            <option value="${d}">${d}</option>
                        </c:forEach>
                    </select>
                </label>
            </td>

        </tr>
        <tr>
            <td width="125" height="35">基本工资：</td>
            <td width="300"><input type="text" name="salBase"/></td>
        </tr>
        <tr>
            <td width="125" height="35">奖金：</td>
            <td width="300"><input type="text" name="salComm"/></td>
        </tr>
        <tr>
            <td width="125" height="35">加班工资：</td>
            <td width="300"><input type="text" name="salExtra"/></td>
        </tr>
        <tr>
            <td width="125" height="35">代缴费用：</td>
            <td width="300"><input type="text" name="salDeduct"/></td>
        </tr>
        <tr>
            <td width="125" height="35">其他：</td>
            <td width="300"><input type="text" name="salElse"/></td>
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
