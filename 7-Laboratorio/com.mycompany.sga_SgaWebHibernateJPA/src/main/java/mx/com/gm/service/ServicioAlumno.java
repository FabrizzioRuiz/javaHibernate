package mx.com.gm.service;

import java.util.List;
import mx.com.gm.dao.AlumnoDAO;
import mx.com.gm.domain.Alumno;

public class ServicioAlumno {

    private AlumnoDAO alumnoDao = new AlumnoDAO();
    
    public List<Alumno> listarAlumnos() {
        return alumnoDao.listar();
    }
    
    public void guardarAlumno(Alumno a) {
        if (a != null && a.getIdAlumno() == null) {
            alumnoDao.insertar(a);
        } else {
            alumnoDao.modificar(a);
        }
        
    }
    
    public Alumno buscarAlumnoPorId(Alumno a){
        return alumnoDao.buscarPorId(a);
    }
    
    public void eliminarAlumno(Alumno a){
        alumnoDao.eliminar(a);
    }
    
}
