package com.uno.portfolio.DTO;



public class AddNoteResponseDTO {
	private boolean isHeaderUsed;

	public AddNoteResponseDTO(boolean isHeaderUsed) {
		super();
		this.isHeaderUsed = isHeaderUsed;
	}

	public AddNoteResponseDTO() {
		super();
		// TODO Auto-generated constructor stub
	}

	public boolean isHeaderUsed() {
		return isHeaderUsed;
	}

	public void setHeaderUsed(boolean isHeaderUsed) {
		this.isHeaderUsed = isHeaderUsed;
	}
	
	

}
