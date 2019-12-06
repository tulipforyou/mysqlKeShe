<%--
  Created by IntelliJ IDEA.
  User: sunchaohui
  Date: 2019/11/30
  Time: 下午5:07
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>工资修改</title>
</head>
<body style="text-align: center">
<form action="${pageContext.request.contextPath}/SalAlterServlet">
    <table border="1" align="center" cellpadding="1" cellspacing="2" >
        <tr>
            <td width="125" height="35">工资ID：</td>
            <td width="300" ><input type="text" name="salId" value="${aSal.salId}" /></td>
        </tr>
        <tr>
            <td width="125" height="35">员工ID：</td>
<%--            <td width="300"><input type="text" name="staffId" value="${aSal.staffId}"/></td>--%>
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
            <td width="300"><input type="text" name="salBase" value="${aSal.salBase}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">奖金：</td>
            <td width="300"><input type="text" name="salComm" value="${aSal.salComm}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">加班工资：</td>
            <td width="300"><input type="text" name="salExtra" value="${aSal.salExtra}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">代缴费用：</td>
            <td width="300"><input type="text" name="salDeduct" value="${aSal.salDeduct}"/></td>
        </tr>
        <tr>
            <td width="125" height="35">其他：</td>
            <td width="300"><input type="text" name="salElse" value="${aSal.salElse}"/></td>
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
