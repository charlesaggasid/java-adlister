<%--
  Created by IntelliJ IDEA.
  User: charlesaggasid
  Date: 2/3/22
  Time: 1:20 PM
  To change this template use File | Settings | File Templates.
--%>
<%--Page directive--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--Put Java codes below--%>
<%
    if (request.getMethod().equalsIgnoreCase("post")) {
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        if (username.equals("admin") && password.equals("password")) {
            response.sendRedirect("/profile.jsp");
        }
    }
%>




<%--HTML CODES---------%>
<html>
<head>
    <title><%= "Java Adlister Login Page" %></title>

<%--Will create the head.jsp - --%>
    <jsp:include page="partials/head.jsp">
        <jsp:param name="title" value="Please Log In" />
    </jsp:include>
</head>
<body>

<%--Create navbar--%>
<jsp:include page="partials/navbar.jsp" />
<div class="container">
    <h1>Log In</h1>
    <form action="/login.jsp" method="POST">
        <div class="form-group">
            <label for="username">Username</label>
            <input id="username" name="username" class="form-control" type="text">
        </div>
        <div class="form-group">
            <label for="password">Password</label>
            <input id="password" name="password" class="form-control" type="password">
        </div>
        <input type="submit" class="btn btn-primary btn-block" value="Log In">
    </form>
</div>



</body>
</html>
