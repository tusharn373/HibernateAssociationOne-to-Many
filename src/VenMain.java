import java.util.HashSet;
import java.util.Set;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.AnnotationConfiguration;
import org.hibernate.cfg.Configuration;

public class VenMain {

	public static void main(String[] args) {
		Configuration config=new AnnotationConfiguration();
	      config.configure("hibernate.cfg.xml");
	        SessionFactory factory=config.buildSessionFactory();
	          Session ses=factory.openSession();
	          Set<Customer>s=new HashSet<Customer>();
	  		s.add(new Customer(101, "Ram","Nashik"));
	  		s.add(new Customer(102,"Shyam","Pune"));
	  		s.add(new Customer(103, "Radha", "Mumbai"));
	  		s.add(new Customer(104, "Raj", "Pune"));
	  		Vendor v=new Vendor(1455, "R J Traders","Nashik",s);
	  		ses.save(v);
	  		Transaction tx=ses.beginTransaction();
			tx.commit();
			System.out.println("success");

	}

}
