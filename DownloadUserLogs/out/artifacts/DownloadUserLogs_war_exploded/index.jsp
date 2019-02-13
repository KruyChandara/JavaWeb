<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
  <title>$Title$</title>
</head>
<body>
<a href="ServletPerformEvent">First Servlet</a>
<form action="DownloadUserLogs" method="post">
  <label>
    Choose File type
    <select name="fileType">
      <option value="pdf">pdf</option>
      <option value="text">txt</option>
      <option value="doc">doc</option>
    </select>
  </label>
  <input type="submit" value="Get All Host Info">
</form>

  <form action="ServletPerformEvent" method="post">
      User:     <input type="text" name="user"/>
      Password: <input type="password" name="password"/>
    <input type="submit" value="submit">
  </form>

</body>
</html>
