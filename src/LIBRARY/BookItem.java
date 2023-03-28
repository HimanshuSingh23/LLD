package LIBRARY;

import java.time.LocalDate;
import java.util.List;

public class BookItem extends Book{
	
	
	String barCode;
	LocalDate publicationDate;
	LocalDate issueDate;
	Rack rackLocation;
	BookStatus bookStatus;
	BookFormat bookFormat;

	
    public BookItem(String uniqueIDNumber, String title, List<Author> authors, BookType bookType, String barCode,
			LocalDate publicationDate, LocalDate issueDate, Rack rackLocation, BookStatus bookStatus,
			BookFormat bookFormat) {
		super(uniqueIDNumber, title, authors, bookType);
		this.barCode = barCode;
		this.publicationDate = publicationDate;
		this.issueDate = issueDate;
		this.rackLocation = rackLocation;
		this.bookStatus = bookStatus;
		this.bookFormat = bookFormat;
	}


	public String getBarCode() {
		return barCode;
	}


	public void setBarCode(String barCode) {
		this.barCode = barCode;
	}


	public LocalDate getPublicationDate() {
		return publicationDate;
	}


	public void setPublicationDate(LocalDate publicationDate) {
		this.publicationDate = publicationDate;
	}


	public LocalDate getIssueDate() {
		return issueDate;
	}


	public void setIssueDate(LocalDate issueDate) {
		this.issueDate = issueDate;
	}


	public Rack getRackLocation() {
		return rackLocation;
	}


	public void setRackLocation(Rack rackLocation) {
		this.rackLocation = rackLocation;
	}


	public BookStatus getBookStatus() {
		return bookStatus;
	}


	public void setBookStatus(BookStatus bookStatus) {
		this.bookStatus = bookStatus;
	}


	public BookFormat getBookFormat() {
		return bookFormat;
	}


	public void setBookFormat(BookFormat bookFormat) {
		this.bookFormat = bookFormat;
	}


	public BookItem() {
		super();
	}
	
	


	


	



    
    
	
	
	


}
