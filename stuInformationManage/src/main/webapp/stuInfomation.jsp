<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/17
  Time: 21:01
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="${pageContext.request.contextPath}/assets/js/jquery-1.10.2.js"></script>
<html>
<head>
    <title></title>
</head>
<body>
    <%--<h1>学生信息管理</h1>--%>

    <form method="post" action="${pageContext.request.contextPath}/studentAction/findStudentList_1">
        班级：<select name="sc.sc_no" id="studentClass_select">
        <option>请选择班级</option>
        </select>
        姓名：<input name="s_name">
        <input type="submit" value="查找">
    </form>
    <table border="1" width="100%">
        <tr>
            <th>编号</th><th>姓名</th><th>性别</th><th>班级</th>
            <th>年龄</th><th>邮箱</th><th>电话号码</th><th>入学时间</th><th>学生状态</th>
        </tr>
        <c:forEach items="${studentList}" var="stuList" varStatus="ids">
            <tr>
                <td>${ids.count}</td><td>${stuList[0].s_name}</td><td>${stuList[0].s_sex}</td><td>${stuList[1].sc_name}</td>
                <td>${stuList[0].s_age}</td><td>${stuList[0].s_mail}</td><td>${stuList[0].s_tel}</td><td>${stuList[0].s_onschool.toString().substring(0,10)}</td><td>${stuList[0].s_status==1?"正常":"休学"}</td>
            </tr>
        </c:forEach>
    </table>


</body>
</html>
<!--异步查询班级-->
<script type="text/javascript">
    function findStudentClassList() {
        $.get("${pageContext.request.contextPath}/studentClassAction/findStudentClassList","",function (data) {
            $.each(data,function (i,v) {
                var option="<option value="+v.sc_no+">"+v.sc_name+"</option>"
                $("#studentClass_select").append(option);
            })
        });
    }
    window.onload=findStudentClassList;
</script>

