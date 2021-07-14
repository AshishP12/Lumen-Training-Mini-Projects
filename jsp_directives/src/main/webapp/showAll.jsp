<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    <%@include file="menu.html" %>
<!DOCTYPE html>
<html>
<head>
    <style>
        table{
            border:2px solid blue;
            border-collapse:collapse;
            margin-left:auto;
            margin-right:auto;
        }
        tr,th,td{
        border:2px solid blue;
        }
    </style>
<meta charset="ISO-8859-1">
<title>Show All Books</title>
</head>
<body>
<table>
    <tr>
        <th>Sl. No</th>
        <th>Book Name</th>
       
    </tr>
    <c:forEach items="${requestScope.bookList }" var="book" varStatus="status">
       
    <tr>
        <td><c:out value="${status.index+1 }"></c:out></td>
        <td><c:out value="${book}"></c:out></td>
   
    </tr>
        </c:forEach>
</table>
</body>
</html>