<%@ page contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html>
<body>

<h1>Welcome</h1>

<form action="login-Servlet">
    <label for="ragacasaxeli">Username/Email:</label>
    <input type="text" id="ragacasaxeli" name="ragacasaxeli" placeholder = "Enter email" required><br><br>
    <label for="paroli">Password:</label>
    <input type="password" id="paroli" name="paroli" placeholder = "Enter password"><br><br>
    <input type="submit" value="Sign in">
</form>
<br>

<a href="signUp.jsp">Register now</a>

</body>
</html>