<%--
  Created by IntelliJ IDEA.
  com.database.User: Levan_Daraselia
  Date: 3/13/2023
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1>Register your account</h1>

<form action="registration-Servlet">
    <label for="email">Username/Email:</label>
    <input type="text" id="email" name="email" placeholder = "Enter email" required><br><br>

    <label for="firstname">Enter your name:</label>
    <input type="text" id="firstname" name="firstname" placeholder = "Enter your firstname"><br><br>

    <label for="surname">Enter your surname:</label>
    <input type="text" id="surname" name="surname" placeholder="Enter your surname"><br><br>

    <label for="proff">Enter your profession:</label>
    <input type="text" id="proff" name="proff" placeholder="Enter your profession"><br><br>

    <label for="paroli">Password:</label>
    <input type="password" id="paroli" name="paroli" placeholder = "Enter password" required><br><br>

    <label for="rparoli">Repeat Password:</label>
    <input type="password" id="rparoli" name="rparoli" placeholder = "Repeat password" required><br><br>

    <input type="submit" value="Register your account">
</form>
<br>

<a href="index.jsp">Already have an account?</a>

</body>
</html>