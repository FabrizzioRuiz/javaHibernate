

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Agregar Alumno</title>
    </head>
    <body>
        <h1>Agregar Alumno</h1>
        <form name="form1" action="${pageContext.request.contextPath}/ServletAgregar" method="post">
            Datos del alumnos 
            <br/>
            Nombre: <input type="text" name="nombre"/>
            <br/>
            Apellidos: <input name="apellido" type="text"/>
            <br/>
            <br/>
            Datos de Domicilio:
            <br/>
            Calle: <input type="text" name="calle"/>
            <br/>
            Num Calle: <input type="num" name="num_calle"/>
            <br/>
            País: <input type="text" name="pais"/>
            <br/>
            <br/>
            Datos de Contacto:
            <br/>
            Telefono: <input type="num" name="telefono"/>
            <br/>
            Email: <input type="email" name="email"/>
            <br/>
            <br/>
            <input type="submit" value="Agregar" name ="Agregar">            
        </form>
    </body>
</html>
