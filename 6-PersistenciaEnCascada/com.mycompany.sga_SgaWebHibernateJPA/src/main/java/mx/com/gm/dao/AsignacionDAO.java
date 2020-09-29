
package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Asignacion;

public class AsignacionDAO extends GenericDAO{
    
    public List<Asignacion> listar(){
        em = getEntityManager();
        String hql = "select a from Asignacion a";
        Query q = em.createQuery(hql);
        return q.getResultList();
    }
    
    public void insertar(Asignacion a){
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void modificar(Asignacion a){
         try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(a);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public void eliminar(Asignacion a){
         try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(a));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Object buscarPorId(Asignacion a){
        em = getEntityManager();
        return em.find(Asignacion.class, a.getIdAsignacion());
    }
}
