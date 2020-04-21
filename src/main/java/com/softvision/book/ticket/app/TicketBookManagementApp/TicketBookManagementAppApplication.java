package com.softvision.book.ticket.app.TicketBookManagementApp;

import java.util.Date;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.softvision.book.ticket.app.entities.Ticket;
import com.softvision.book.ticket.app.service.TicketBookingService;

@SpringBootApplication
public class TicketBookManagementAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext  applicationContext=SpringApplication.run(TicketBookManagementAppApplication.class, args);
		TicketBookingService ticketBookingService = applicationContext.getBean(TicketBookingService.class);
		
		Ticket ticket=new Ticket();
		ticket.setBookinDate(new Date());
		ticket.setDestStation("Mumbai");
		ticket.setSourceStation("Pune");
		ticket.setPassenerName("Sindhuja");
		ticket.setEmail("sindhuja@gmail.com");
		
		
		ticketBookingService.createTicket(ticket);
	}
	
	
    public void run(String[] args) {

       
    }

}
