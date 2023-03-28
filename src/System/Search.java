package System;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

import LIBRARY.Author;
import LIBRARY.BookItem;
import LIBRARY.BookType;

public class Search {
	
	private LIBRARY.library library;

    public Search(LIBRARY.library library) {
        this.library = library;
    }

    public List<BookItem> getBookByTitle(String title) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : library.getBooks()) {
            if (book.getTitle().equalsIgnoreCase(title)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<BookItem> getBookByAuthor(Author author) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : library.getBooks()) {
            if (book.getAuthors().contains(author)) {
                result.add(book);
            }
        }
        return result;
    }

    public List<BookItem> getBookByType(BookType bookType) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : library.getBooks()) {
            if (book.getBookType() == bookType) {
                result.add(book);
            }
        }
        return result;
    }

    public List<BookItem> getBookByPublicationDate(LocalDate publicationDate) {
        List<BookItem> result = new ArrayList<>();
        for (BookItem book : library.getBooks()) {
            if (book.getPublicationDate().equals(publicationDate)) {
                result.add(book);
            }
        }
        return result;
    }

	public Search() {
	}

}
