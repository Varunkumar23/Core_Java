package JavaCollectionsFramework_ListInterface;

import java.util.Iterator;
import java.util.Vector;

public class vectorDemo {

	public static void main(String[] args) {

		Vector<Integer> vector=new Vector<>();
		
		vector.addElement(1);
		vector.addElement(2);
		
		System.out.println(vector);
		
		
		//we can add null , we can add home and hetero, we can add duplicate, indexing is allowed
		//speciality of vector : is has a child class that is stack
		
		vector.add(3);
		System.out.println(vector);
		System.out.println(vector.get(2));
		vector.set(1,100);
		System.out.println(vector);
		
		vector.remove(1);
		System.out.println(vector);
		
		Iterator<Integer> iterator=vector.iterator();
		while(iterator.hasNext()) {
			System.out.println(iterator.next());
		}
		
		
	}

}
