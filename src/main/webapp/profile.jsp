<%--
  Created by IntelliJ IDEA.
  com.database.User: Levan_Daraselia
  Date: 3/13/2023
  Time: 5:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Welcome to your page</title>
</head>
<body>
<h1> Welcome <%=request.getAttribute("firstname")%> <%=request.getAttribute("surname")%></h1>
<h3> Username: <%=request.getAttribute("email")%> </h3>
<h3> Name: <%=request.getAttribute("firstname")%></h3>
<h3> Surname: <%=request.getAttribute("surname")%> </h3>
<h3> Profession: <%=request.getAttribute("proff")%> </h3>

<a href="index.jsp"> Logout</a>

</body>
</html>
