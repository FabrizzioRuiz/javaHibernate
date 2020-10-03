
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar ALumno</title>
    </head>
    <body>
        <h1>Modificar Alumno</h1>
         <form name="form1" action="${pageContext.request.contextPath}/ServletModificar" method="post">
            Datos del alumnos 
            <br/>
            <input type="hidden" name="idAlumno" value="${alumno.idAlumno}"/>
            Nombre: <input type="text" name="nombre" value="${alumno.nombre}"/>
            <br/>
            Apellidos: <input name="apellido" type="text" value="${alumno.apellido}"/>
            <br/>
            <br/>
            Datos de Domicilio:
            <br/>
            Calle: <input type="text" name="calle" value="${alumno.domicilio.calle}"/>
            <br/>
            Num Calle: <input type="num" name="num_calle" value="${alumno.domicilio.numCalle}"/>
            <br/>
            País: <input type="text" name="pais" value="${alumno.domicilio.pais}"/>
            <br/>
            <br/>
            Datos de Contacto:
            <br/>
            Telefono: <input type="num" name="telefono" value="${alumno.contacto.telefono}"/>
            <br/>
            Email: <input type="email" name="email" value="${alumno.contacto.email}"/>
            <br/>
            <br/>
            <input type="submit" value="Modificar" name ="Modificar">
            <input type="submit" value="Eliminar" name="Eliminar">
        </form>
    </body>
</html>
