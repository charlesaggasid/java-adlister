<%--
  Created by IntelliJ IDEA.
  User: charlesaggasid
  Date: 2/5/22
  Time: 1:12 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Guessed Number Result</title>
</head>
<body>

<c:choose>
    <%--@elvariable id="result" type="CorrectGuessServlet"--%>
    <c:when test="${result}">

        <h2>Random Number is: ${randomNumber}</h2>
        <h2>You pick number: ${guessedNum}</h2>
        <h2>You guessed the number correct.</h2>
    </c:when>

    <c:otherwise>
        <h2>Random Number is: ${randomNumber}</h2>
        <h2>You pick number: ${guessedNum}</h2>
        <h2>You guessed the number wrong.</h2>
    </c:otherwise>
</c:choose>

<a href="/guess">Play again?</a>

</body>
</html>
