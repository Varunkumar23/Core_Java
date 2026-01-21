package JavaCollectionsFramework_MapHirearchy;

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapDemo {
	// bit slow than hash map
	// insertion order is preserved
	// huge because it stores the prev and next pointers

	public static void main(String[] args) {

		Map<String, Integer> students = new LinkedHashMap<>();

		students.put("Varun", 21);
		students.put("Tharun", 27);
		students.put("Lohiht", 26);
		students.put("Hari", 45);
		System.out.println(students);

		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
		students.remove("Hari");
		System.out.println(students);
		System.out.println(students.containsKey("Hari"));
		System.out.println(students.containsValue(27));

	}

}
