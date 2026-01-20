package JavaCollectionsFramework_SetInterface;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {

	public static void main(String[] args) {
		
		//List allows duplicates but in real life we all face a problem where we want to store only unique values so thats why set is introduced
		//a collection that automatically rejects duplicates
		//no index
		//no insertion order
		
		
		
		HashSet<Integer> set=new HashSet<>();
		//Hashset : dont care about the order its only care about uniqueness
		//using equals and hashcode it will identify the duplicates
		set.add(10);
		set.add(20);
		set.add(30);
		set.add(40);
		System.out.println(set);
		
		for(Object o:set) {
			System.out.println(o);
		}
		
		System.out.println(set.remove(40));
		System.out.println(set);
		
		System.out.println(set.contains(40));
		System.out.println(set.isEmpty());
		System.out.println(set.size());
		
		Iterator<Integer> iterator=set.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}

		

	}

}
