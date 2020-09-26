package com.jd.ticketbooking;

import java.util.Date;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.jd.ticketbooking.entity.Ticket;
import com.jd.ticketbooking.service.TicketBookingService;

@SpringBootApplication
public class TicketBookingManagementAppApplication implements CommandLineRunner {
	@Autowired
	private TicketBookingService ticketBookingService;
	
	public static void main(String[] args) {
		SpringApplication.run(TicketBookingManagementAppApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		Ticket ticket = new Ticket();
		ticket.setBookingDate(new Date());
		ticket.setSourceStation("Delhi");
		ticket.setDestStation("Alwar");
		ticket.setPassengerName("Jaideep Gupta");
		ticket.setEmail("jd.gupta27@yahoo.in");
		ticketBookingService.createTicket(ticket);
	}

}
