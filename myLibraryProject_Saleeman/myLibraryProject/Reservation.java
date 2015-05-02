package myLibraryProject;

import java.util.Calendar;
import java.util.Date;

public class Reservation {
private String status;
private Date statusDate;
private Copy copy;
private Publication publication;
private Member member;

public Reservation(Publication publication, Member member) {
	this.statusDate = Calendar.getInstance().getTime();
	this.member = member;
	this.publication = publication;
	copy = null;
}

public String getStatus() {
	return status;
}

public Date getStatusDate() {
	return statusDate;
}



public Copy getCopy() {
	return copy;
}


public void setCopy(Copy copy) {
	this.copy = copy;
}

public Publication getPublication() {
	return publication;
}

public void setPublication(Publication publication) {
	this.publication = publication;
}

public Member getMember() {
	return member;
}

public void setMember(Member member) {
	this.member = member;
}
public void cancel() {
	String cancelStatus = "cancelled reservation";
	this.status = cancelStatus;
	this.statusDate = Calendar.getInstance().getTime();
}
public void hold() {
	String holdStatus = "ON-HOLD";
	this.status = holdStatus;
	this.statusDate = Calendar.getInstance().getTime();
}
public void pickup(){
	String pickStatus = "FULFILLED";
	this.status = pickStatus;
	this.statusDate = Calendar.getInstance().getTime();
	
}
}
