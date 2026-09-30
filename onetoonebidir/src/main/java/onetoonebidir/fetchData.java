package onetoonebidir;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

public class fetchData {

	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("onetoonebi");
		EntityManager em = emf.createEntityManager();
		Jspider j = em.find(Jspider.class, 1);
		if(j!=null) {
			System.out.println(" id :"+j.getId());
			System.out.println("loc :"+j.getLocation());
			System.out.println("name :"+j.getStudents());
			
			BranchHead bh = j.getBH();
			if(bh!= null)
			{
			System.out.println("id :"+bh.getId());
			System.out.println("mail :"+bh.getEmail());
			System.err.println("name : "+bh.getName());
		}

	}
		BranchHead bh = em.find(BranchHead.class, 4114);

}
}
