package com.uno.portfolio.restApi;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

import com.uno.portfolio.DTO.AddNoteResponseDTO;
import com.uno.portfolio.bussiness.INoteService;
import com.uno.portfolio.entities.Note;

@CrossOrigin("*")
@RestController
@RequestMapping("/api/note")
public class NoteController {
	private INoteService noteService;

	@Autowired
	public NoteController(INoteService noteService) {
		super();
		this.noteService = noteService;
	}
	
	@GetMapping("/get/all/notes/{username}")
	public List<Note> getAllNote(@PathVariable String username) {
		return noteService.getAll(username);
	}
	
	@GetMapping("/get/all/headers/{username}")
	public List<Note> getAllHeader(@PathVariable String username) {
		return noteService.getAll(username);
	}
	
	@PostMapping("/add")
	public AddNoteResponseDTO add(@RequestBody Note note){
		noteService.add(note);
		AddNoteResponseDTO res = new AddNoteResponseDTO();
		res.setHeaderUsed(false);
		return res;
	}
	
	@DeleteMapping("/delete")
	public Note delete(@RequestBody Note note) {
		noteService.delete(note);
		return null;
	}
	
	

}
