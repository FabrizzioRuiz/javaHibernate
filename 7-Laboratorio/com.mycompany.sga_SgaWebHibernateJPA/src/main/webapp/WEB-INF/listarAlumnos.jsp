<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Listado de Alumnos</title>
    </head>
    <body>
        <table border="1">
            <caption>
                Listar Alumnos
            </caption>
            <tr>
                <th>Alumno ID</th>
                <th>Nombre</th>
                <th>Domicilio</th>
                <th>Email</th>
                <th>Telefono</th>
            </tr>
            
            <c:forEach var="alumno" items="${alumnos}">
                <tr>
                    <td>${alumno.idAlumno}</td>
                    <td>${alumno.nombre} ${alumno.apellido}</td>
                    <td>${alumno.domicilio.calle} ${alumno.domicilio.numCalle} ${alumno.domicilio.pais}</td>
                    <td>${alumno.contacto.email}</td>
                    <td>${alumno.contacto.telefono}</td>
                      
                </tr>
            </c:forEach>
        </table>
    </body>
</html>
