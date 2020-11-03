<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/3/20
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
    <form method="POST" action="profile.jsp">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" />
        <label for="pswrd">Password:</label>
        <input type="text" id="pswrd" name="pswrd" placeholder="*******"/>
        <button type="submit">Submit</button>
    </form>
</body>
</html>
