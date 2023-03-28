package System;

import java.util.List;

import LIBRARY.BookItem;

public class Librarian extends SystemUser {
	
	private List<BookItem> books;
    private Search searchObj;
    private BookIssueService issueService;
    
    public Librarian(String firstName, String lastName, String email, String phoneNumber, Account account) {
        super(firstName, lastName, email, phoneNumber, account);
        searchObj = new Search();
        issueService = new BookIssueService();
    }

    public void addBookItem(BookItem bookItem) {
        books.add(bookItem);
    }

    public BookItem deleteBookItem(String barcode) {
        for (BookItem book : books) {
            if (book.getBarCode().equals(barcode)) {
                books.remove(book);
                return book;
            }
        }
        return null;
    }

    public BookItem editBookItem(BookItem bookItem) {
        for (int i = 0; i < books.size(); i++) {
            if (books.get(i).getBarCode().equals(bookItem.getBarCode())) {
                books.set(i, bookItem);
                return bookItem;
            }
        }
        return null;
    }
    
    

}
