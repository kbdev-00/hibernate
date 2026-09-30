package onetoonesample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertdaatuuuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoonebi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		person pr = new person();
		pr.setAge(22);
		pr.setLuggage(4);
		pr.setName("ketan");
		
		flightticket ft = new flightticket();
		ft.setTicketno(91920012);
		ft.setFlightName("Emrites");
		ft.setFromWhereToWhere("howrahtobihar");
		
		pr.setFt(ft);
		ft.setPr(pr);
	
		
		et.begin();
		em.persist(ft);
		em.persist(pr);
		et.commit();

	}

}
