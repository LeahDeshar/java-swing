<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<!DOCTYPE html>
<html>
<head>
  <title>Registration Form</title>
</head>
<body>
<h1>Registration Form</h1>
<form action="registerServlet" method="post">
  <label for="username">Username:</label>
  <input type="text" id="username" name="username" required><br><br>

  <label for="email">Email:</label>
  <input type="email" id="email" name="email" required><br><br>

  <label for="password">Password:</label>
  <input type="password" id="password" name="password" required><br><br>

  <input type="submit" value="Register">
</form>
</body>
</html>
