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
    <title>내게시판 목록</title>
</head>
<body>
<c:forEach var="p" items="${posts}" varStatus="stauts">
    ${p.id} | ${p.title} | ${p.wirteDate}<br>
</c:forEach>
</body>
</html>
