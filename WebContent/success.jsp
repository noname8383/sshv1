<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ taglib prefix="s" uri="/struts-tags"%>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Accounts Page</title>
<%
	String role = (String)request.getAttribute("role");
%>

<script>
    function SubDelete() {
    	confirm("Are you sure delete this account?");
    }
</script>

</head>
<body>
	<font size="8"><b>Account Page</b></font></br>
<form id="account" method="post">
<table border="1" cellpadding="0" cellspacing="0" style="padding:5px;">
<tr>    
<td>ID</td>
<td>Account</td>
<td>UserName</td>  
<td>Password</td>
<td>Comment</td>
<td>Update</td>
<td>Delete</td>       
</tr>
<s:iterator value="accounts" status="li">
<tr> 
	<td><s:property value="id" /></td>
	<td><s:property value="account" /></td>
	<td><s:property value="username" /></td>
	<td><s:property value="password" /></td>
	<td><s:property value="comment" /></td>
	<% if(role != null & role.equals("A"))
      {    
     %>
     <td><s:a href="update.action?id=%{id}&role=%{role}">Update</s:a></td>
     <td><s:a href="accountdelete.action?id=%{id}&role=%{role}" onclick="return confirm('Confirm?')">Delete</s:a></td>
     <%} %>
</tr>
</s:iterator>
</table>
</form>
<form id="index" method="post" action="/index">
	<input type="submit" value="Back" />
</form>
<form id="add" method="post" action="/add">
	<input type="hidden" name="role" id="role" value="<%=role%>">
	<input type="submit" value="Add" />
</form>
<input type="hidden" name="role" id="role" value="<%=role%>">
</body>
</html>
