package feature.api;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import feature.api.Employee;

import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;
@Service
public class FeatureClient {

	/*public Employee getEmployeeDetails(){
		RestTemplate restTemplate = new RestTemplate();
		Employee employee = (Employee) restTemplate.getForObject("http://localhost:8080/employees/1", Employee.class);
		System.out.println("employee: "+employee);
		return employee;
	}*/
	
	public BookingResponse getTicketDetails(BookingRequest bookingRequest){
		
		final String uri_employee = "http://localhost:8080/employees/{id}";
		final String uri_ticket = "http://localhost:8085/ticket";
	     
	    Map<String, String> params = new HashMap<String, String>();
	    params.put("id",bookingRequest.getEmployeeId().toString());

		RestTemplate restTemplate = new RestTemplate();
		BookingResponse bookingResponse = new BookingResponse();
		
		//Service call to fetch employee details
		Employee employee = (Employee) restTemplate.getForObject(uri_employee, Employee.class,params);
		bookingResponse.setEmployeeId(employee.getId());
		bookingResponse.setName(employee.getName());
		bookingResponse.setAge(employee.getAge());
		
		//Service call for ticket generation
		Ticket ticketRequest = new Ticket();
		ticketRequest.setId(bookingRequest.getEmployeeId());
	    ticketRequest.setPersonID(bookingRequest.getEmployeeId() + "");
	    ticketRequest.setBoarding(bookingRequest.getBoarding());
	    ticketRequest.setDestination(bookingRequest.getDestination());
	    ticketRequest.setAmount(bookingRequest.getAmount());
	    System.out.println("ticketRequest: "+ticketRequest);
	    Ticket ticketResponse = (Ticket) restTemplate.postForObject(uri_ticket, ticketRequest,Ticket.class);
		
		bookingResponse.setBoarding(ticketResponse.getBoarding());
		bookingResponse.setDestination(ticketResponse.getDestination());
		bookingResponse.setTicketId(ticketResponse.getTicketID());
		bookingResponse.setAmount(ticketResponse.getAmount());
		bookingResponse.setMessage("Your ticket(s) booked successfully. Happy journey!");
		return bookingResponse;
	}

}
