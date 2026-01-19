package JavaCollectionsFramework_LinkedList;

import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;

public class LinkedListDemo {

	public static void main(String[] args) {

		LinkedList<Integer> list = new LinkedList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(2, 100);
		list.set(2, 190);

		System.out.println(list);

		// insertion order is maintaned
		// indexing is allowed
		// add null values
		// add duplicate values
		// can contains homo and hetero values

//		System.out.println(list.contains(30));
//		System.out.println(list.indexOf(30));
//		System.out.println(list.get(1));

//		list.remove(1);
//		System.out.println(list);
//		System.out.println(list.remove(Integer.valueOf(90)));
//		System.out.println(list);
//		

		System.out.println(list.contains(30));
		list.indexOf(30);
		list.lastIndexOf(30);

		System.out.println(list.size());
		System.out.println(list.isEmpty());

		// for each loop
//		for(Integer x : list) {
//		    System.out.println(x);
//		}

		// iterator
//		Iterator<Integer> iterator = list.iterator();
//		while (iterator.hasNext()) {
//			int x = (int) iterator.next();
//			if (x == 190) {
//				iterator.remove();
//			}
//		}
//
//		System.out.println(list);

		
		//List iterator
		ListIterator<Integer> listIterator=list.listIterator();
		while(listIterator.hasNext()) {
			if(listIterator.next()==30) {
				listIterator.remove();
			}
		}
		System.out.println("after removing 30: "+list);
		
		
		
		//Linked List specific methods
		list.addFirst(1);
		list.addLast(1891);
		System.out.println(list);
		
		System.out.println(list.getFirst());
		System.out.println(list.getLast());
		
		
		
		
	}

}
