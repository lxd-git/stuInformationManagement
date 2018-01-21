<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/18
  Time: 23:42
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title></title>
</head>
<body>
    <h2>修改学生信息</h2>
    <table border="1" width="100%">
        <tr>
            <th>编号</th><th>姓名</th><th>性别</th><th>班级</th>
            <th>年龄</th><th>邮箱</th><th>电话号码</th><th>入学时间</th><th>学生状态</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${studentList2}" var="stuList" varStatus="ids">
            <tr>
                <td>${ids.count}</td><td>${stuList[0].s_name}</td><td>${stuList[0].s_sex}</td><td>${stuList[1].sc_name}</td>
                <td>${stuList[0].s_age}</td><td>${stuList[0].s_mail}</td><td>${stuList[0].s_tel}</td><td>${stuList[0].s_onschool.toString().substring(0,10)}</td><td>${stuList[0].s_status==1?"正常":"休学"}</td>
                <td width="90px"><button onclick="student_update(${stuList[0].s_no})">修改</button><button onclick="student_delete(${stuList[0].s_no})">删除</button></td>
            </tr>
        </c:forEach>

    </table>

</body>
</html>
<script type="text/javascript">
    function student_delete(sno) {
        confirm("确认删除？")
        location="${pageContext.request.contextPath}/studentAction/deleteStudent?s_no="+sno;
    }
    <%--function student_update(sno) {--%>
        <%--location="${pageContext.request.contextPath}/realUpdateStudent.jsp?s_no="+sno;--%>
    <%--}--%>
</script>
