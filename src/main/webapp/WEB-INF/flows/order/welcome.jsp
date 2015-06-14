<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>
<title>Welcome</title>
</head>
<body>

	<form:form>
	
		<!-- _flowExecutionKey is an hidden filed  acts a sort of the claim ticket -->
		
		<!-- this is passed along with the flow -->
		<input type="hidden" name="_flowExecutionKey" value="${flowExecutionKey}" />
		
		<input type="text" name="phoneNumber"/><br/>
		<!-- Observe the name of the submit button  -->
		<!-- prefixed with _eventId_ -->
		<!-- followed the event - when submit button is clicked - it trigger an event phoneEntered -->
		<!-- upon which there occurs a transition called lookupCustomer -->
		<input type="submit" name="_eventId_phoneEntered"/> 
		
	</form:form>


</body>
</html>