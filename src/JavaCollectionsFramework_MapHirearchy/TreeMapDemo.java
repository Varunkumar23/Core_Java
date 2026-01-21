package JavaCollectionsFramework_MapHirearchy;

import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;


public class TreeMapDemo {
	//Tree map sort element on the key 
	//

	public static void main(String[] args) {
		
		Map<String, Integer> students = new TreeMap<>();

		students.put("Varun", 21);
		students.put("Tharun", 27);
		students.put("Lohiht", 26);
		students.put("Hari", 45);
		
		System.out.println(students.isEmpty());
		System.out.println(students.size());

		System.out.println(students);
		for (Map.Entry<String, Integer> entry : students.entrySet()) {
			System.out.println(entry.getKey() + " : " + entry.getValue());
		}
		
	}

}
