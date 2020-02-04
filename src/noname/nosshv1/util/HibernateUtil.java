package noname.nosshv1.util;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.service.ServiceRegistry;

public class HibernateUtil {
	private HibernateUtil(){        
    }
    private static SessionFactory sessionFactory;
    static{
        ServiceRegistry serviceRegistry = new StandardServiceRegistryBuilder().configure().build();
        sessionFactory = new MetadataSources(serviceRegistry).buildMetadata().buildSessionFactory();
        
    }
    public static SessionFactory getSeesionFactory(){
        return sessionFactory;
    }
    public static Session getSession(){
        return sessionFactory.openSession();
    }
}
