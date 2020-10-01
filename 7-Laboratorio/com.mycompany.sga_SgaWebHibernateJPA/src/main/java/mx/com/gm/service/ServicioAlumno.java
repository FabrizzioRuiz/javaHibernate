
package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.domain.Alumno;

public class ServicioAlumno {
    private AlumnoDAO alumnoDao = new AlumnoDAO();
    
    public List<Alumno> listarAlumnos(){
        return alumnoDao.listar();
    }
}
