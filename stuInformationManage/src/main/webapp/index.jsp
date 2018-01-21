<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/17
  Time: 9:31
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isELIgnored="false" contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>登录页面</title>
    <link rel="stylesheet" type="text/css" href="css/base.css"/>
    <style type="text/css">
        *{
            margin: 0px;
            padding: 0px;
            font-family: "microsoft yahei";/*设置所有样式字体为微软雅黑*/
        }
        body,html{
            width: 100%;
            background: url(images/login/login.jpg);
            background-repeat: no-repeat;
            background-position: center 0;
        }
        #main{
            width: 500px;
            height: 415px;
            position: absolute;
            left: 50%;
            top: 50%;
            margin-top: -210px;
            margin-left: -250px;
        }
        .title{
            text-align: center;
            width: 100%;
            font-size: 30px;
            color: #FFFFFF;
        }
        .form{
            width: 400px;
            height: 65%;
            background: black;
            border-radius: 10px;
            margin-top: 6px;
            text-align: center;
            padding: 50px 50px;
            filter:alpha(opacity=50);
            -moz-opacity:0.5;
            -khtml-opacity: 0.5;
            opacity: 0.5;
        }
        .form p{
            color: #FFFFFF;
        }
        .input{
            width: 100%;
            height: 45px;
            border: 1px solid rgb(57,114,247);
            border-radius: 5px;
            margin-top: 20px;
        }
        .raoid{
            float: left;
            font-size: 19px;
            margin-top: 20px;
            color: #FFFFFF;
            float: right;

        }
        .myButton{
            width: 400px;
            height: 48px;
            background: rgb(57,114,247);
            border-radius: 5px;
            line-height: 48px;
            color: #FFFFFF;
            position: absolute;
            left: 50px;
            bottom: 50px;
            text-align: center;
        }
        .fontDiv{
            width: 35px;
            height: 45px;
            line-height: 45px;
            float: left;
        }
        .input_text{
            width: 360px;
            height: 45px;
            float: left;
        }
        .input_text input{
            width: 100%;
            height: 80%;
            outline:none;
            border: 0px;
            background: black;
            font-size: 14px;
            margin-top: 5px;
            color: #FFFFFF;
        }
    </style>
</head>
<body>
<div id="main">
    <div class="title">
        <p>学生管理系统</p>
    </div>



    <div class="form">

        <p>用户登录</p>

        <div style="font-size: 18px;" >
            <c:if test="${param.rtype==1}">
                <p style="color: green">用户登陆成功!</p>
            </c:if>
            <c:if test="${param.rtype==-1}">
                <p style="color: red">用户名或密码错误!</p>
            </c:if>
        </div>

        <form method="post" action="usersAction/loginUsers" onsubmit="return checkout()">

            <div class="input">
                <div class="fontDiv">
                    <span class="icon">&#xe809;</span>
                </div>

                <div class="input_text">
                    <input name="u_name" type="text" placeholder="请输入用户名" id="user_name"/>
                </div>
            </div>
            <div class="input">
                <div class="fontDiv">
                    <span class="icon">&#xe822;</span>
                </div>
                <div class="input_text">
                    <input name="u_pwd" type="password" placeholder="请输入密码" id="user_pwd"/>
                </div>
            </div>

            <div class="raoid">
                <input type="radio" name="u_status"  checked="checked" value="2"/>学生&nbsp;&nbsp;
                <input type="radio" name="u_status"  value="1"/>管理员
            </div>
            <!--<div class="myButton">登&nbsp;录</div>-->
            <input class="myButton" type="submit" value="登&nbsp;&nbsp;录">
        </form>
    </div>
</div>
</body>
</html>
<script >
    function checkout() {
        var user_name=document.getElementById("user_name").value;
        var user_pwd=document.getElementById("user_pwd").value;
        if (user_name ==""){
            return false;
        }
        if (user_pwd ==""){
            return false;
        }
        else{
            return true;
        }
    }
</script>
