package JavaCollectionsFramework_ListInterface;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class accessingElementsInCollections {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		System.out.println(list);

		System.out.println("===========");
		// get(index)
		for (int i = 0; i < list.size(); i++) {
			System.out.println(list.get(i));
		}

		/// for each
		///
		System.out.println("==============");

		for (Object o : list) {
			System.out.println(o);
		}

		System.out.println("================ iterator");

		// Iterator which presents in itreable interface

//		Iterator i = list.iterator();
//		while (i.hasNext()) {
//			System.out.println(i.next());
//		}
//		
//		
//		System.out.println("====== listIterator next");
//		//listIterator resides in list interface
//		
//		ListIterator listIterator=list.listIterator();
//		
//		while(listIterator.hasNext()) {
//			System.out.println(listIterator.next());
//		}
//		System.out.println("==== listiterator previous");
//		while(listIterator.hasPrevious()) {
//			System.out.println(listIterator.previous());
//		}
//		
		System.out.println("List iteartor with index");
		
		
		ListIterator listIteratorIndex=list.listIterator();
		while(listIteratorIndex.hasNext() && listIteratorIndex.nextIndex()<=3
				
				) {
			System.out.println(listIteratorIndex.next());
		}
		System.out.println();
		while(listIteratorIndex.hasPrevious()) {
			System.out.println(listIteratorIndex.previous());
		}
		


	}

}
