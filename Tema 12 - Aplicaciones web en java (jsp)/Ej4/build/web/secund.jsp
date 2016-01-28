<%-- 
    Document   : secund
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 4</title>
    </head>
    <body>
        Tu nota media es: 
        <%int total = Integer.parseInt(request.getParameter("nota1")); %>
        <%total += Integer.parseInt(request.getParameter("nota2")); %>
        <%total += Integer.parseInt(request.getParameter("nota3")); %>
        <%out.print(total/3); %>
    </body>
</html>
