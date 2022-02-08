<%--
  Created by IntelliJ IDEA.
  User: charlesaggasid
  Date: 2/7/22
  Time: 2:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Show Ads</title>
</head>
<body>
<div class="mainContainer">
    <h1>Showing Ads</h1>
    <c:forEach var="ad" items="${ads}">
        <div>
            <h3>${ad.title}</h3>
            <p>${ad.description}</p>
        </div>
    </c:forEach>
</div>
</body>
</html>
