package JavaCollectionsFramework_MapHirearchy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMapDemo {

	// SO map collection solves another real world problem
	// when we want to store data as key and values like roll no : value , age:age
	// Basically data is stored in key -> value pairs
	// keys are unique and values can be duplicate
	// no index we can access data by keys
	// map is not part of collection
	// order is gauranteed
	// we can store one null value

	public static void main(String[] args) {

		Map<String, Integer> students = new HashMap();

		students.put("Varun", 21);
		students.put("Tharun", 27);
		students.put("Lohiht", 26);
		students.put("Hari", 45);

		System.out.println(students);
		
		System.out.println(students.containsValue(21));

		for (String x : students.keySet()) {
			if (students.get(x) > 25) {
				System.out.println(x + " : " + students.get(x));
			}
		}

		students.remove("Varun");
		System.out.println(students);

		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " = " + entry.getValue());
		}

	}

}
