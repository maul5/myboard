<%--
  Created by IntelliJ IDEA.
  User: happy
  Date: 2016-08-07
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

    <title>내게시판 작성</title>

    <link href="/bootstrap/css/bootstrap.min.css" rel="stylesheet">

    <!-- HTML5 shim and Respond.js for IE8 support of HTML5 elements and media queries -->
    <!-- WARNING: Respond.js doesn't work if you view the page via file:// -->
    <!--[if lt IE 9]>
    <script src="https://oss.maxcdn.com/html5shiv/3.7.3/html5shiv.min.js"></script>
    <script src="https://oss.maxcdn.com/respond/1.4.2/respond.min.js"></script>
    <![endif]-->
</head>
<body>
<form:form commandName="post">
    <div class="form-group">
        <label for="board.id">게시판 :</label>
        <form:select path="board.id" cssClass="form-control">
            <form:options items="${boards}" itemLabel="name" itemValue="id"/> <!-- board_id -->
        </form:select>
    </div>
    <div class="form-group">
        <label for="title">제목 :</label>
        <form:input path="title" cssClass="form-control"/>
    </div>
    <div class="form-group">
        <label for="contents">내용 :</label>
        <form:textarea path="contents" cssClass="form-control" cols="50" rows="3"/>
    </div>
    <input type="submit" class="btn btn-default" value="저장">
</form:form>

<!-- jQuery (necessary for Bootstrap's JavaScript plugins) -->
<script src="/jquery/jquery-1.12.4.min.js"></script>
<!-- Include all compiled plugins (below), or include individual files as needed -->
<script src="/bootstrap/js/bootstrap.min.js"></script>

</body>
</html>
