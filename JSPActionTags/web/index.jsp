<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
    <p>Hello From index jsp</p>
    <%--<jsp:forward page="Error.jsp"/>--%>
    <jsp:useBean id="objName" class="bean.BeanStudent" scope="session"/>
    <jsp:setProperty name="objName" property="name" value="Dara"/>
    <jsp:setProperty name="objName" property="id" value="123"/>
    <jsp:include page="Error.jsp">
        <jsp:param name="user" value="Dara"/>
    </jsp:include>

  </body>
</html>
