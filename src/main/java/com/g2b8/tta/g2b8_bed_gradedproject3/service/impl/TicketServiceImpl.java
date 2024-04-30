package com.g2b8.tta.g2b8_bed_gradedproject3.service.impl;

import java.time.LocalDate;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
//import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepoClass;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepository;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepositoryImpl;
import com.g2b8.tta.g2b8_bed_gradedproject3.service.TicketService;

public class TicketServiceImpl implements TicketService {

//    @Autowired
//    TicketRepositoryImpl ticketRepository;
	
	private TicketRepository ticketRepository;

    @Autowired
    public void setTicketRepository(TicketRepository ticketRepository) {
        this.ticketRepository = ticketRepository;
    }

//    @Autowired
//    TicketRepoClass ticketRepoClass;

    @Override
    public List<Ticket> list() {
    	System.out.println("Reached list method in TicketService");
        return ticketRepository.getTickets();
    }

    @Override
    public void save(Ticket ticket) {

        LocalDate currentDate = LocalDate.now();
        java.sql.Date sqlDate = java.sql.Date.valueOf(currentDate);

        ticket.setCreatedOn(sqlDate);
        ticketRepository.saveTicket(ticket);
    }

    @Override
    public Ticket getById(long ticketId) {
        return ticketRepository.getTicket(ticketId);
    }

    @Override
    public void deleteById(long ticketId) {
        ticketRepository.deleteTicket(ticketId);
    }

    public List<Ticket> searchByCreatedOnEmpty(String contentORdescription) {
        List<Ticket> tickets = ticketRepository.findByTitleOrDescription(contentORdescription);
        return tickets;
    }
}