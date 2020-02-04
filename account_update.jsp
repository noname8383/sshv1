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
	String id = (String)request.getAttribute("id");
	String account = (String)request.getAttribute("account");
	String username = (String)request.getAttribute("username");
	String password = (String)request.getAttribute("password");
	String comment = (String)request.getAttribute("comment");
%>
</head>
<body>
	<font size="8"><b>This is Account Update JSP</b></font>
	<br />
	<br />
    <form id="accountupdate" method="post" action="/accountupdate" 	>
		<font size="6"><b>Account:  </b></font><input style="width:100px;height:20px" size="6" name="account" type="text" value="<%=account%>"/><br />
		<br />
		<font size="6"><b>UserName:  </b></font><input style="width:100px;height:20px" size="6" name="username" type="text" value="<%=username%>"/> <br />
		<br />
		<font size="6"><b>Password:  </b></font><input style="width:100px;height:20px" size="6" name="password" type="text" value="<%=password%>"/><br />
		<br />
		<font size="6"><b>Comment:  </b></font><input style="width:100px;height:20px" size="6" name="comment" type="text" value="<%=comment%>"/><br />
		<br />  
		<input id="role" type="hidden" name="role" value="<%=role%>">
		<input id="id" type="hidden" name="id" value="<%=id%>">
		<input type="submit" value="Update" />
	</form>
</body>
</html>