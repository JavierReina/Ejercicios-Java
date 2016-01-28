<%-- 
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 6</title>
    </head>
    <body>
        <%int peseta = Integer.parseInt(request.getParameter("peseta")); %>
        <%out.print(peseta); %>
        pesetas son: 
        <%out.print(peseta * 0.006); %>
         euros
    </body>
</html>
