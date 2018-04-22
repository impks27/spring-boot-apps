package feature.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TicketService {
	
	@Autowired
	private TicketRepository ticketRepository;
	
	public Ticket createTicket(Ticket ticket){
		System.out.println("ticket: "+ticket.toString());
		ticket.ticketID = "TKT" + generateMyNumber();
		ticketRepository.save(ticket);
		return ticket;
	}
	
	public static int generateMyNumber()
	{
		int aNumber = 0; 
		aNumber = (int)((Math.random() * 9000000)+1000000);
		return aNumber;
	}

}
