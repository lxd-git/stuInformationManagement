<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/18
  Time: 20:51
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<script src="assets/js/jquery-1.10.2.js"></script>
<html>
<head>
    <title></title>
</head>
<body>
    <%--<h1>添加学生，我们这里不是单纯的添加学生还要分配班级（成绩不做分配）</h1>--%>
    <h2>添加学生信息</h2>

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

    <form method="post" action="studentAction/addStudent">
        学生姓名：<input name="s_name">  <br/>
        班&nbsp;&nbsp;级：<select name="sc.sc_no" id="studentClass_select">
                            <option value="">请选择班级</option>
                        </select> <br/>
        性&nbsp;&nbsp;别：<input type="radio" name="s_sex" value="男" checked>男
                            <input type="radio" name="s_sex" value="女">女<br/>
        年&nbsp;&nbsp;龄：<input name="s_age">  <br/>
        邮&nbsp;&nbsp;箱：<input name="s_mail">  <br/>
        电&nbsp;&nbsp;话：<input name="s_tel">  <br/>
        入学时间：<input type="date" name="s_onschool">  <br/><br/>
        <input type="submit" value="添加学生">
    </form>
</body>
</html>
<!--异步查询班级-->
<script type="text/javascript">
    function findStudentClassList() {
        $.get("studentClassAction/findStudentClassList","",function (data) {
            $.each(data,function (i,v) {
                var option="<option value="+v.sc_no+">"+v.sc_name+"</option>"
                $("#studentClass_select").append(option);
            })
        });
    }
    window.onload=findStudentClassList;
</script>

