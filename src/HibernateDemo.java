import org.hibernate.SessionFactory;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import java.util.HashSet;
import java.util.Set;

public class HibernateDemo {

    public static void main(String[] args) {
        System.out.println("Helllooo hibernater");
        Session s = null;
        User user1 = new User("Vignesh", "vicky3", "dummy");
        Set<UserEvents> ueSet = new HashSet<>();
        ueSet.add(new UserEvents("vicky changed once"));
        ueSet.add(new UserEvents("vicky changed twice"));
        ueSet.add(new UserEvents("vicky changed thrice"));
        user1.setUserEvents(ueSet);
        try {
            SessionFactory sessionFactory = new Configuration().configure("/hibernate.cfg.xml").buildSessionFactory();
            s = sessionFactory.openSession();
            Transaction tx  = s.beginTransaction();
            s.save(user1);

            tx.commit();

        }catch (Exception e) {
e.printStackTrace();

        }finally {
            s.close();
        }
    }

}
