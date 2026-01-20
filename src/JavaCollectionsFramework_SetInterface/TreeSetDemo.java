package JavaCollectionsFramework_SetInterface;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {

	public static void main(String[] args) {
		//self balance binary tree is the underlined data structures for this tree set
		// left parent right on this bases sorting will be happen
		//set will be sorted
		//unique
		
		TreeSet<Integer> treeSet=new TreeSet<>();
		treeSet.add(100);
		treeSet.add(23);
		treeSet.add(-1);
		treeSet.add(1000);
		System.out.println(treeSet);
		
		
		Iterator<Integer> iterator= treeSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		

	}

}
