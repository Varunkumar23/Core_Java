package JavaCollectionsFramework_ListInterface;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class comparableImplementation {

	static class Book implements Comparable<Book> {
		int price;
		Book() {

		}

		Book(int price) {
			this.price = price;
		}

		public int compareTo(Book o) {
			return this.price - o.price;
		}
		
		public String toString() {
			return "Price: "+price;
		}

	}

	public static void main(String[] args) {
		List<Book> books = new ArrayList<>();

		books.add(new Book(100));
		books.add(new Book(200));
		books.add(new Book(300));
		books.add(new Book(400));
		books.add(new Book(500));
		
		System.out.println(books);
		
		Collections.sort(books,Collections.reverseOrder());
		System.out.println(books);

	}

}
