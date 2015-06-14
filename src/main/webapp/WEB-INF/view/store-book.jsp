<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="s" %>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/2.1.4/jquery.min.js"></script>
<script src="http://ajax.aspnetcdn.com/ajax/jquery.validate/1.13.1/jquery.validate.min.js" ></script>
<title>New Book</title>
</head>
<body>

<s:form method="post" id="book-form" action="./book" commandName="book" >
	Title: <s:input path="name" /><s:errors  path="name"/> <br/>
	Author: <s:input path="authorName" /><s:errors  path="authorName"/><br/>
	Price: <s:input path="price" /><s:errors  path="price"/><br/>
	Desc: <s:input path="description" /><s:errors  path="description"/><br/>
	ISBN: <s:input path="isbn" /><s:errors  path="isbn"/><br/>
	<input type="submit" value="ADD" /> 
</s:form>

<script type="text/javascript">
	<!--Jquery validation plugin -->
	$("#book-form").validate(
		{
			rules:{
				name:{
					required : true,
					minlength : 3,
					// ajax request
					remote: {
						url: "<spring:url value='/books/available'  />",
						type: "get",
						data: {
							bookname : function(){
								return $("#name").val();
							}
						}
					}
				}
			},
			messages:{
				name:{
					 remote: "bookname already exists"
				}
			}
		}
	);
	

</script>

</body>
</html>