<%--
  Created by IntelliJ IDEA.
  User: Levan_Daraselia
  Date: 3/24/2023
  Time: 3:15 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<body>

<h1>Update your information</h1>

<form action="update-Servlet">

    <label for="email">Username/Email:</label>
    <input type="text" id="email" name="email" placeholder = "Enter email or username" required><br><br>

    <label for="paroli">Password:</label>
    <input type="password" id="paroli" name="paroli" placeholder = "Enter password" required><br><br>

    <label for="rparoli">Repeat Password:</label>
    <input type="password" id="rparoli" name="rparoli" placeholder = "Repeat password" required><br><br>

    <label for="firstname">Enter your name:</label>
    <input type="text" id="firstname" name="firstname" placeholder = "Enter your firstname"><br><br>

    <label for="surname">Enter your surname:</label>
    <input type="text" id="surname" name="surname" placeholder="Enter your surname"><br><br>

    <label for="proff">Enter your profession:</label>
    <input type="text" id="proff" name="proff" placeholder="Enter your profession"><br><br>



    <input type="submit" value="Update">
</form>
<br>

<a href="profile.jsp">Cancel</a>

</body>
</html>