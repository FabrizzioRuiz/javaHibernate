
package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Alumno;


public class AlumnoDAO extends GenericDAO{
    
    public List<Alumno> listar(){
        em = getEntityManager();
        String hql = "SELECT a FROM Alumno a";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }
    
    public void insertar(Alumno a){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void modificar(Alumno a){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public void eliminar(Alumno a){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(a));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } 
//        finally {
//            if (em != null) {
//                em.close();
//            }
//        }
    }
    
    public Alumno buscarPorId(Alumno a){
        em = getEntityManager();
        return em.find(Alumno.class, a.getIdAlumno());
    }
    
}
