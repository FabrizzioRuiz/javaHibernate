package mx.com.gm.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.*;
import mx.com.gm.domain.Alumno;
import mx.com.gm.domain.Contacto;
import mx.com.gm.domain.Domicilio;
import mx.com.gm.service.ServicioAlumno;

@WebServlet("/ServletModificar")
public class ServletModificar extends HttpServlet {

    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String idAlumnoS = request.getParameter("idAlumno");
        Integer idAlumno = Integer.parseInt(idAlumnoS);

        Alumno alumno = new Alumno();
        alumno.setIdAlumno(idAlumno);

        ServicioAlumno servicioAlumno = new ServicioAlumno();
        alumno = servicioAlumno.buscarAlumnoPorId(alumno);

//        request.setAttribute("alumno", alumno);
        HttpSession sesion = request.getSession();
        sesion.setAttribute("alumno", alumno);
        request.getRequestDispatcher("/WEB-INF/modificarAlumno.jsp").forward(request, response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        String modificar = request.getParameter("Modificar");
        ServicioAlumno servAlmuno = new ServicioAlumno();
        if (modificar != null) {
            String nombre = request.getParameter("nombre");
            String apellido = request.getParameter("apellido");
            String telefono = request.getParameter("telefono");
            String email = request.getParameter("email");
            String calle = request.getParameter("calle");
            String num_calle = request.getParameter("num_calle");
            String pais = request.getParameter("pais");

            /*
        Comento esto porque ya no me hace falta con la variable 
        session en el metodo doGet de arriba
             */
 /*Domicilio domicilio = new Domicilio();
        domicilio.setCalle(calle);
        domicilio.setNumCalle(num_calle);
        domicilio.setPais(pais);
        
        Contacto contacto = new Contacto();
        contacto.setEmail(email);
        contacto.setTelefono(telefono);
        
        Alumno alumno = new Alumno();*/
            HttpSession sesion = request.getSession();
            Alumno alumno = (Alumno) sesion.getAttribute("alumno");

            alumno.setNombre(nombre);
            alumno.setApellido(apellido);

            alumno.getDomicilio().setCalle(calle);
            alumno.getDomicilio().setNumCalle(num_calle);
            alumno.getDomicilio().setPais(pais);

            alumno.getContacto().setEmail(email);
            alumno.getContacto().setTelefono(telefono);

//        alumno.setContacto(contacto);
//        alumno.setDomicilio(domicilio);
            
            servAlmuno.guardarAlumno(alumno);

            /*
        Antes de terminar eliminamos la session de alumno para que no se siga propagando la informacion
             */
            sesion.removeAttribute("alumno");
        }else{
            //Caso de Eliminar
            String idAlumnoS = request.getParameter("idAlumno");
            Integer idAlumno = Integer.parseInt(idAlumnoS);
            
            Alumno alumno = new Alumno(idAlumno);
            servAlmuno.eliminarAlumno(alumno);
        }

        request.getRequestDispatcher("/index.jsp").forward(request, response);
    }

}
