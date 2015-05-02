package myLibraryProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Publication {
	private String title;
	private List<Copy> copies;
	private Copy copy;
	private List<Reservation> reservations;

	public Publication(String title) {
		this.title = title;
		copies = new ArrayList<>();
		reservations = new LinkedList<>();
		copy = null;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	public Copy getCopy() {
		return copy;
	}

	public List<Copy> getCopies() {
		return copies;
	}

	public void setCopies(List<Copy> copies) {
		this.copies = copies;
	}

	public List<Reservation> getReservations() {
		return reservations;
	}

	public void setReservations(List<Reservation> reservations) {
		this.reservations = reservations;
	}

	public boolean addCopy(){
		copies.add(copy);
		return true;
		
	}

}
