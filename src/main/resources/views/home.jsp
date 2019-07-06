<%--
  Created by IntelliJ IDEA.
  User: jeon
  Date: 19. 1. 20
  Time: 오후 6:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>HPP</title>
    <link rel="stylesheet" href="/static/bootstrap-3.3.2-dist/css/bootstrap.min.css"/>

    <script src="/static/bootstrap-3.3.2-dist/js/bootstrap.min.js"></script>
    <script src="http://code.jquery.com/jquery-2.1.1.min.js" type="text/javascript"></script>
</head>
<body>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <div class="navbar-header">
            <a class="navbar-brand" href="/">HPP</a>
        </div>
        <div>
            <ul class="nav navbar-nav">
                <li><a href="/login">login</a> </li>
            </ul>
            <ul class="nav navbar-nav">
                <li><a href="/user/add">user</a> </li>
            </ul>
            <ul class="nav navbar-nav">
                <li><a href="/set">workout</a> </li>
            </ul>
        </div>
    </div>
</nav>
</body>
</html>
