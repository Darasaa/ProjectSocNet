<%--
  Created by IntelliJ IDEA.
  User: Levan_Daraselia
  Date: 3/16/2023
  Time: 7:28 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>

<h1>User already exists</h1>

<form action="registration-Servlet">
  <label for="user">Username/Email:</label>
  <input type="text" id="user" name="username" placeholder = "Enter email" required><br><br>
  <label for="paroli">Password:</label>
  <input type="password" id="paroli" name="paroli" placeholder = "Enter password" required><br><br>
  <input type="submit" value="Sign in">
</form>
<br>

<a href="signUp.jsp">Register now</a>

</body>
</html>
