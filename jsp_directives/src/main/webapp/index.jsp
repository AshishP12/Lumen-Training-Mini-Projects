<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Library</title>

</head>
<body>
	<c:set var="title" value="Gandhi Library" scope="page"></c:set>

	<h1 style="text-align: centre; color: #0000ff">
		<c:out value="${title}"></c:out>

	</h1>

	<p>

		<%@ include file="menu.html"%>

	</p>

</body>
</html>