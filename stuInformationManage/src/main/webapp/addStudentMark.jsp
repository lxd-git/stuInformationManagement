<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/18
  Time: 23:42
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
    <h2>添加学生成绩</h2>

    <div style="font-size: 18px">
        <c:if test="${param.rtype==1}">
            <p style="color: green">添加成绩成功!</p>
        </c:if>
        <c:if test="${param.rtype==0}">
            <p style="color: red">添加成绩失败!</p>
        </c:if>
        <c:if test="${param.rtype==2}">
            <p style="color: red">添加时数据不能为空!</p>
        </c:if>
    </div>

    <form method="post" action="studentMarkAction/addStudentMark">
        学生姓名：<select name="s.s_no" id="findStudent_select">
                    <option value="">选择需要录入的同学</option>
                 </select>      <br/>
        考&nbsp;&nbsp;试：<input name="sm_name"><br/>
        语&nbsp;&nbsp;文：<input name="sm_yw"><br/>
        数&nbsp;&nbsp;学：<input name="sm_sx"><br/>
        英&nbsp;&nbsp;语：<input name="sm_yy"><br/>
        体&nbsp;&nbsp;育：<input name="sm_ty"><br/>
        综&nbsp;&nbsp;合：<input name="sm_zh"><br/><br/>
        <input type="submit" value="添加成绩">
    </form>
</body>
</html>
<%--异步获取所有的学生名字--%>
<script type="text/javascript">
    function findStudentList() {
        $.get("studentMarkAction/findStudent","",function (data) {
            $.each(data,function (i,v) {
                var option="<option value="+v.s_no+">"+v.s_name+"</option>"
                $("#findStudent_select").append(option);
            })
        });
    }
    window.onload = findStudentList;
</script>
