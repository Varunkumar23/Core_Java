package JavaCollectionsFramework;

import java.util.ArrayList;
import java.util.List;

public class dataRemovalFromArrayList {

	public static void main(String[] args) {
		
		List<Integer> list1=new ArrayList<>();
		
	list1.add(10);
	list1.add(20);
	list1.add(30);
	list1.add(40);
	
	
	List<Integer> list2=new ArrayList<>();
	
	list2.add(10);
	list2.add(20);
	list2.add(30);
	list2.add(50);
	
System.out.println(list1);

// removes all the common elements and displays only unique elements from list1......................................................................................................................................................................................................................................................................................
//list1.removeAll(list2);

// it retains all the elements in list1 which are common in both the lists
//list1.retainAll(list2); 

list1.clear();    // removes all elements from the collection
System.out.println(list1);
		

	}

}
