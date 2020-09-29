package mx.com.gm.test.ciclovida;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class Estado1Pesistido {
    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("HibernateJpaPU");
        
    }
}
