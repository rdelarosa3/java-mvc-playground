<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/5/20
  Time: 11:01 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Show Ads</title>
</head>
<body>
<p>${name}</p>
    <c:forEach var="ad" items="${ads}">
        <div class="ad">
            <h2>${ad.title}</h2>
            <p>${ad.description}</p>
            <p>Ad# ${ad.id} Created by: ${ad.userId}</p>
        </div>
    </c:forEach>
</body>
</html>
