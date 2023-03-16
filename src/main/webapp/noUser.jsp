<%--
  Created by IntelliJ IDEA.
  User: Levan_Daraselia
  Date: 3/17/2023
  Time: 2:47 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<body>

<h1>The user you are trying to log in to doesn't exist.</h1>

<form action="login-Servlet">
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