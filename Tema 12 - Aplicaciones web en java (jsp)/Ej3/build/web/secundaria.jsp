<%-- 
    Document   : secundaria
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 3</title>
    </head>
    <body>
        Hola 
        <%out.println(request.getParameter("nombre")); %>
    </body>
</html>
