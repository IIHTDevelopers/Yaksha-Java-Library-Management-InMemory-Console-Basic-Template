package com.elibrary.inventory;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import com.elibrary.exception.ISBNAlreadyExistsException;
import com.elibrary.models.Book;

public class Inventory {
	public List<Book> books = new ArrayList<>();

	public void addBook(Book book) throws ISBNAlreadyExistsException {
		// write your logic here
	}

	public Optional<Book> getBookByName(String name) {
		// write your logic here
		return null;
	}

	public Book updateBook(Book updatedBook) {
		// write your logic here
		return null;
	}

	public List<Book> getAllBooks() {
		// write your logic here
		return null;
	}

	public boolean isBookAvailable(String isbn) {
		// write your logic here
		return false;
	}

}
