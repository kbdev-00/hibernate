package onetoonebidir;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class Jspider {
	
	@Id
	private int id;
	private String location;
	private int students;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getStudents() {
		return students;
	}
	public void setStudents(int students) {
		this.students = students;
	}
	
	@OneToOne @JoinColumn(name = "branch_common")
	private BranchHead BH;
	public BranchHead getBH() {
		return BH;
	}
	public void setBH(BranchHead bH) {
		BH = bH;
	}

}
