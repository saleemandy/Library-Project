package myLibraryProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;


public class Book extends Publication {
private String ISBN;
private List<Author> authors;
public Book(String title, String ISBN) {
	super(title);
	ISBN = ISBN;
	authors = new ArrayList<>();
	
}
public String getISBN() {
	return ISBN;
}
public void setISBN(String iSBN) {
	ISBN = iSBN;
}

public List<Author> getAuthors() {
	return authors;
}
public boolean addAuthor(Author theAuthor) {
	if (authors.contains(theAuthor)) {
		return false;
	}
	else 
	authors.add(theAuthor);
	return true;
}
public boolean removeAuthor(Author theAuthor) {
	if (authors.contains(theAuthor)) {
		authors.remove(theAuthor);
		return true;
	}
	else 
		return false;
}
}

/*public boolean addAuthor(String author, String credentials, String shortBio, String firstName, String lastName, String phone) {
	if (authorMap.containsKey(author)) {
		return false;
	}
	else {
		theAuthor = new Author(credentials, shortBio, firstName, lastName, phone);
		authorMap.put(author, theAuthor);
		return true;
	}
}
public boolean removeAuthor(String author) {
	if (authorMap.containsKey(author)) {
		authorMap.remove(author);
	}
	return true;
}

}
*/