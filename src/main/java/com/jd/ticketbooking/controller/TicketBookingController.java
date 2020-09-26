package com.jd.ticketbooking.controller;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jd.ticketbooking.entity.Ticket;
import com.jd.ticketbooking.service.TicketBookingService;

@RestController
@RequestMapping(value = "/api/tickets")
public class TicketBookingController {
	//hello
	@Autowired
	private TicketBookingService ticketBookingService;

	@PostMapping(value = "/create")
	public Ticket createTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.createTicket(ticket);
	}
	@GetMapping(value = "/ticket/{ticketId}")
	public Ticket getTicketById(@PathVariable("ticketId")Integer ticketId) {
		Optional<Ticket> oTicket = ticketBookingService.getTicketById(ticketId);
		Ticket ticket = oTicket.get();
		return ticket;
	}
	@DeleteMapping(value = "/ticket/{ticketId}")
	public void deleteTicket(@PathVariable("ticketId") Integer ticketId) {
		ticketBookingService.deleteTicket(ticketId);
	}
	@GetMapping(value = "/allticket")
	public Iterable<Ticket> getAllTickets(){
		return ticketBookingService.getAllTicket();
	}
	@PutMapping(value = "/updateTicket")
	public Ticket updateTicket(@RequestBody Ticket ticket) {
		return ticketBookingService.updateTicket(ticket);
	}
}
