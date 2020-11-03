
<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/3/20
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<% if(!request.getParameter("username").equals("admin")) response.sendRedirect("/index.jsp"); %>
<html>
<head>
    <title>Profile</title>

</head>
<body>
    <h1>Hello ${param.username}</h1>
</body>
</html>
