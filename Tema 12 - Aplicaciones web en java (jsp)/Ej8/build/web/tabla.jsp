<%-- 
    Document   : tabla
    Author     : Francisco Javier Reina Benítez
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
  <head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Ejercicio 8</title>
  </head>
  <body>
    <%int numero = Integer.parseInt(request.getParameter("num")); %>
    <table>
    <%
      for (int i = 0; i < 11; i++) {
        %>
        <tr>
          <td><%out.print(numero); %> x <%out.print(i); %>=</td>
          <td><%out.print(numero * i); %></td>
        </tr>
        <%
      }
    %>
    </table>
  </body>
</html>
