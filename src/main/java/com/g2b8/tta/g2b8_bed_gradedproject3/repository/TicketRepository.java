package com.g2b8.tta.g2b8_bed_gradedproject3.repository;

import java.util.List;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;

public interface TicketRepository {

	public List<Ticket> getTickets();

	public Ticket getTicket(long theId);

	public void deleteTicket(long theId);

	public void saveTicket(Ticket ticket);

	public List<Ticket> findByTitleOrDescription(String titleOrDescription);
}