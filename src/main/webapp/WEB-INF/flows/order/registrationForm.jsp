<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Registration Form</title>
</head>
<body>
	<h2>Customer Registration</h2>
	<form:form commandName="customer">
		<input type="hidden" name="_flowExecutionKey" 
			value="${flowExecutionKey}">
		Name: <form:input  path="name"  /> <br/>
		Phone: <form:input  path="phoneNumber"  /> <br/> 
		<input type="submit"  name="_eventId_submit" value="Submit"/>
		<input type="submit"  name="_eventId_cancel" value="Cancel"/>
	</form:form>
</body>
</html>