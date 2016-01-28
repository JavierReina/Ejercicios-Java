<%-- 
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 5</title>
    </head>
    <body>
        <%int euro = Integer.parseInt(request.getParameter("euro")); %>
        <%out.print(euro); %>
         Euros son 
         <%out.print(euro * 166.386); %>
    </body>
</html>
