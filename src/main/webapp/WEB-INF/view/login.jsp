<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Login</title>
</head>
<body>


<!--  A custom login page for spring bookshop app -->
<!--  Important Note : action should be /login only as it is the 
basic authentication -->
<form id="login-form" action="./login" method="post">
	
		Username: <input name="username" type="text" /><br/>
		Password: <input name="password" type="password" /><br/>
		<input type="hidden" name="${_csrf.parameterName}"  
				value="${_csrf.token}"/>
		<button type="submit">Log In</button>
	
</form>

</body>
</html>