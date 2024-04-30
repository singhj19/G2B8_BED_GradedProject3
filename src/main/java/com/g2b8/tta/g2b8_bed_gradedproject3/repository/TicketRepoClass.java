//package com.g2b8.tta.g2b8_bed_gradedproject3.repository;
//
//import com.g2b8.tta.g2b8_bed_gradedproject3.mapper.TicketMapper;
//import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
//import org.springframework.beans.factory.annotation.Autowired;
//import org.springframework.jdbc.core.JdbcTemplate;
//import org.springframework.stereotype.Component;
//
//import java.util.List;
//
//@Component
//public class TicketRepoClass {
//    @Autowired
//    JdbcTemplate jdbcTemplate;
//
//    public List<Ticket> findByTitleOrDescription(String contentORdescription) {
//        String query = "SELECT * FROM ticket t WHERE t.content LIKE ? OR t.short_description LIKE ?";
//        String param = "%" + contentORdescription + "%";
//        return this.jdbcTemplate.query(query, new TicketMapper(), param, param);
//    }
//}