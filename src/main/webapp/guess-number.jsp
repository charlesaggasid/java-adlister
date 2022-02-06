<%--
  Created by IntelliJ IDEA.
  User: charlesaggasid
  Date: 2/5/22
  Time: 12:41 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Guess Number 1,2,3</title>
</head>
<body>

<form action="/guess" method="post">
    <h3>Guess a number</h3>

    <input
    type="text"
    name="guessedNum"
    id="guessedNum"
    placeholder="Guess number between 1 and 3"
    style="width: 180px"
    >
    <br>
    <button>Submit</button>
</form>


</body>
</html>
