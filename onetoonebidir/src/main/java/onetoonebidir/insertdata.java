package onetoonebidir;



import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class insertdata {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoonebi");
		EntityManager em = emf.createEntityManager();
		EntityTransaction et = em.getTransaction();
		
		
		Jspider jp = new Jspider();
		jp.setId(1);
		jp.setLocation("bhagalpurrrr");
		jp.setStudents(410);
		
		Jspider jp1 = new Jspider();
		jp1.setId(2);
		jp1.setLocation("katihaarrrr");
		jp1.setStudents(120);
		
		
		
		BranchHead bh = new BranchHead();
		bh.setId(4114);
		bh.setEmail("bhaskar@gmail.com");
		bh.setName("ketan");
		
		BranchHead bh1 = new BranchHead();
		bh1.setId(4212);
		bh1.setEmail("moyemoye@gmail.com");
		bh1.setName("lord");
		
		
		jp.setBH(bh);
		bh.setJp(jp);
		jp1.setBH(bh1);
		bh1.setJp(jp1);
		
		et.begin();
		em.persist(bh);
		em.persist(jp);
		em.persist(bh1);
		em.persist(jp1);
		et.commit();
		

	}

}
