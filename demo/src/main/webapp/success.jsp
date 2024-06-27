<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
  <%@ page import="com.auction.demo.model.UserDetails"%>
  <%@ page import="java.util.List"%>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<h1>success</h1>
<header>
<form  action="/Search" method="post">
            <input  type="text" name="search" placeholder="Search by name...">
            <button type="submit" title="search">Search</button>
          </form>
</header>
<table border="1">
<thead>
<tr>
<th>Id</th>
<th>Email</th>
<th>UserName</th>
<th>Password</th>
<th>Action</th>
<th>Action</th>
</tr>
</thead>
<tbody>
<%

List<UserDetails> array=(List<UserDetails>)request.getAttribute("view");

for(UserDetails input:array)
{
%>
	<tr>
	<td><%=input.getId() %></td>
	<td><%=input.getEmail() %></td>
	<td><%=input.getUserName() %></td>
	<td><%=input.getPassword() %></td>
	<td><form action="\delete" method="get">
	<input type="hidden" name="action" value="delete">
	<input type="hidden" name="deleteid" value="<%=input.getId() %>">
	 <button type="submit"  title="delete">Delete</button>
	</form>
	</td>
	<td><form action="\find" method="post">
	<input type="hidden" name="action" value="find">
	<input type="hidden" name="findid" value="<%=input.getId() %>">
	 <button type="submit"  title="update">update</button>
	</form>
	</td>
	</tr>
	<%
}
%>
</tbody>
</table>
</body>
</html>