package feature.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FeatureController {
	
	@Autowired
	private FeatureClient featureClient;
	
	/*@RequestMapping("/feature")
	public Employee getEmployeeDetails() {
		return featureClient.getEmployeeDetails();
	}*/
	
	@RequestMapping("/book-ticket")
	public BookingResponse bookTickets(@RequestBody BookingRequest bookingRequest) {
		return featureClient.getTicketDetails(bookingRequest);
	}
	
}
