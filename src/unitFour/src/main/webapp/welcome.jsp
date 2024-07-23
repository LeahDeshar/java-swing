<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
<h1>Welcome, ${sessionScope.username}!</h1>
<p>Your email is: ${sessionScope.email}</p>
</body>
</html>
