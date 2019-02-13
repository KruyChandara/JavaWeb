<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<%
    String car = (String) session.getAttribute("car");
    String name = request.getParameter("name");
    String id = (String) session.getAttribute("id");
    String color = config.getInitParameter("color");
    out.println("Welcome: "+name+'\n');
    out.println("id in session: "+id+'\n');
    out.println("color from init param (config): "+color+'\n');
    out.println(car);
%>
</body>
</html>
