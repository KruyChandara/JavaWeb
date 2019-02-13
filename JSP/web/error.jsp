<%--
  Created by IntelliJ IDEA.
  User: dara3
  Date: 1/22/19
  Time: 2:18 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page isErrorPage="true"%>
<%--Predicate error page--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1>Error Page</h1>
<%= exception.getMessage()%>
</body>
</html>
