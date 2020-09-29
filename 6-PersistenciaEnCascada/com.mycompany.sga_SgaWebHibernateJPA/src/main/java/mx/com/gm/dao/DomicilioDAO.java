package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Domicilio;

public class DomicilioDAO extends GenericDAO {

    public List<Domicilio> listar() {
        String hql = "select d from Domicilio d";
        em = getEntityManager();
        Query query = em.createQuery(hql);

        return query.getResultList();
    }

    public void insertar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void modificar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(d);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }

    public void eliminar(Domicilio d) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(d));
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            if (em != null) {
                em.close();
            }
        }
    }
    
    public Object buscarPorId(Domicilio d){
        em = getEntityManager();
        return em.find(Domicilio.class, d.getIdDomicilio());
    }
}
