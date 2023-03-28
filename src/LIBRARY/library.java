package LIBRARY;

import java.util.List;

public class library {
	
	private String name;
	private Address Location;
	private List<BookItem> books;
	
	public library(String name, Address location, List<BookItem> books) {
		this.name = name;
		this.Location = location;
		this.books = books;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Address getLocation() {
		return Location;
	}

	public void setLocation(Address location) {
		this.Location = location;
	}

	public List<BookItem> getBooks() {
		return books;
	}

	public void setBooks(List<BookItem> books) {
		this.books = books;
	}
	
}
