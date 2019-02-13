<%@ taglib prefix="cr" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.2.1/css/bootstrap.min.css" integrity="sha384-GJzZqFGwb1QTTN6wy59ffF1BuGJpLSa9DkKMp0DgiMDm4iYMj70gZWKYbI706tWS" crossorigin="anonymous">
</head>
<body>
<h3>Employee Detail !!!</h3>
<cr:set var="name" value="${param.user}"/>
<cr:out value="${name}"/>
<cr:remove var="name"/>
<cr:out value="${name}"/>
<%--<table style="border: 2px solid aquamarine">--%>
    <%--<td>--%>
        <%--<td>Name</td>--%>
        <%--<td>Id</td>--%>
    <%--</td>--%>
    <%--<cr:forEach items="${items}" var="temp">--%>
    <%--<tr>--%>
        <%--<td><cr:out value="${temp.name}"/></td>--%>
        <%--<td><cr:out value="${temp.id}"/></td>--%>
    <%--</tr>--%>
    <%--</cr:forEach>--%>
<%--</table>--%>
<div class="container">
    <div class="row">
        <cr:forEach items="${items}" var="temp">
            <div class="shadow-lg p-3 mb-5 bg-white rounded">
                <div class="col-sm">
                    <div class="card" style="width: 18rem;">
                        <img src="img/pro.png" class="card-img-top" alt="Profile">
                        <div class="card-body">
                            <h5 class="card-title">Employee</h5>
                            <p class="card-text"><cr:out value="name: ${temp.name}"/><br/><cr:out value="id: ${temp.id}"/></p>
                            <a href="#" class="btn btn-primary">Go somewhere</a>
                        </div>
                    </div>
                </div>
            </div>
        </cr:forEach>
    </div>
</div>
<sql:setDataSource  var="dsn"
    url="jdbc:postgresql://localhost:5432/odoo8A2A"
    user="darapg"
    password="root"/>
<sql:query var="items" dataSource="${dsn}">
    select * from res_users ;
</sql:query>
<table class="table">
    <thead class="thead-dark">
        <tr>
            <th scope="col">ID</th>
            <th scope="col">Login</th>
            <th scope="col">Active</th>
        </tr>
    </thead>
    <tbody>
    <cr:forEach items="${items.rows}" var="item">
        <tr>
            <td><cr:out value="${item.id}"/></td>
            <td><cr:out value="${item.login}"/></td>
            <td><cr:out value="${item.active}"/></td>
        </tr>
    </cr:forEach>
    </tbody>
</table>
    </body>
</html>
