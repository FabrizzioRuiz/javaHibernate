package mx.com.gm.dao;

import java.util.List;
import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class ContactoDAO extends GenericDAO {

    public List<Contacto> listar() {
        em = getEntityManager();
        String hql = "select c from Contacto c";
        Query query = em.createQuery(hql);
        return query.getResultList();
    }

    public void insertar(Contacto c) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.persist(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            em.close();
        }
    }

    public void modificar(Contacto c) {
        try {
            em = getEntityManager();
            em.getTransaction().begin();
            em.merge(c);
            em.getTransaction().commit();
        } catch (Exception e) {
            e.printStackTrace(System.out);
        } finally {
            em.close();
        }
    }

    public void eliminar(Contacto c) {
        try{
            em = getEntityManager();
            em.getTransaction().begin();
            em.remove(em.merge(c));
            em.getTransaction().commit();
        }catch(Exception e){
            e.printStackTrace(System.out);
        }finally{
            em.close();
        }
    }
    
    public Object buscarPorId(Contacto c){
        em = getEntityManager();
        return em.find(Contacto.class, c.getIdContacto());
    }
}
