package JavaCollectionsFramework_QueueInterface;

import java.util.Comparator;
import java.util.Deque;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class LinkedListImplementingQueue {

	// order is preserved
	// fifo
	// industry prefer offer-poll-peek because of thore are safe methods and dont
	// crash the system alike add, element,remove which throws exception

//	Implements Queue + Deque + List
//
//	Can act as:
//
//	Queue (FIFO)
//
//	Deque (both ends)
//
//	Stack (LIFO)
//
//	Cons ❌
//
//	Extra memory (nodes + pointers)
//
//	Slower than ArrayDeque
//
//	Random access is slow

	static class Student {
		int id;
		String name;

		public Student(int id, String name) {
			this.id = id;
			this.name = name;
		}

		public String toString() {
			return "Id: " + id + " Name: " + name;
		}

	}

	static class StudentComparator implements Comparator<Student> {

		public int compare(Student s1, Student s2) {
			return s2.id - s1.id;
		}

	}

	public static void main(String[] args) {
		Queue<Integer> queue = new LinkedList<>();

		queue.offer(1);
		queue.offer(2);
		queue.offer(3);
		queue.offer(4);
		queue.offer(5);

		queue.poll();
		System.out.println(queue.peek());

		Iterator<Integer> queueIterator = queue.iterator();
		while (queueIterator.hasNext()) {
			System.out.println(queueIterator.next());
		}

		
		//Implementing linked list as deque to perform operations on both the sides
		Deque<Integer> deque = new LinkedList<>();
		deque.addFirst(1);
		deque.addFirst(2);
		deque.addFirst(3);
		
		
		System.out.println(deque.getFirst());
		System.out.println(deque.getLast());
	deque.removeFirst();
	deque.removeLast();
		
		System.out.println(deque);
		

	}

}
