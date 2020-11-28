
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="fn" uri="http://java.sun.com/jsp/jstl/functions"%>

<html>
<head>
    <jsp:include page="/WEB-INF/partials/head.jsp">
        <jsp:param name="title" value="Viewing All The Ads" />
    </jsp:include>
</head>
<body>
<jsp:include page="/WEB-INF/partials/navbar.jsp" />

<div class="container">
    <h1>Here Are all the ads!</h1>

    <div class="row">

    <c:forEach items="${ads}" var="ad" varStatus="count" >

        <div class="col-md-6">
            <h2><c:out value="${ad.title}"/></h2>
            <p><c:out value="${ad.description}"/></p>
            <p><c:out value="${ad.getAuthor()}"/></p>
            <p><c:out value="${ad.getUser().email}"/> </p>
            <a href='/ads/ad?adId=<c:out value="${ad.id}"/>'>View Ad</a>
        </div>
    </c:forEach>
    </div>
    <div class="btn btn-info"><a href="/ads/create">New Ad</a> </div>
</div>


</body>
</html>
