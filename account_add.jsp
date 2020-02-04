<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome to Noname SSHV1 APP</title>

<style>
.error{background:#f00}
</style>
<script>
    function checkInput(o) {
        o.className = o.value == '' ? 'error' : '';
        return o.className == '';
    }
    function check(f) {
        var ok = true;
        if (!checkInput(f.account)) ok = false;
        if (!checkInput(f.userName)) ok = false;
        if (!checkInput(f.password)) ok = false;
        return ok;
    }
</script>
<%
	String role = (String)request.getAttribute("role");
%>
</head>
<body>
	<font size="8"><b>This is Account Add JSP</b></font>
	<br />
	<br />
    <form id="accountadd" method="post" action="accountadd" 	>
		<font size="6"><b>Account:  </b></font><input style="width:100px;height:20px" size="6" name="account" type="text" /><br />
		<br />
		<font size="6"><b>UserName:  </b></font><input style="width:100px;height:20px" size="6" name="username" type="text" /><br />
		<br />
		<font size="6"><b>Password:  </b></font><input style="width:100px;height:20px" size="6" name="password" type="text" /><br />
		<br />
		<font size="6"><b>Comment:  </b></font><input style="width:100px;height:20px" size="6" name="comment" type="text" /><br />
		<br />  
		<input id="role" name="role" type="hidden" value="<%=role%>">
		<input type="submit" value="Save" />
	</form>
</body>
</html>