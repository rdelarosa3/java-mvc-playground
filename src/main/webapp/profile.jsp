<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page import="java.util.HashMap" %>
<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.Map" %>
<%--
  Created by IntelliJ IDEA.
  User: rdelarosa
  Date: 11/3/20
  Time: 2:07 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%! Map<String,String> userinfo = new HashMap<String,String>();%>
<%
    userinfo.put("name","robert");
    userinfo.put("age","30");
    userinfo.put("cohort","bash");
    request.setAttribute("map", userinfo);
%>


<html>
<head>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Profile Page"/>
    </jsp:include>

</head>
<body>
    <h1>Hello ${param.username}</h1>
    <table>
        <c:forEach var="entry" items="${param.map}">
            <tr>
                <td>Row1<c:out value="${entry.key}"/></td>
                <td>Row2<c:out value="${entry.value}"/> </td>
            </tr>
        </c:forEach> 
    </table>
    <jsp:include page="partials/js-partial.jsp"/>
</body>
</html>
