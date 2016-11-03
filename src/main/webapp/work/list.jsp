<%-- 
    Document   : list
    Created on : Nov 2, 2016, 11:45:10 AM
    Author     : Nitin Reddy
--%>

<%@page contentType="text/html" pageEncoding="windows-1252" import="java.util.List"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=windows-1252">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Work Orders</h1>
        <% 
            List<String> lsStr = (List<String>) request.getAttribute("lst");
            for(String iterStr : lsStr) {
        %>
        <p><%= iterStr %></p>
        <%
            }
        %>
    </body>
</html>
