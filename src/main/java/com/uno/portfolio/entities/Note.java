package com.uno.portfolio.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="Note")
public class Note {
	
	@Id
	@Column(name="header")
	private String header;
	
	@Column(name="content")
	private String content;
	
	@Column(name="username")
	private String username;


	public Note( String header, String content, String username) {
		super();
		
		this.header = header;
		this.content = content;
		this.username = username;
	}


	public Note() {
		super();
		// TODO Auto-generated constructor stub
	}




	public String getHeader() {
		return header;
	}


	public void setHeader(String header) {
		this.header = header;
	}


	public String getContent() {
		return content;
	}


	public void setContent(String content) {
		this.content = content;
	}


	public String getUsername() {
		return username;
	}


	public void setUsername(String username) {
		this.username = username;
	}
	
	

	
	
	
}
