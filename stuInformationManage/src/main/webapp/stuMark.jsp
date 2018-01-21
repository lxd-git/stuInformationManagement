<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/17
  Time: 21:02
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <%--<h1>学生成绩管理</h1>--%>
    <table border="1" width="100%">
        <tr>
            <th>编号</th><th>姓名</th><th>考试</th><th>语文</th><th>数学</th>
            <th>英语</th><th>体育</th><th>文综/理综</th>
            <th>总分</th>
        </tr>
        <c:forEach items="${studentMarkList}" var="stuMarkList" varStatus="ids">
        <tr>
            <td>${ids.count}</td><td>${stuMarkList[1].s_name}</td><td>${stuMarkList[0].sm_name}</td><td>${stuMarkList[0].sm_yw}</td><td>${stuMarkList[0].sm_sx}</td>
            <td>${stuMarkList[0].sm_yy}</td><td>${stuMarkList[0].sm_ty}</td><td>${stuMarkList[0].sm_zh}</td>
            <td>${stuMarkList[0].sm_yw+stuMarkList[0].sm_sx+stuMarkList[0].sm_yy+stuMarkList[0].sm_ty+stuMarkList[0].sm_zh}</td>
        </tr>
        </c:forEach>

</body>
</html>
