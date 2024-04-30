//package com.g2b8.tta.g2b8_bed_gradedproject3.mapper;
//
//import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
//import org.springframework.dao.DataAccessException;
//import org.springframework.jdbc.core.ResultSetExtractor;
//import java.sql.ResultSet;
//import java.sql.SQLException;
//import java.util.ArrayList;
//import java.util.List;
//
////public class TicketMapper implements RowMapper<Ticket> {
////    @Override
////    public Ticket mapRow(ResultSet rs, int rowNum) throws SQLException {
////        Ticket ticket = new Ticket();
////        ticket.setId(rs.getLong("id"));
////        ticket.setTicketTitle(rs.getString("short_description"));
////        ticket.setContent(rs.getString("content"));
////        ticket.setCreatedOn(rs.getTimestamp("created_on"));
////        return ticket;
////    }
////}
//
//public class TicketMapper implements ResultSetExtractor<List<Ticket>> {
//    @Override
//    public List<Ticket> extractData(ResultSet rs) throws SQLException, DataAccessException {
//        List<Ticket> tickets = new ArrayList<>();
//        while (rs.next()) {
//            Ticket ticket = new Ticket();
//            ticket.setId(rs.getLong("id"));
//            ticket.setTicketTitle(rs.getString("ticket_title")); // Corrected column name
//            ticket.setShortDescription(rs.getString("short_description")); // Corrected column name
//            ticket.setContent(rs.getString("content"));
//            ticket.setCreatedOn(rs.getTimestamp("created_on"));
//            tickets.add(ticket);
//        }
//        return tickets;
//    }
//}
