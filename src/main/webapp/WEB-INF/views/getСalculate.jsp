<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<jsp:useBean id="resp" scope="request" type="com.dev.dto.QuadraticEquationResponseDto"/>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Calculate</title>
</head>
<body>
<h2>a = ${resp.a} b =${resp.b} c = ${resp.c} d = ${resp.d}</h2>
<h2>${resp.roots}</h2>
<a href="/">back to calculate</a>
</body>
</html>
