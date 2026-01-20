package JavaCollectionsFramework_QueueInterface;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class QueueImplementationByArrayDeque {

	public static void main(String[] args) {
		
		//Implementing queue by using arrayDeque
Queue<Integer> queue=new ArrayDeque<>();

queue.add(1);
queue.add(2);
queue.add(3);
queue.add(4);
System.out.println(queue);

queue.poll();
System.out.println(queue);

queue.remove();
System.out.println(queue);


//Implementinf dequeue by arraydequeue

Deque<Integer> deque=new ArrayDeque<>();
deque.offerFirst(1);
deque.offerFirst(2);
System.out.println(deque);

deque.pollLast();
System.out.println(deque);


	}

}
