package onetoonebidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class updatedata {
	
	public static void main(String[] args) {
		
	
	
	EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoonebi");
	EntityManager em = emf.createEntityManager();
	EntityTransaction et = em.getTransaction();
	

	
	
	
	Jspider jp = em.find(Jspider.class, 1);
	
	if(jp!=null) {
		
		jp.setLocation("bihaarrr");
		jp.setStudents(520);
		
		BranchHead bh = jp.getBH();
		if(bh!=null) {
			bh.setEmail("mmmm@gmail.com");
			bh.setName("baabu mosaai");
			em.merge(bh);
			em.merge(jp);
			
		}
		
	}
	

	
	et.begin();
	
	et.commit();
	
	}	

}
