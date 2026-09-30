package onetoonesample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class person {
	@Id
	private String name;
	private int age;
	private int luggage;
	
	
	@OneToOne(mappedBy = "pr")
	private flightticket ft;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getLuggage() {
		return luggage;
	}

	public void setLuggage(int luggage) {
		this.luggage = luggage;
	}

	public flightticket getFt() {
		return ft;
	}

	public void setFt(flightticket ft) {
		this.ft = ft;
	}
	

}
