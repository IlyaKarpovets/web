package testIlya;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;

import java.util.ArrayList;
import java.util.List;

public class DAO  {
 
 private SessionFactory sessionFactory;
 
 public DAO() {
  Configuration configuration = new Configuration().configure();
  sessionFactory = configuration.buildSessionFactory();
 }
 
 public List<test> getAll() {
  List<test> entities = null;
  Session session = null;
  
  try {
      session = sessionFactory.openSession();
      org.hibernate.Query query = session.createQuery("FROM test");
      @SuppressWarnings("unchecked")
   List<test> result = query.list();
      entities = new ArrayList<test>(result);
  } catch (Exception e) {
      e.printStackTrace();
  } finally {
      if (session != null) {
          session.close();
      }
  }

        return entities;
    }
 
 public void add(test testEntity) {
  Session session = null;
  Transaction transaction = null;
  
  try {
            session = sessionFactory.openSession();
            transaction = session.beginTransaction();
            session.save(testEntity);
            transaction.commit();
        } catch (Exception e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        } finally {
            if (session != null) {
                session.close();
            }
        }
    }
 
 public void close() {
  if (sessionFactory != null) {
   sessionFactory.close();
  }
 }
}