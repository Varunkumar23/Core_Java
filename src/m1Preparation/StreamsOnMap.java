package m1Preparation;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class StreamsOnMap {

	public static void main(String[] args) {
		List<Integer> nums = new ArrayList<>();

		nums.add(5);
		nums.add(12);
		nums.add(7);
		nums.add(20);
		nums.add(3);
		nums.add(18);
		nums.add(9);
		nums.add(2);
		nums.add(25);
		nums.add(14);

		
		
		Map<String,List<Integer>> map=nums.stream().collect(Collectors.groupingBy(e->e%2==0?"Even":"Odd"));
		System.out.println(map);
		
		Map<Boolean,List<Integer>> map1=nums.stream().collect(Collectors.partitioningBy(e->e%2==0));
		System.out.println(map1);
		
		Map<Boolean,Long> map2=nums.stream().collect(Collectors.groupingBy(e->e%2==0,Collectors.counting()));
		System.out.println(map2);
		
		Map<Boolean,Integer> mp3=nums.stream().collect(Collectors.groupingBy(e->e%2==0,Collectors.summingInt(e->e)));
		System.out.println(mp3);
		
		
		
		
		
		
		
		

		
		
	}

}
