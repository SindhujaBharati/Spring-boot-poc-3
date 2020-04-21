package com.softvision.book.ticket.app.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

import com.softvision.book.ticket.app.dao.TicketBookingDao;
import com.softvision.book.ticket.app.entities.Ticket;

@Component
@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketbookingdao;
	public Ticket createTicket(Ticket ticket) {
		
		return ticketbookingdao.save(ticket);
	}
	public Optional<Ticket> getTicketById(Integer ticketId) {
		
		return ticketbookingdao.findById(ticketId);
	}

}
