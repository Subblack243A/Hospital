<%-- 
    Document   : Menu
    Created on : 5/10/2022, 4:46:15 p. m.
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
        <form action="Paciente.jsp">
            <label for="nombre">Nombre Paciente</label>
            <input type="text" name="nombre" id="nombre">
            <input type="submit" value="Bucar por Paciente">
        </form>
         <br><!-- Boton para buscar por Paciente -->
        <form action="Medico.jsp">
            <label for="medico">Medico</label>
            <input type="text" name="medico" id="medico">
            <input type="submit" value="Buscar por Medico">
        </form>
         <br><!-- Boton para Buscar por Medico -->
        <form action="Lugar.jsp">
            <label for="lugar">Lugar de Atencion</label>
            <input type="text" name="lugar" id="lugar">
            <input type="submit" value="Buscar por Lugar de Atencion">
        </form>
         <br><!-- Boton para Buscar por Luagar de Atencion -->
    </body>
</html>
