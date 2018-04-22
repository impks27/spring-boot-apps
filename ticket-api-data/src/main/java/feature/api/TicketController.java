package feature.api;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TicketController {
	
	@Autowired
	private TicketService ticketService;
	
	@RequestMapping(method=RequestMethod.POST,value="/ticket")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		System.out.println("Controller ticket: "+ticket.toString());
		return ticketService.createTicket(ticket);
	}

}
