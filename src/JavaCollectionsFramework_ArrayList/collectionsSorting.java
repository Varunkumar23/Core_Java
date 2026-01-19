package JavaCollectionsFramework_ArrayList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class collectionsSorting {

	public static void main(String[] args) {

		List<Integer> list1 = new ArrayList<>();

		list1.add(30);
		list1.add(10);
		list1.add(40);
		list1.add(20);

		System.out.println("Before Sorting: ");
		System.out.println(list1);
		Collections.sort(list1);
		System.out.println("After Sorting in ascending order: ");
		System.out.println(list1);

		Collections.sort(list1, Collections.reverseOrder());
		System.out.println("After sorting in descending order: ");
		System.out.println(list1);

	}

}
