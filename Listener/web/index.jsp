<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <a href="ServletPerformEvent">First Servlet</a>
    <form action="DownloadUserLogs" method="post">
      <select name="fileType">
        <option value="pdf">pdf</option>
        <option value="text">text</option>
        <option value="doc">doc</option>
      </select>
      <input type="submit" value="Submit">
    </form>
  </body>
</html>
