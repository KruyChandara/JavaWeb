<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page errorPage="error.jsp" %>
<%--<%@ page autoFlush="true" %> &lt;%&ndash;auto clear buffer&ndash;%&gt;--%>
<%--<%@ page language="java" %>--%>
<%--<%@ page import="java.lang.String" %>--%>
<%--<%@ page extends="java.io.PrintWriter" %>--%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%!
    // Declaration: for declare variable and function

%>
<%--Expression: to display info--%>
<%--<%= add(1, 2) %>--%>
<%--Scriptlets : for writing logic has request and response object--%>
<%
    String name = request.getParameter("name");
    String password = request.getParameter("password");
    if (name.equals("Dara")){
        session.setAttribute("id","123");
        //page object
        pageContext.setAttribute("car", "BMW", PageContext.SESSION_SCOPE);
        response.sendRedirect("success");
    }
    else{
        throw new RuntimeException("Invalid Username");
    }
%>
</body>
</html>
<%--
page object can concert into : sesssion , contex, config ...
page object is class object, similar to "this "
use to add some context ot page , log file
log4J: use to log informaiton to server
Main Objective: A single Object can store/get value in all Scope
--%>

<%--
Page: use to config page such as language, import file
include: include components (JSP file with specific component) to program. e.g: <%@ include file = "some.jsp"
unlike css which is for static content only , JSP component can also generate dynamic data
%>
--%>