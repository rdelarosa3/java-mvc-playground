<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/3/20
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%
    if(request.getMethod().equalsIgnoreCase("post")){
    if(request.getParameter("username").equalsIgnoreCase("admin") && request.getParameter("password").equals("password")) {
    response.sendRedirect("/profile.jsp?username="+request.getParameter("username"));
}}%>
<jsp:include page="partials/_css-partial.jsp" />
<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Login Page"/>
    </jsp:include>

</head>
<header>
    <div id="navbar">
        <jsp:include page="partials/_navbar-partial.jsp" />
    </div>
</header>

<body>
    <form method="POST" action="login.jsp">
        <label for="username">Username:</label>
        <input type="text" id="username" name="username" />
        <label for="password">Password:</label>
        <input type="text" id="password" name="password" placeholder="*******"/>
        <button type="submit">Submit</button>
    </form>
<jsp:include page="partials/js-partial.jsp"/>
</body>
</html>
