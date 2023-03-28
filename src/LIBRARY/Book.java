package LIBRARY;

import java.util.List;

public class Book {
	
	String uniqueIDNumber;
	String title;
	List<Author> authors;
	BookType bookType;
	
	public Book() {
	}

	public Book(String uniqueIDNumber, String title, List<Author> authors, BookType bookType) {
		this.uniqueIDNumber = uniqueIDNumber;
		this.title = title;
		this.authors = authors;
		this.bookType = bookType;
	}

	public String getUniqueIDNumber() {
		return uniqueIDNumber;
	}

	public void setUniqueIDNumber(String uniqueIDNumber) {
		this.uniqueIDNumber = uniqueIDNumber;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public List<Author> getAuthors() {
		return authors;
	}

	public void setAuthors(List<Author> authors) {
		this.authors = authors;
	}

	public BookType getBookType() {
		return bookType;
	}

	public void setBookType(BookType bookType) {
		this.bookType = bookType;
	}
	
	
	
	
	
	

}
