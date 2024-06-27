<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h2>Welcome to home page</h2>
<form action="/login" method="post">
<label for="email">Email</label>
<input type="text" name="email" placeholder="Enter the email" required><br>
<label for="username">UserName</label>
<input type="text" name="username" placeholder="Enter the username" pattern="[a-zA-Z]{4,}" required><br>
<label for="password">Password</label>
<input type="text" name="password" placeholder="Enter the password" pattern="(?=.*\d)(?=.*[a-z])(?=.*[A-Z])(?=.*[@#&]).{4,}" required><br>
<input type="submit" name="action" value="submit">
</form>
</body>
</html>