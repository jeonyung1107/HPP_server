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
<div class="container">
    <div class="jumbotron">
        <div class="form-group center-block" style="width: 300px">
            <form action="/user/add" method="post">
                <input class="form-control" type="text" name="id" placeholder="ID"/>
                <input class="form-control" type="password" name="password" placeholder="Password"/>
                <input class="btn btn-primary btn-block" type="submit" value="생성"/>
                <input type="hidden" name="${_csrf.parameterName}" value="${_csrf.token}"/>
            </form>
        </div>
    </div>
</div>
</body>
</html>
