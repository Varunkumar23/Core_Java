package JavaCollectionsFramework_QueueInterface;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
//In a priority queue we cannot add null value
		// no indexing
		//no neterogeneous data
		
		
		
//		Real life:
//
//			Emergency patients
//
//			CPU scheduling
//
//			Task priorities
//
//			👉 Priority matters more than arrival order
//		
		
	PriorityQueue queue=new PriorityQueue<>();
	queue.offer(12);
	queue.offer(2);
	queue.offer(-1);
	System.out.println(queue);
	
	
System.out.println(queue.peek());
System.out.println(queue.poll());
		
		

	}

}
