package onetoonesample;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class fetchdaaaatuuuu {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoonebi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		flightticket ft = em.find(flightticket.class, 91920012);
		if(ft!=null) {
			System.out.println("naaam btayaee mitr :" +ft.getFlightName());
			System.out.println("iD BTAYE MITR :" +ft.getTicketno());
			System.out.println("kidr jaane ka h :"+ft.getFromWhereToWhere());
			
			person pr = ft.getPr();
			if(pr!=null) {
				System.out.println("naaame btaooo baabu :"+pr.getName());
				System.out.println("samaaan batao baabu :"+pr.getLuggage());
				System.out.println("umrr btao baabu :"+pr.getAge());
			}
		}

	}

}
