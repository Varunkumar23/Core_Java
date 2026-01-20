package JavaCollectionsFramework_ListInterface;

import java.util.ArrayList;
import java.util.List;

public class collectionProblems {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(102);
		list.add(130);
		list.add(149);
		int sum = 0;

		for (int value : list) {
			sum += value;
		}

		System.out.println(sum);

	}

}
