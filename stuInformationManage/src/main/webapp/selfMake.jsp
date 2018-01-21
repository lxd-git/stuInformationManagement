<%@ taglib prefix="s" uri="/struts-tags" %>
<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/17
  Time: 21:09
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%--<h2>用户自助管理</h2>--%>

    <h2>修改用户密码</h2>

    <div style="font-size: 18px">
        <c:if test="${param.rtype==1}">
            <p style="color: green">添加学生成功!</p>
        </c:if>
        <c:if test="${param.rtype==0}">
            <p style="color: red">添加学生失败!</p>
        </c:if>
        <c:if test="${param.rtype==2}">
            <p style="color: red">添加时数据不能为空!</p>
        </c:if>
    </div>

    <form method="post" action="usersAction/updateUsers?u_id=${loginUser.u_id}">
<%--        <input type="hidden" name="u_id">
        <input type="hidden" name="u_name">
        <input type="hidden" name="u_status">--%>
        新&nbsp;密码：<input type="password" name="u_pwd"><br/>
        确认密码：<input type="password" name=""><br/>
        <input type="submit" value="确认">
    </form>
</body>
</html>
