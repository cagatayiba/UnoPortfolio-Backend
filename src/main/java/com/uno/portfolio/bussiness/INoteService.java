package com.uno.portfolio.bussiness;

import java.util.List;

import com.uno.portfolio.entities.Note;
import com.uno.portfolio.entities.Portfolio;

public interface INoteService {
	void add(Note note);
	void delete(Note note);
	Note get(String username, String header);
	List<Note> getAll(String username);
	List<String> getHeaders(String username);
	
}
