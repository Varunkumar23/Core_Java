package functionalProgramming;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamsPractice {

	public static void main(String[] args) {
		List<Integer> numbers = Arrays.asList(5, 12, 7, 20, 33, 12, 45, 20, 5, 60);
		List<String> names = Arrays.asList("Varun", "Aman", "Rohit", "Ankit", "Varun", "Ajay", "Ravi");
		
		numbers.stream().forEach(System.out::println);
		System.out.println("---------------");
		
		names.stream().forEach(System.out::println);
		System.out.println("------------------");
		
		
		numbers.stream().filter(n->n%2==0).forEach(System.out::println);
		System.out.println("----------");
		
		List<Integer> greater15=numbers.stream().filter(n->n>15).collect(Collectors.toList());
		System.out.println(greater15);
		System.out.println("----------");
		
		numbers.stream().distinct().forEach(System.out::println);
		
		System.out.println("--------------");
		
		numbers.stream().map(n->n*2).forEach(System.out::println);
		
		System.out.println("--------------");
		
		long count=numbers.stream().filter(n->n>25).count();
		System.out.println(count);
		
		System.out.println("-------------");
		
		System.out.println(numbers.stream().mapToInt(n->n).max().getAsInt());
		
		System.out.println("------------------");
		
		numbers.stream().sorted((a,b)->b-a).forEach(System.out::println);
		
		System.out.println("------------------");
		numbers.stream().sorted().forEach(System.out::println);
		
		System.out.println("------------");
		names.stream().filter(x->x.startsWith("A")).forEach(System.out::println);
		
		
		System.out.println("----------------");
		
		List<String> upperCaseList=names.stream().map(x->x.toUpperCase()).collect(Collectors.toList());
		System.out.println(upperCaseList);
		
		System.out.println("---------------");
		
		System.out.println(names.stream().distinct().count());
		
		System.out.println("--------------------");
		
		boolean result=names.stream().anyMatch(x->x.length()>3);
		System.out.println(result);


	}

}
