package JavaCollectionsFramework_ListInterface	;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Comparator;

public class comparatorInterface {
	//comparator

	static class BookComparator implements Comparator<Book> {
		public int compare(Book b1, Book b2) {
			return b2.price - b1.price;
		}
	}

	//comparable
	static class Book implements Comparable<Book> {
		int price;

		Book() {

		}

		Book(int price) {
			this.price = price;
		}

		public int compareTo(Book b) {
			return this.price - b.price;
		}

		public String toString() {
			return "Price: " + price;
		}

	}

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book(300));
		books.add(new Book(100));
		books.add(new Book(200));
		books.add(new Book(500));
		books.add(new Book(400));

		System.out.println(books);

		// Using Comparable
		Collections.sort(books);
		System.out.print("Sorted using Comparable (Ascending):  ");
		System.out.println(books);

		// Using Comparator
		Collections.sort(books, new BookComparator());
		System.out.print("Sorted using Comparator (Descending):  ");
		System.out.println(books);

	}

}
