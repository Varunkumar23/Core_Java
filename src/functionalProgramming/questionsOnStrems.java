package functionalProgramming;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class questionsOnStrems {

	public static void main(String[] args) {

		List<Integer> list=new ArrayList<>();
		
		list.add(1);
		list.add(13);
		list.add(14);
		list.add(153);
		list.add(121);
		list.add(451);
		list.add(46);
		list.add(4);
		list.add(88);
		list.add(100);

		
		list.stream().filter(x->x%2==0).sorted().forEach(System.out::println);
		
		Map<String,List<Integer>> grouped = list.stream().collect(Collectors.groupingBy(n -> n%2==0 ? "Even":"Odd"));
		System.out.println(grouped);
		System.out.println(grouped.get("Even"));
		

		
		
		
		
		Map<String, Integer> studentDetails=new HashMap<>();
		
		
		studentDetails.put("Varun", 38);
		studentDetails.put("Tharun", 48);
		studentDetails.put("Adithya", 68);
		studentDetails.put("Hari", 18);
		studentDetails.put("Vishnu", 78);
		


		
	}

}
