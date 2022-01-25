package hibernate.part2.annotation;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;



public class C_01_SaveEmployeeObjectAnnotation {
	public static void main(String[] args) {
		Configuration cfg = new Configuration();

		cfg.configure("/resources/hibernate.cfg.xml");

		SessionFactory factory = cfg.buildSessionFactory(); Session session = factory.openSession();

		//Begin a unit of work and return the associated Transaction

		Transaction tx = session.beginTransaction();

		EmployeeAnnotationEntity e1=new EmployeeAnnotationEntity(); 
		e1.setId(1041);

		e1.setFirstName("Karthik");

		e1.setLastName("Raja");
		EmployeeAnnotationEntity e2=new EmployeeAnnotationEntity();

		e2.setId(1044);

		e2.setFirstName("vinay");

		e2.setLastName("Karthik");

		//Persist()

		//Does not return generated Id after saving. Its return type is void;

		session.persist(e1);

		//Save()

		//Returns generated Id after saving.

		session.save(e2);

		tx.commit();

		session.close();

		System.out.println("successfully saved");
		EmployeeAnnotationEntity e4  = new EmployeeAnnotationEntity();
		e4.setId(1047);
		e4.setFirstName("minnal");
		e4.setLastName("mualri");//this will update if the record is updating
		session.saveOrUpdate(e4);
		}
}