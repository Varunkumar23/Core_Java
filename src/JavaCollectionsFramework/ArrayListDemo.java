package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class ArrayListDemo {

	public static void main(String[] args) {

		// ArrayList implements the List Interface
		// Dynamic Size
		// Three ways to create the array list
		// 1. without any capacity(size)
		// 2. with capacity
		// 3. We can pass a list directly to a list

		// base ArrayList without any size
//		List<Integer> list = new ArrayList<>();
//		list.add(1);
//		list.add(2);
//		list.add(3);
//		list.add(4);
//		list.add(5);
//
//		System.out.println(list);

		// With size

//		List<Integer> list2 = new ArrayList<>(3);
//		list2.add(1);
//		list2.add(2);
//		list2.add(3);
//		list2.add(4);
//		System.out.println(list2);
//		

		// passing a list as parameter
//		List<Integer> list3 = new ArrayList<>(list);
//		System.out.println(list3);

		// Array List Methods

		List<Integer> list = new ArrayList<>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);

		System.out.println(list);

		list.add(1, 100); // adding element at specific index
		System.out.println(list);

		// to get the element at specific index
		System.out.println(list.get(1));

		// to update the element at specific index
		list.set(3, 189);
		System.out.println(list);

		list.remove(1); // deleting the elements through index
		list.remove(Integer.valueOf(189)); // deleting the element through the direct value
		System.out.println(list);

		System.out.println(list.contains(123));
		System.out.println(list.indexOf(4));
		System.out.println(list.lastIndexOf(4));			

		System.out.println(list.size()); // size
		System.out.println(list.isEmpty()); // isEmpty

//Iterations
		// Only use for printing
		for (Integer x : list) {
			System.out.println(x);
		}

// for any operations like remove or add
		Iterator<Integer> iterator = list.iterator();
		while (iterator.hasNext()) {
			int x = iterator.next();
			if (x == 4) {
				iterator.remove();
			}
		}
		System.out.println(list);

//advance ListIterator which is present in only list

		ListIterator<Integer> iterator2 = list.listIterator();
		while (iterator2.hasNext()) {
			System.out.print(iterator2.next() + " ");
		}
		System.out.println();

		while (iterator2.hasPrevious()) {
			System.out.print(iterator2.previous() + " ");
		}
		
		
		List<Integer> l1=new ArrayList<>();
		List<Integer> l2=new ArrayList<>();
		
		l1.add(1);
		l1.add(2);
		l1.add(3);
		l1.add(4);
		l1.add(5);
		
		l2.add(1);
		l2.add(2);
		l2.add(4);
		l2.add(3);
		l2.add(1);
		
		//union
//		System.out.println(l1.addAll(l2));
//		System.out.println(l1);
		
//		l1.removeAll(l2);
//		System.out.println(l1);
		
		//intersection
		l1.retainAll(l2);
		System.out.println(l1);
		

		



		
		

	}

}
