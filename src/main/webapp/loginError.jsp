<%--
  Created by IntelliJ IDEA.
  com.database.User: Levan_Daraselia
  Date: 3/13/2023
  Time: 6:08 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1>Either your password or email was incorrect, please try again</h1>

<form action="login-Servlet">
  <label for="user">Username/Email:</label>
  <input type="text" id="user" name="username" placeholder = "Enter email" required><br><br>
  <label for="paroli">Password:</label>
  <input type="password" id="paroli" name="paroli" placeholder = "Enter password"><br><br>
  <input type="submit" value="Sign in">
</form>
<br>

<a href="signUp.jsp">Sign up</a>

</body>
</html>
