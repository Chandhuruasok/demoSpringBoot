<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@ page import="com.auction.demo.model.UserDetails"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
UserDetails input=(UserDetails) request.getAttribute("input");
%>
<form action="/update" method="post">
<label for="email">Email</label>
<input type="text" name="email" placeholder="Enter the email" value="<%=input.getEmail() %>" ><br>
<label for="username">UserName</label>
<input type="text" name="username" placeholder="Enter the username" pattern="[a-zA-Z]{4,}" value="<%=input.getUserName() %>" ><br>
<label for="password">Password</label>
<input type="text" name="password" placeholder="Enter the password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&]).{4,}" value="<%=input.getPassword() %>"><br>
<input type="hidden" name="action" value="update">
<input type="hidden" name="updateid" value="<%= input.getId() %>">
<button type="submit">Update</button>
</form>
</body>
</html>