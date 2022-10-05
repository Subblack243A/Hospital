<%-- 
    Document   : Lugar
    Created on : 5/10/2022, 4:48:14 p. m.
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
        <%@page import="hospital.LugarAtencion" %>
        <%
            IBuscar b = new LugarAtencion();
            String nom;
            nom=b.buscar(request.getParameter("lugar"));
        %>
        <form action="Lugar.jsp">
            <label>Luagar de Atencion</label>
            <input type="text" name="lugar">
            <br><!-- Pedir Lugar de Atencion -->
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
