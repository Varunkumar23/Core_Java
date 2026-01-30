package functionalProgramming;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.stream.Collectors;

public class StreamsOnNormalData {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		nums.add(1);
		nums.add(2);
		nums.add(3);
		nums.add(4);
		nums.add(5);
		nums.add(6);
		nums.add(7);
		nums.add(8);
		nums.add(9);
		nums.add(10);

//		nums.stream().forEach(System.out::println);
//		System.out.println("---------------");
//
//		nums.stream().filter(s -> s % 2 == 0).forEach(System.out::println);
//		System.out.println("--------------");
//
//		nums.stream().map(n -> n * 10).filter(n -> n > 45).forEach(System.out::println);
//		System.out.println("--------------");
//
//		long count = nums.stream().count();
//
//		System.out.println(count);
//
//		List<Integer> resultIntegers = nums.stream().filter(x -> x > 8).collect(Collectors.toList());
//		System.out.println(resultIntegers);
//
//		System.out.println("-----------");
//
//		nums.stream().sorted().forEach(System.out::println);
//
//		System.out.println("------------");
//
//		nums.stream().sorted((a, b) -> b - a).forEach(System.out::println);

		// Matching sequences

		// True if any one satisfys
		boolean result1 = nums.stream().anyMatch(n -> n > 9);
		System.out.println(result1);

		// True if all satisfy
		boolean result2 = nums.stream().allMatch(n -> n < 11);
		System.out.println(result2);

		// True is none dis satisfy
		boolean result3 = nums.stream().noneMatch(n -> n % 2 == 0);
		System.out.println(result3);

		// Finding Operations

		Optional<Integer> first = nums.stream().findFirst();
		System.out.println(first.get());

		// Here we cannot control which element it returns
		Optional<Integer> any = nums.stream().findAny();
		System.out.println(any.get());

		// Reduce Operations Multiple Inputs -> 1 Output

		System.out.println(nums.stream().mapToInt(n -> n).sum());
		System.out.println(nums.stream().mapToInt(n -> n).max().getAsInt());

		// or

		System.out.println(nums.stream().max(Integer::compareTo).get());
		System.out.println(nums.stream().min(Integer::compareTo).get());

		List<Integer> numsIntegers = new ArrayList<>();
		numsIntegers.add(1);
		numsIntegers.add(1);
		numsIntegers.add(1);
		numsIntegers.add(2);

		System.out.println("------------------------");
		// to print unique elements
		numsIntegers.stream().distinct().forEach(System.out::println);

		// to print the elements with limit
		System.out.println("-------------");

		nums.stream().limit(4).forEach(System.out::println);

		// skip
		System.out.println("------------");
		nums.stream().skip(4).forEach(System.out::println);

		System.out.println("-------------------");

		Set<Integer> set = numsIntegers.stream().collect(Collectors.toSet());
		System.out.println(set);

		System.out.println("------------------");

		Map<Integer, String> map = nums.stream().collect(Collectors.toMap(x -> x, x -> "Value"));
		System.out.println(map);

		System.out.println("----------------");

		Map<Boolean,List<Integer>> grouped = nums.stream().collect(Collectors.groupingBy(n -> n > 3));
		System.out.println(grouped);

	}

}
