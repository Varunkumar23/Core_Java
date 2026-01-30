package functionalProgramming;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

//Stream API provides a functional way to process collections using a pipeline of operations.

//List → Stream → Operation → Result

public class StreamApi {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<>();

		list.add(10);
		list.add(20);
		list.add(30);
		list.add(40);
		list.add(50);

		// instead of this
//		for(int x : list) {
//			System.out.println(x);
//		}
//		
		// we can write that in one line only
//		list.stream().forEach(System.out::println);

		List<String> nameList = Arrays.asList("Varun", "Vishnu", "Sampath");
		nameList.stream().forEach(System.out::println);
		long count = nameList.stream().count();
		System.out.println(count);

		// filtering and printing the results

		nameList.stream().filter(s -> s.length() > 6).forEach(System.out::println);

		// applying filter on Integer type of data
		list.stream().filter(x -> x % 20 == 0).forEach(System.out::println);
		List<Integer> doubled = list.stream().map(n -> n * 2).collect(Collectors.toList());
		doubled.stream().forEach(System.out::println);

		List<String> namesUpperList = nameList.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
		namesUpperList.stream().forEach(System.out::println);

	}

}
