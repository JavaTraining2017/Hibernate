import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;


public class Client {

	public static void main(String[] args) {
		Configuration cfg = new Configuration();
		cfg.configure(); 
		SessionFactory sf = cfg.buildSessionFactory();
		Session s = sf.openSession();
		Transaction tx = s.beginTransaction();
		Student s1 = new Student();
		s1.setSno(101);
		s1.setSname("abc");
		s1.setEmail("abc@gmail.com");
		s1.setMobileno(9866037742l);
		s.save(s1);
		tx.commit();
		s.close();
	}

}
