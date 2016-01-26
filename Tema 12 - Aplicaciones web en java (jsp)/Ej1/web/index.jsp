<%-- 
    Document   : index
    Author     : Francisco Javier Reina Benítez
    Ejercicio 1

    Crea una aplicación web en Java que muestre tu nombre y tus datos personales por pantalla.
La página principal debe ser un archivo con la extensión jsp. Comprueba que se lanzan
bien el servidor y el navegador web. Observa los mensajes que da el servidor. Fíjate en la
dirección que aparece en la barra de direcciones del navegador.

--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 1</title>
    </head>
    <body>
        <%out.println("<b>Nombre: </b> Francisco Javier Reina Benítez"); %>
        <br>
        <%out.println("<b>Teléfono: </b> 638332638(no es real)"); %>
    </body>
</html>
