<%-- 
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Ejercicio 7</title>
    </head>
    <body>
        <%
          double resultado = Double.parseDouble(request.getParameter("conv"));
          if (request.getParameter("tipo").equals("Euro")) {
            resultado = resultado * 166.386;
          } else {
            resultado = resultado * 0.006;
          }
          
          out.println(resultado);
        %>
    </body>
</html>
