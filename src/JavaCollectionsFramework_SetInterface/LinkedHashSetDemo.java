package JavaCollectionsFramework_SetInterface;

import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetDemo {

	// set with insertion order
	// its like i want uniqueness but i also want order to be preserved

	public static void main(String[] args) {
		LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
		linkedHashSet.add(1);
		linkedHashSet.add(2);
		linkedHashSet.add(3);
		System.out.println(linkedHashSet);

//order is maintanied
		for(Integer x:linkedHashSet) {
			System.out.println(x);
		}
		
		Iterator<Integer> iterator=linkedHashSet.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

	}

}
