<%--
  Created by IntelliJ IDEA.
  User: mechrevo
  Date: 2019/8/30
  Time: 15:59
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<html>
<head>
    <title>SSM整合</title>
</head>
<body>
<h1>SSM案例整合</h1>
<a href="user/findAll">查找所有用户</a><br/>
<form action="${pageContext.request.contextPath}/user/addUser" method="get">
    用户名：<input type="text" name="username"><br>
   性别：<input type="radio" name="sex" checked value="男">男
    <input type="radio" name="sex" value="女">女<br/>
    <input type="submit" value="提交">
</form>
</body>
</html>
