package com.g2b8.tta.g2b8_bed_gradedproject3.repository;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
//import org.springframework.data.jpa.repository.JpaRepository;
//import org.springframework.data.jpa.repository.Query;
//import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//public interface TicketRepository extends JpaRepository<Ticket, Long> {
//    @Query("SELECT t FROM Ticket t WHERE t.content LIKE %:contentORdescription% OR t.shortDescription LIKE %:contentORdescription%")
//    List<Ticket> findByContentOrDescription(@Param("contentORdescription") String contentORdescription);
//} 

public interface TicketRepository {
	
	public List<Ticket> getTickets();

    public Ticket getTicket(long theId);

    public void deleteTicket(long theId);

	public void saveTicket(Ticket ticket);
	
	public List<Ticket> findByTitleOrDescription(String contentORdescription);
}