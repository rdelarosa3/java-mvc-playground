<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/3/20
  Time: 11:20 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--jstl example--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <%! String title; %>
    <% title = "My title".toUpperCase(); %>
    <title><%= title %></title>
</head>
<body>
<%--JSP SECTION--%>
    <%@ include file="partials/navbar.jsp" %>
    <%--    GET DATA  --%>
    <h1>Welcome To The Site!</h1>
    <p>Path: <%= request.getRequestURL() %></p>
    <p>Query String: <%= request.getQueryString() %></p>
    <p>"name" parameter: <%= request.getParameter("name") %></p>
    <p>"method" attribute: <%= request.getMethod() %></p>
    <p>User-Agent header: <%= request.getHeader("user-agent") %></p>

    <%--    params method--%>
    <p>"name" parameter with EL: ${param.name}</p>
    <p>User-Agent header with EL: ${header["user-agent"]}</p>

    <%--    SET DATA--%>
    <% request.setAttribute("message", "Hello, World!"); %>
    <h3>${message}</h3>

<%--   JSTL SECTION--%>
    <c:choose>
        <c:when test="${param.name == 'Robert'}">
            <p>expression was true</p>
        </c:when>
    </c:choose>

    <% request.setAttribute("numbs", new int[]{1,2,3,4,5}); %>
    <c:forEach var="number" items="${numbs}">
        <li>${number}</li>
    </c:forEach>
</body>
</html>
