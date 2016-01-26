<%-- 
    Document   : index
    Author     : Francisco Javier Reina Benítez
    Ejercicio 2 Tema 12

    Mejora el programa anterior de tal forma que la apariencia de la página web que muestra
el navegador luzca más bonita mediante la utilización de CSS (utiliza siempre ficheros
independientes para CSS para no mezclarlo con HTML).

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 2</title>
        <link rel="stylesheet" href="estilo.css">
    </head>
    <body>
        <%out.println("<b>Nombre: </b> Francisco Javier Reina Benítez"); %>
        <br>
        <%out.println("<b>Teléfono: </b> 638332638(no es real)"); %>
    </body>
</html>
