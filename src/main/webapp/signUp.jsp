<%--
  Created by IntelliJ IDEA.
  User: Levan_Daraselia
  Date: 3/13/2023
  Time: 4:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1>Register your account</h1>

<form action="/action_page.php">
    <label for="fname">Username/Email:</label>
    <input type="text" id="usrname" name="usrname" placeholder = "Enter email" required><br><br>
    <label for="fname">Enter your name:</label><br>
    <input type="text" id="fname" name="fname" placeholder= "Type in your name"><br>
    <label for="lname" Enter your last name></label>
    <input type="text" id="lname" name="lname" placeholder="Type in your lastname">
    <label for="lname">Password:</label>
    <input type="password" id="name" name="lname" placeholder = "Enter password" required><br><br>
    <label for="lname">Repeat Password:</label>
    <input type="password" id="rPassword" name="rPassword" placeholder = "Repeat password" required><br><br>
    <input type="submit" value="Register your account">
</form>
<br>

<a href="index.jsp">Already have an account?</a>

</body>
</html>