<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Noname SSHV1 APP</title>
</head>
<body>
	<font size="8"><b>This is Noname SSHV1 APP</b></font>
	<br />
	<br />
    <form id="login" method="post" action="/login">
		<font size="6"><b>user:  </b></font><input style="width:100px;height:20px" size="6" name="userName" type="text" /><br />
		<br />
		<font size="6"><b>password:  </b></font><input style="width:100px;height:20px" size="6" name="password" type="password" /><br />
		<br /> 
		<input type="submit" value="Login" />
	</form>
</body>
</html>
