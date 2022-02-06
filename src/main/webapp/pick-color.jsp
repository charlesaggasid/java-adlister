<%--
  Created by IntelliJ IDEA.
  User: charlesaggasid
  Date: 2/4/22
  Time: 4:31 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>
<head>
    <title>Pick Color</title>
</head>
<body>

<h1>Pick Color</h1>
//prompt user to enter fave color.
<form action="/pick-color" method="POST">
    <input type="text" name="color" id="color" placeholder="Choose background color">
    <button>Submit</button> //submit will redirect to view-color servlet
</form>

</body>
</html>

