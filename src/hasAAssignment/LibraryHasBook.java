package hasAAssignment;

import java.util.*;

public class LibraryHasBook {

	static class Book {
		int bookId;
		String title;
		String author;

		Book(int bookId, String title, String author) {
			this.bookId = bookId;
			this.title = title;
			this.author = author;
		}

		void displayBookDetails() {
			System.out.println("Book Id: " + bookId);
			System.out.println("Book Title: " + title);
			System.out.println("Author: " + author);
		}
	}

	static class Library {
		String libraryName;
		List<Book> books;

		Library(String libraryName) {
			this.libraryName = libraryName;
			books = new ArrayList<>();
		}

		public void addBook(Book b) {
			books.add(b);
			System.out.println("Book is added successfully!");
		}

		void displayLibraryBooks() {
			System.out.println("Library Name: " + libraryName);
			System.out.println("Books in Library:");
			System.out.println("----------------------");
			for (Book b : books) {
				b.displayBookDetails();
			}
		}

	}

	public static void main(String[] args) {
		Library library = new Library("Citadel");

		Book b1 = new Book(1, "The Knight of the Seven Kingdoms", "George R. R. Martin");
		Book b2 = new Book(2, "Game of Thrones", "George R. R. Martin");

		library.addBook(b1);
		library.addBook(b2);
		
		library.displayLibraryBooks();         

	}

}
