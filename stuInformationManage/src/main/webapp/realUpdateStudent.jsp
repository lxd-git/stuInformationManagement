<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/21
  Time: 15:27
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title></title>
</head>
<body>
    <h2>修改单个学生信息</h2>

    <form method="post" action="">
        姓名：<input name="">  <br/>
        性别：<input type="radio" name="" value="男">男
            <input type="radio" name="" value="女">女    <br/>
        班级：<select name="">
                <option></option>
        </select>  <br/>
        年龄：<input name="">  <br/>
        邮箱：<input name="">  <br/>
        电话：<input name="">  <br/>
        入学时间：<input type="date" name="">  <br/>
        学生状态：<select name="">
                    <option ></option>
             </select>  <br/>
        <input type="submit" value="确认修改">
    </form>
</body>
</html>
