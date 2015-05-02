package myLibraryProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Author extends Person {
private String credentials;
private String shortBio;
private List<Book> books;
public Author(String credentials, String shortBio, String firstName, String lastName, String phone, Address address) {
	super(firstName, lastName, phone, address);
	this.credentials = credentials;
	this.shortBio = shortBio;
	books = new ArrayList<>();
}
public String getCredentials() {
	return credentials;
}
public void setCredentials(String credentials) {
	this.credentials = credentials;
}
public String getShortBio() {
	return shortBio;
}
public void setShortBio(String shortBio) {
	this.shortBio = shortBio;
}


public List<Book> getBooks() {
	return books;
}
public void setBooks(List<Book> books) {
	this.books = books;

}
public boolean addBook(Book b) {
	books.add(b);
	return true;
}
public boolean removeBook(Book book) {
	if (books.isEmpty()) {
		return false;
	}
	else {
		books.remove(book);
		return true;
	}
}
}
/* public boolean addBook(String title, String ISBN, String author) {
	if(bookMap.containsKey(title)) {
		return false;
	}
	else {
		book = new Book(title, ISBN, author);
		bookMap.put(title, book);
		return true;
	}
}
public boolean removeBook(String title) {
	if (bookMap.containsKey(title)) {
		bookMap.remove(title);
	}
	return true;
}
}
*/