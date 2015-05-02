package myLibraryProject;

import java.util.Calendar;
import java.util.Date;

public class Loan {
private Date checkoutDate;
private Date returnDate;
private Copy copy;
private Member member;

public Loan(Copy copy, Member member) {
	this.checkoutDate = Calendar.getInstance().getTime();
	this.returnDate = Calendar.getInstance().getTime();
	this.copy = copy;
	this.member = member;
	
}

public Date getCheckoutDate() {
	return (Date) checkoutDate.clone();
}

public void setCheckoutDate(Date checkoutDate) {
	this.checkoutDate = checkoutDate;
}

public Date getReturnDate() {
	return(Date) returnDate.clone();
}


public Copy getCopy() {
	return copy;
}

public void setCopy(Copy copy) {
	this.copy = copy;
}

public Member getMember() {
	return member;
}

public void setMember(Member member) {
	this.member = member;
}
public void returned() {
	this.returnDate = Calendar.getInstance().getTime();
}
}
