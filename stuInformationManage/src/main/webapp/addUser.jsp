<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/19
  Time: 7:41
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h2>添加用户</h2>

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

    <form method="post" action="usersAction/addUsers">
        用户名：<input name="u_name"><br/>
        密&nbsp;码：<input type="password" name="u_pwd"><br/>
        身&nbsp;份：<select name="u_status">
                        <option value="2">学生</option>
                         <option value="1">管理员</option>
                     </select><br/>
        <input type="submit" value="添加"/>
    </form>
</body>
</html>
