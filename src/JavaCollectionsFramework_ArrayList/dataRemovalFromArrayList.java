package JavaCollectionsFramework_ArrayList;

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
//it only displays the elements which are common in both the lists and which are in list 1 only
//list1.removeAll(list2);

// it displays the elements from list 1 which are common in both the lists
//list1.retainAll(list2); 

list1.clear();    // removes all elements from the collection
System.out.println(list1);


//
		

	}

}
