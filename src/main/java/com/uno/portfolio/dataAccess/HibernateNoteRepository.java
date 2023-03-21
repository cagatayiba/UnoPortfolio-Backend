package com.uno.portfolio.dataAccess;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.uno.portfolio.entities.Note;

@Repository
public class HibernateNoteRepository implements INoteRepository{
	private EntityManager entityManager;
	
	@Autowired
	public HibernateNoteRepository(EntityManager entityManager) {
		this.entityManager = entityManager;
	}

	@Override
	@Transactional
	public void add(Note note) {
		Session session  = entityManager.unwrap(Session.class);
		session.saveOrUpdate(note);
		
	}

	@Override
	@Transactional
	public void delete(Note note) {
		Session session  = entityManager.unwrap(Session.class);
		session.delete(note);
	}

	@Override
	@Transactional
	public Note get(String username, String header) {
		Session session  = entityManager.unwrap(Session.class);
		Note note = session.find(Note.class, header);
		if(note.getUsername().equals(username)) {
			return note;
		}else {
			return null;
		}
		
	}

	@Override
	@Transactional
	public List<Note> getAll(String username) {
		Session session  = entityManager.unwrap(Session.class);
		String hql = "from Note where Username=" + "'" +  username +  "'";
		List<Note> notes = session.createQuery(hql,Note.class).getResultList();
		
		return notes;
	}

	@Override
	@Transactional
	public List<String> getHeaders(String username) {
		List<Note> notes = this.getAll(username);
		List<String> headers = new ArrayList<String>();
		for(Note token : notes) {
			headers.add(token.getHeader());
		}
		return headers;
	}

}
