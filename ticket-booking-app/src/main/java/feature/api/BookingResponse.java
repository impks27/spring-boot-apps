package feature.api;

public class BookingResponse {
	
	private Long employeeId;
	private String name;
	private int age;
	private String boarding;
	private String destination;
	private double amount;
	private String ticketId;
	private String message;
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
	}
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
	public String getTicketId() {
		return ticketId;
	}
	public void setTicketId(String ticketId) {
		this.ticketId = ticketId;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public BookingResponse(Long employeeId, String name, int age, String boarding, String destination, double amount,
			String ticketId, String message) {
		super();
		this.employeeId = employeeId;
		this.name = name;
		this.age = age;
		this.boarding = boarding;
		this.destination = destination;
		this.amount = amount;
		this.ticketId = ticketId;
		this.message = message;
	}
	public BookingResponse() {
		super();
	}
	@Override
	public String toString() {
		return "BookingResponse [employeeId=" + employeeId + ", name=" + name + ", age=" + age + ", boarding="
				+ boarding + ", destination=" + destination + ", amount=" + amount + ", ticketId=" + ticketId
				+ ", message=" + message + "]";
	}

}
