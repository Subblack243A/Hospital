<%-- 
    Document   : Nombre
    Created on : 5/10/2022, 4:47:00 p. m.
    Author     : lelp8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
         <h1>Hospital</h1>
        <%@page import="hospital.IBuscar" %>
        <%@page import="hospital.Nombre" %>
        <%
            IBuscar b = new Nombre();
            String nom;
            nom=b.buscar(request.getParameter("nombre"));
        %>
        <form action="Paciente.jsp">
            <label>Nombre del Paciente</label>
            <input type="text" name="nombre">
            <br><!-- Padir Nombre del Paciente -->
            <input type="submit" value="Buscar">
        </form>
        <br><!-- Volver al Menu -->
        <form action="Menu.jsp">
            <input type="submit" value="Menu">
        </form>
        <p>Datos encontrados:</p>
        <br><!-- Imprime Datos Paciente -->
        <p><%=nom%></p>
    </body>
</html>
