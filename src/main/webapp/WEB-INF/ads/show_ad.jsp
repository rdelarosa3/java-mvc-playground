<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/13/20
  Time: 9:49 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title><c:out value="${ad.title}"/></title>
</head>
<body>
<div class="col-md-6">
    <h2><c:out value="${ad.title}"/></h2>
    <p><c:out value="${ad.description}"/></p>
<%--    <p><c:out value="${ad.getAuthor()}"/></p>--%>
<%--    <p><c:out value="${ad.getUser().email}"/> </p>--%>
</div>
</body>
</html>
