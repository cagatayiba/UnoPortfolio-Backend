package com.uno.portfolio.dataAccess;

import java.util.List;

import com.uno.portfolio.entities.Note;

public interface INoteRepository {
	void add(Note note);
	void delete(Note note);
	Note get(String username, String header);
	List<Note> getAll(String username);
	List<String> getHeaders(String username);
}
