package feature.api;

public class BookingRequest {
	
	private Long employeeId;
	private String boarding;
	private String destination;
	private double amount;
	
	public Long getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(Long employeeId) {
		this.employeeId = employeeId;
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
	
	public BookingRequest(Long employeeId, String boarding, String destination, double amount) {
		super();
		this.employeeId = employeeId;
		this.boarding = boarding;
		this.destination = destination;
		this.amount = amount;
	}
	
	public BookingRequest() {
		
	}
	
	
}
