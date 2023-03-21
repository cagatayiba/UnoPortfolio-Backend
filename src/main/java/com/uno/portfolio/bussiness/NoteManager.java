package com.uno.portfolio.bussiness;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.uno.portfolio.dataAccess.INoteRepository;
import com.uno.portfolio.entities.Note;

@Service
public class NoteManager implements INoteService {

	private INoteRepository noteRepository;
	
	
	@Autowired
	public NoteManager(INoteRepository noteRepository) {
		super();
		this.noteRepository = noteRepository;
	}

	@Override
	public void add(Note note) {
		noteRepository.add(note);
		
	}

	@Override
	public void delete(Note note) {
		noteRepository.delete(note);
		
	}

	@Override
	public Note get(String username, String header) {
		
		return noteRepository.get(username, header);
	}

	@Override
	public List<Note> getAll(String username) {
		
		return noteRepository.getAll(username);
	}

	@Override
	public List<String> getHeaders(String username) {
		
		return noteRepository.getHeaders(username);
	}

}
