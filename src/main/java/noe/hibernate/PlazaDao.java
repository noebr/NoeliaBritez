package noe.hibernate;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import noe.dominio.Plaza;


public class PlazaDao {
	
	
    public void savePlaza(Plaza plaza) {
        Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(plaza);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    
    
    public List<Plaza> getPlazas() {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createQuery("from Plaza", Plaza.class).list();
    }
    
    
}