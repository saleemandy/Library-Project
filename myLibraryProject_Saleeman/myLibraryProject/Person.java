package myLibraryProject;

public class Person {
	private String firstName;
	private String secondName;
	private String phone;
	private Address address;
	public Person(String firstName, String secondName, String phone, Address address) {
		this.firstName = firstName;
		this.secondName = secondName; //because of GUI
		this.phone = phone;
		this.address = address;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getSecondName() {
		return secondName;
	}

	public void setSecondName(String secondName) {
		this.secondName = secondName;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}
	
public Address getAddress() {
		return address;
	}

	public void setAddress(Address address) {
		this.address = address;
	}

}
