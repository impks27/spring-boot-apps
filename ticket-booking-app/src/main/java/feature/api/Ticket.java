package feature.api;

public class Ticket {
	
	long id;
	String ticketID;
	String personID;
	String boarding;
	String destination;
	double amount;
	
	public Ticket() {
		
	}
	
	public Ticket(long id, String ticketID, String personID, String boarding, String destination, double amount) {
		super();
		this.id = id;
		this.ticketID = ticketID;
		this.personID = personID;
		this.boarding = boarding;
		this.destination = destination;
		this.amount = amount;
	}



	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getTicketID() {
		return ticketID;
	}

	public void setTicketID(String ticketID) {
		this.ticketID = ticketID;
	}

	public String getPersonID() {
		return personID;
	}

	public void setPersonID(String personID) {
		this.personID = personID;
	}

	public String getBoarding() {
		return boarding;
	}

	public void setBoarding(String boarding) {
		this.boarding = boarding;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public double getAmount() {
		return amount;
	}

	public void setAmount(double amount) {
		this.amount = amount;
	}

	@Override
	public String toString() {
		return "Ticket [id=" + id + ", ticketID=" + ticketID + ", personID=" + personID + ", boarding=" + boarding
				+ ", destination=" + destination + ", amount=" + amount + "]";
	}

}
