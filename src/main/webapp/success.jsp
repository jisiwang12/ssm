<%--
  Created by IntelliJ IDEA.
  User: mechrevo
  Date: 2019/8/30
  Time: 18:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="C" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
    <script src="js/jquery.js"></script>
</head>
<script>

</script>
<body>
<h3 id="h3">成功</h3><br/>
    <c:forEach items="${list}" var="user">
        ${user.username}
        ${user.sex}<br/>
        <hr>
    </c:forEach>
</body>
</html>
