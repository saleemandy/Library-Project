package myLibraryProject;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.LinkedList;
import java.util.List;

public class Member extends Person {
	private int memberNo;
	private List<Loan> loanList;
	private Copy copy;
	private List<Reservation> res;
	
	public Member(int memberNo, String firstName, String lastName, String phone, Address address) {
		super(firstName, lastName, phone, address);
		this.memberNo = memberNo;
		loanList = new ArrayList<Loan>();
		this.copy = null;
		res = new LinkedList<>();
	}

	public int getMemberNo() {
		return memberNo;
	}

	public void setMemberNo(int memberNo) {
		this.memberNo = memberNo;
	}
	
	public List<Loan> getLoanList() {
		return loanList;
	}
	public boolean addReservation(Reservation reservation) {
		res.add(reservation);
		return true;
	}
	
	public List<Reservation> getRes() {
		return res;
	}

	public void pickupReservation(Reservation res) {
		res.pickup();
		loan(copy);
	}
	public void cancelReservation(Reservation res) {
		res.cancel();
		copy.hold();
		
	}
	public Loan loan(Copy copy) {  //my question should it be void or it should be loan as type?
		Loan loan = new Loan(copy, this);
		loan.setCheckoutDate(Calendar.getInstance().getTime());
		copy.loan();
		return loan;
		
	}
	public Reservation reserve(Publication pub) {
		Reservation res = new Reservation(pub, this);
		res.hold();
	return res;
		
	}
	public void returnIt(Copy copy) {
		copy.returnIt();
		loanList.get(memberNo).returned();
		copy.hold();
		res.get(this.memberNo).hold();
		res.get(memberNo).setCopy(copy);
		copy.reserve();
		
		
	}
}
