<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<nav class="navbar navbar-default">
    <div class="container-fluid">
        <!-- Brand and toggle get grouped for better mobile display -->
        <div class="navbar-header">
            <a class="navbar-brand" href="/ads">Adlister</a>
        </div>
        <ul class="nav navbar-nav navbar-right">
            <c:choose>
            <c:when test="${sessionScope.isLoggedIn == null || sessionScope.isLoggedIn == false}">
            <li><a href="/login">Login</a></li>
            </c:when>
<%--            show logout only if user is logged in--%>
            <c:when test="${sessionScope.isLoggedIn == true}">
            <li><a href="/logout">Logout</a></li>
            </c:when>
            </c:choose>
        </ul>
    </div><!-- /.navbar-collapse -->
    </div><!-- /.container-fluid -->
</nav>