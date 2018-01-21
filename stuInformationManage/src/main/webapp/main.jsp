<%--
  Created by IntelliJ IDEA.
  User: admin
  Date: 2018/1/17
  Time: 14:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" isELIgnored="false" language="java" %>
<html>
<head>
    <title>学生信息管理系统</title>
    <link href="assets/css/bootstrap.css" rel="stylesheet" />
    <!-- FONTAWESOME STYLES-->
    <link href="assets/css/font-awesome.css" rel="stylesheet" />
    <!-- CUSTOM STYLES-->
    <link href="assets/css/custom.css" rel="stylesheet" />
    <!-- GOOGLE FONTS-->
    <link href='http://fonts.googleapis.com/css?family=Open+Sans' rel='stylesheet' type='text/css' />
</head>


<body>

<!--==========Top导航栏===============-->

<div id="wrapper">
    <div class="navbar navbar-inverse navbar-fixed-top">
        <div class="adjust-nav">
            <div class="navbar-header">
                <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".sidebar-collapse">
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                    <span class="icon-bar"></span>
                </button>
                <a class="navbar-brand" href="javascript:void(0)">
                    <img src="assets/img/img.png" />

                </a>

            </div>

            <span class="logout-spn" >
                  <a href="#" style="color:#fff;">退出</a>

                </span>
        </div>
    </div>

    <!-- ==========lef的选着框============  -->

    <nav class="navbar-default navbar-side" role="navigation">
        <div class="sidebar-collapse">
            <ul class="nav" id="main-menu">


                <!-- ==========首页一============  -->
                <li class="active-link">
                    <a href="welcom.jsp" target="kuang"><i class="fa fa-desktop "></i>首页</a>
                </li>

                <!-- ==========学生信息管理============  -->
                <li>
                    <a href="studentAction/findStudentList" target="kuang"><i class="fa fa-table "></i>学生信息管理</a>
                </li>

                <!-- ==========添加学生基本信息（不包括，成绩、班级）============  -->
                <li>
                    <a href="addStudent.jsp" target="kuang"><i class="fa fa-qrcode "></i>添加信息</a>
                </li>

                <li>
                    <a href="studentAction/findStudentList2" target="kuang"><i class="fa fa-qrcode "></i>修改信息</a>
                </li>

                <!-- =====================学生成绩管理============  -->
                <li>
                    <a href="studentMarkAction/findStudentMarkList" target="kuang"><i class="fa fa-table "></i>学生成绩管理</a>
                </li>

                <!-- ==========成绩基本信息（不包括，成绩、班级）============  -->
                <li>
                    <a href="addStudentMark.jsp" target="kuang"><i class="fa fa-qrcode "></i>添加成绩</a>
                </li>

                <li>
                    <a href="studentMarkAction/findStudentMarkList2" target="kuang"><i class="fa fa-qrcode "></i>修改成绩</a>
                </li>

                <%--<!-- ==========导航页五============  -->--%>
                <%--<li>--%>
                    <%--<a href="#"><i class="fa fa-bar-chart-o"></i>导航页五</a>--%>
                <%--</li>--%>

                <!-- ==========导航页六============  -->
                <!-- ==========用户自助管理============  -->
                <li>
                    <a href="selfMake.jsp" target="kuang"><i class="fa fa-edit "></i>用户自助管理</a>
                </li>

                <li>
                    <a href="addUser.jsp" target="kuang"><i class="fa fa-qrcode "></i>添加用户</a>
                </li>


                <%--<!-- ==========导航页七============  -->--%>
                <%--<li>--%>
                    <%--<a href="#"><i class="fa fa-table "></i>导航页七</a>--%>
                <%--</li>--%>

                <%--<!-- ==========导航页八============  -->--%>
                <%--<li>--%>
                    <%--<a href="#"><i class="fa fa-edit "></i>导航页八</a>--%>
                <%--</li>--%>

            </ul>
        </div>

    </nav>

    <!-- 项目底部  -->
    <div class="copyrights">个人项目<a href="javascript:void(0)"  title="学生管理网站">学生管理</a></div>
    <div id="page-wrapper" >
        <div id="page-inner">
            <div class="row">
                <div class="col-lg-12">
                    <!--================center 管理员控制板==================-->
                    <h2>学生管理系统</h2>
                </div>
            </div>
            <!-- /. ROW  -->
            <hr />
            <div class="row">
                <div class="col-lg-12 ">
                    <div class="alert alert-info">
                        <!--================center 登录成功显示用户==================-->
                        <strong>欢迎你 [${loginUser.u_name}]${loginUser.u_status==1?"超级管理员":"学生账号"}
                        </strong> 开心过好每一天.
                    </div>

                </div>
            </div>

            <!-- 在这里写功能所有的内容  -->
            <iframe frameborder="no" src=""  style="width:100%; height:100%;"   name="kuang">
            </iframe>



            <!-- /. ROW  -->
        </div>
        <!-- /. PAGE INNER  -->
    </div>
    <!-- /. PAGE WRAPPER  -->
</div>
<div class="footer">


    <div class="row">
        <div class="col-lg-12" >
            &copy;  2018 lxd <a href="javascript:void(0)" target="_blank" title="个人项目">个人项目</a> - Collect from <a href="javascript:void(0)" title="学生信息管理系统" target="_blank">学生信息管理系统</a>
        </div>
    </div>
</div>


<!-- /. WRAPPER  -->
<!-- SCRIPTS -AT THE BOTOM TO REDUCE THE LOAD TIME-->
<!-- JQUERY SCRIPTS -->
<script src="assets/js/jquery-1.10.2.js"></script>
<!-- BOOTSTRAP SCRIPTS -->
<script src="assets/js/bootstrap.min.js"></script>
<!-- CUSTOM SCRIPTS -->
<script src="assets/js/custom.js"></script>


</body>
</html>
