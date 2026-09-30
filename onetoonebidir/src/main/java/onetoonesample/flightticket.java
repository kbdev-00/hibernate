package onetoonesample;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

@Entity
public class flightticket {
	@Id
	private int ticketno;
	private String flightName;
	private String FromWhereToWhere;
	
	

	public int getTicketno() {
		return ticketno;
	}

	public void setTicketno(int ticketno) {
		this.ticketno = ticketno;
	}

	public String getFlightName() {
		return flightName;
	}

	public void setFlightName(String flightName) {
		this.flightName = flightName;
	}

	public String getFromWhereToWhere() {
		return FromWhereToWhere;
	}

	public void setFromWhereToWhere(String fromWhereToWhere) {
		FromWhereToWhere = fromWhereToWhere;
	}
	
	@OneToOne @JoinColumn(name = "moye_moye")
	private person pr;
	public person getPr() {
		return pr;
	}

	public void setPr(person pr) {
		this.pr = pr;
	}
	

}
