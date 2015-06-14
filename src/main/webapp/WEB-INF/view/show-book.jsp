<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
<style>	
.alt{
	background-color: #eee;	
}

.book-list{
	border: 3px solid #000;	
}
</style>

<!-- <link rel="StyleSheet" type="text/css" href="../css/bookshop.css"> -->
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script type="text/javascript">
	$(function(){
		$(".book-list tr:nth-child(odd)").addClass('alt');			
	});
</script>
</head>
<body>
	<p>Your Books</p>
	<br />
	<table class="book-list">
		<tr>
			<th>Book Title</th>
			<th>Author</th>
			<th>Price</th>
			<th></th>
		</tr>
		<c:forEach items="${books}" var="book">
			<tr>
				<td>${book.name}</td>
				<td>${book.authorName}</td>
				<td>${book.price}</td>
				<td><a href="<spring:url value='books/remove/${book.id}' />" >Remove</a></td>
				<%-- <td><a href="<spring:url value='books/update/${book.id}' />" >Update</a></td> --%>
				<td><a href="<spring:url value='books/book/${book.id}' />" >Edit</a></td>
				<td><a href="<spring:url value='books/order' />" >Order</a></td>
			</tr>
		</c:forEach>
	</table>
</body>
</html>
