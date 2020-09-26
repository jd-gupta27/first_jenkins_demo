package com.jd.ticketbooking.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jd.ticketbooking.dao.TicketBookingDao;
import com.jd.ticketbooking.entity.Ticket;

@Service
public class TicketBookingService {

	@Autowired
	private TicketBookingDao ticketBookingDao;
	
	public Ticket createTicket(Ticket ticket) {
		return ticketBookingDao.save(ticket);
	}

	public Optional<Ticket> getTicketById(Integer ticketId) {
		return ticketBookingDao.findById(ticketId);
	}

	public void deleteTicket(Integer ticketId) {
		ticketBookingDao.deleteById(ticketId);
	}
	
	public Iterable<Ticket> getAllTicket() {
		return ticketBookingDao.findAll();
	}

	public Ticket updateTicket(Ticket tic) {
		Optional<Ticket> oticket = ticketBookingDao.findById(tic.getTicketId());
		Ticket ticket = oticket.get();
		ticket.setEmail(tic.getEmail());
		ticket.setDestStation(tic.getDestStation());
		ticket.setSourceStation(tic.getSourceStation());
		ticket.setPassengerName(tic.getPassengerName());
		return ticketBookingDao.save(ticket);
	}
}
