<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Error</title>
</head>
<body>
    <h1>Error Page</h1>
    <p>Expression language to display param: ${param.user}</p>
    <jsp:useBean id="objName" class="bean.BeanStudent" scope="session"/>
    <jsp:getProperty name="objName" property="name"/>
    <%--<p>${objName.id}</p>--%>
    <%--<p>${objName.name}</p>--%>
</body>
</html>
