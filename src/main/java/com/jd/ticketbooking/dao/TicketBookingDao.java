package com.jd.ticketbooking.dao;

import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.jd.ticketbooking.entity.Ticket;

@Repository
public interface TicketBookingDao extends CrudRepository<Ticket, Integer>{

}
