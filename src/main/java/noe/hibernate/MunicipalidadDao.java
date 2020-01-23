package noe.hibernate;

import java.util.List;
import org.hibernate.Session;
import org.hibernate.Transaction;

import noe.dominio.Municipalidad;


public class MunicipalidadDao {
	
	
    public void saveMunicipalidad(Municipalidad municipalidad) {
        Transaction transaction = null;
        try {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            // start a transaction
            transaction = session.beginTransaction();
            // save the student object
            session.save(municipalidad);
            // commit transaction
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
    }
    
    
    
    public List<Municipalidad> getMunicipalidades() {
        	Session session = HibernateUtil.getSessionFactory().openSession();
            return session.createQuery("from Municipalidad", Municipalidad.class).list();
    }
    
    
}