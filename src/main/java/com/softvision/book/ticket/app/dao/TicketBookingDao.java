package com.softvision.book.ticket.app.dao;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.softvision.book.ticket.app.entities.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket,Integer> {

}
