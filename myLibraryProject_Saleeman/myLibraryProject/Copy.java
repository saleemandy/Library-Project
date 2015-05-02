package myLibraryProject;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;


public class Copy {
	private int copyNo;
	private Publication publication;
	private List<Loan> loans;
	private String status;
	private List<Reservation> reservation;
	public Copy(int copyNo, Publication publication) {
		this.publication = publication;
		loans = new ArrayList<>();
		reservation = new LinkedList<>();
	}
	public int getCopyNo() {
		return copyNo;
	}
	public void setCopyNo(int copyNo) {
		this.copyNo = copyNo;
	}
	
	
	public Publication getPublication() {
		return publication;
	}
	
	public String getStatus() {
		return status;
	}
	public boolean addLoan(Loan loan) {
		loans.add(loan);
		return true;
	}
	public boolean addReservation(Reservation res) {
		reservation.add(res);
		return true;
	}
	public void loan() {
		this.status = "LOANED";
		
	}
	public void reserve() {
		this.status = "RESERVED";
	}
	public void returnIt() {
		this.status = "RETURNED";
	}
	public void hold() {
		this.status = "PENDING";
	}
	
}
