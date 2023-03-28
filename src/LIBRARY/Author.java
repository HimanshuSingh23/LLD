package LIBRARY;

import java.util.List;

public class Author extends Person {
	
	List<Book> booksPublished;
	
	public Author(String firstName, String lastName, List<Book> booksPublished) {
        super(firstName, lastName);
        this.booksPublished = booksPublished;
    }

	public List<Book> getBooksPublished() {
		return booksPublished;
	}

	public void setBooksPublished(List<Book> booksPublished) {
		this.booksPublished = booksPublished;
	}
	
	

}
