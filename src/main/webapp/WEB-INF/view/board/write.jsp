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
    <title>내게시판 작성</title>
</head>
<body>
<form:form commandName="post">
    <p>
        <label>게시판 :</label>
        <form:select path="board.id">
            <form:options items="${boards}" itemLabel="name" itemValue="id"/> <!-- board_id -->
        </form:select>
    </p>
    <p>
        <label>제목 :</label>
        <form:input path="title"/>
    </p>
    <p>
        <label>내용 :</label>
        <form:textarea path="contents" cols="50" rows="3"/>
    </p>
    <input type="submit" value="저장">
</form:form>
</body>
</html>
