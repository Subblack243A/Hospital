<%-- 
    Document   : Medico
    Created on : 5/10/2022, 4:48:27 p. m.
    Author     : lelp8
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Hospital</title>
    </head>
    <body>
        <h1>Hospital</h1>
        <%@page import="hospital.IBuscar" %>
        <%@page import="hospital.Medico" %>
        <%
            IBuscar b = new Medico();
            String nom;
            nom=b.buscar(request.getParameter("medico"));
        %>
        <form action="Medico.jsp">
            <label>Medico</label>
            <input type="text" name="medico">
            <br><!-- Padir Nombre del Medico -->
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
