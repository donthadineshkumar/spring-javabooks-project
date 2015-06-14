<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Check Customer</title>
</head>
<body>

<form action="/books/order"  method="get">
	<input type="hidden" value="1" name="bookId"/>
	<button type="submit" >Order</button>
</form>

</body>
</html>