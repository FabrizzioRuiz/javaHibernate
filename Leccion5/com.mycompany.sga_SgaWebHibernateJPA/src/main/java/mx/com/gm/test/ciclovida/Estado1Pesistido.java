package mx.com.gm.test.ciclovida;

import javax.persistence.*;
import mx.com.gm.domain.Contacto;

public class Estado1Pesistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        EntityManager em = emf.createEntityManager();
        
        //1. Estado Transitivo
        Contacto contacto = new Contacto();
        contacto.setEmail("github@gmail.com");
        contacto.setTelefono("4234234");
        
        //2. Estado Persistente
        em.getTransaction().begin();
        em.persist(contacto);
        //Aqui se guarda la info en la base de datos
        em.getTransaction().commit();
        /**
         * Flush() Método para sincronizar la BBDD (es como hacer commit)
         * Sincroniza lo pendiente en ese momento en la bbdd
         * USO: Cuando necesitamos recuperar el id de alguno de los objetos de entidad de la base de datos
         */
        //em.flush();
        
        
        
        //3. Estado detached (separado) Si queremos hacer otro cambio tenemos que volver a iniciar transaccion (paso2)
        System.out.println("contacto = " + contacto);
    }
}
