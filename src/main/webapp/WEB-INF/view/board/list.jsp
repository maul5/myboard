<%--
  Created by IntelliJ IDEA.
  User: happy
  Date: 2016-07-10
  Time: 오후 11:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">

    <title>내게시판 목록</title>

    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<div class="panel panel-default">
    <div class="panel-heading">게시판</div>
    <div class="panel-body">
        게시판에 대한 설명
    </div>
    <table class="table table-hover">
        <thead>
            <tr>
                <th>#</th>
                <th>제목</th>
                <th>내용</th>
                <th>작성일</th>
            </tr>
        </thead>
        <tbody>
        <c:forEach var="p" items="${posts}" varStatus="stauts">
            <tr>
                <th scope="row">${p.id}</th>
                <th>${p.title}</th>
                <th>${p.contents}</th>
                <th>${p.wirteDate}</th>
            </tr>
        </c:forEach>
        </tbody>
    </table>

</div>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/jquery/jquery-1.12.4.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>
