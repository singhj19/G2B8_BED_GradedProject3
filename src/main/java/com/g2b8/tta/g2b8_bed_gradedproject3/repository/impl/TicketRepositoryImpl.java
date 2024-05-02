package com.g2b8.tta.g2b8_bed_gradedproject3.repository.impl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import com.g2b8.tta.g2b8_bed_gradedproject3.model.Ticket;
import com.g2b8.tta.g2b8_bed_gradedproject3.repository.TicketRepository;

@Repository
@EnableTransactionManagement
public class TicketRepositoryImpl implements TicketRepository {

	private SessionFactory sessionFactory;

	@Autowired
	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	@Override
	@Transactional
	public List<Ticket> getTickets() {

		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		System.out.println("reached repo method");
		return session.createQuery("from Ticket", Ticket.class).list();
	}

	@Override
	@Transactional
	public void saveTicket(Ticket ticket) {

		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		session.saveOrUpdate(ticket);
	}

	@Override
	@Transactional
	public Ticket getTicket(long theId) {

		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}
		Ticket theTicket = session.get(Ticket.class, theId);
		return theTicket;
	}

	@Override
	@Transactional
	public void deleteTicket(long theId) {

		Session session;
		try {
			session = sessionFactory.getCurrentSession();
		} catch (HibernateException e) {
			session = sessionFactory.openSession();
		}

		Ticket ticket = session.byId(Ticket.class).load(theId);
		session.delete(ticket);
	}

	@Transactional
	@Override
	public List<Ticket> findByTitleOrDescription(String titleOrDescription) {
		Session session = sessionFactory.getCurrentSession();
		Query<Ticket> query = session.createQuery(
				"FROM Ticket t WHERE t.content LIKE :keyword OR t.shortDescription LIKE :keyword", Ticket.class);
		query.setParameter("keyword", "%" + titleOrDescription + "%");

		List<Ticket> tickets = query.getResultList();
		return tickets;
	}

}