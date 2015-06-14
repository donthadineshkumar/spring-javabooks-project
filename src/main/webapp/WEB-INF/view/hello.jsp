<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@ taglib uri="http://www.springframework.org/security/tags"
	prefix="security"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt"%>
<body>
	<h1><fmt:message  key="welcome.title"/>  </h1>
	<a href="./books/book"><fmt:message  key="add.book"/> </a> <br/>
	<a href="./books"><fmt:message  key="your.books"/> </a> <br/>
	<a href="./order"><fmt:message  key="call.flow"/> </a> <br/>
	
	Languages: <a href="?locale=en_us">English</a> | <a href="?locale=de_de">German</a> 

	<!-- when you are using csrf -logout allows should
	include the csrf token like this one -->

	<security:authorize access="isAuthenticated()">
		<form action="<spring:url value="/logout" />" method="post">
			<input type="submit" value="Log out" /> <input type="hidden"
				name="${_csrf.parameterName}" value="${_csrf.token}" />
		</form>
	</security:authorize>
</body>
