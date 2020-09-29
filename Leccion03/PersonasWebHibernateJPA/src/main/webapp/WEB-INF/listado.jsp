
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Personas</title>
    </head>
    <body>
        <table border="1">
            <caption>Listado de Personas</caption>
            <tr>
                <th>Id Personas</th>
                <th>Nombre</th>
                <th>Apellido</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            
            <c:forEach var="personas" items="${personas}">
                <tr>
                    <td>${personas.idPersona}</td>
                    <td>${personas.nombre}</td>
                    <td>${personas.apellido}</td>
                    <td>${personas.email}</td>
                    <td>${personas.telefono}</td>
                </tr>
            </c:forEach>
                       
        </table>
    </body>
</html>
