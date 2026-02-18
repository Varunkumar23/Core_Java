package m1Preparation;

import java.util.ArrayList;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.atomic.AtomicStampedReference;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class streamsPreparation {

	public static void main(String[] args) {

		List<Integer> numbers = new ArrayList<>();
		numbers.add(1);
		numbers.add(2);
		numbers.add(3);
		numbers.add(4);
		numbers.add(5);
		numbers.add(6);
		numbers.add(7);
		numbers.add(8);
		numbers.add(9);
		numbers.add(10);
		

//		numbers.stream().forEach(System.out::println);
//		System.out.println("----------------------------------");
//
//		numbers.stream().map(n -> n * 10).forEach(System.out::println);
//
//		System.out.println("----------------------------------");
//		
//		numbers.stream().sorted().forEach(System.out::println);
//		numbers.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
//		System.out.println("----------------------------------");
//
//		long count=numbers.stream().count();
//		System.out.println(count);
//		
//		System.out.println("----------------------------------");
//		
//int max=numbers.stream().max(Integer::compareTo).orElse(Integer.MIN_VALUE);
//int min=numbers.stream().min(Integer::compareTo).orElse(Integer.MAX_VALUE);
//
//System.out.println(max);
//System.out.println(min);
//
//System.out.println("----------------------------------");
//
//
//int first=numbers.stream().findFirst().get();
//System.out.println(first);
//
//int any=numbers.stream().findAny().get();
//System.out.println(any);
//
//System.out.println("----------------------------------");
//
//int sum=numbers.stream().mapToInt(Integer::intValue).sum();
//double avg=numbers.stream().mapToInt(Integer::intValue).average().getAsDouble();
//
//
//
//System.out.println(sum);
//System.out.println(avg);


Map<Integer, Integer> map = new HashMap<>();
map.put(1,10);
map.put(2,20);
map.put(3,30);
map.put(4,40);
map.put(5,50);

map.entrySet().stream().forEach(e->System.out.println(e.getKey()+" "+e.getValue()));

System.out.println("----------------------------------");


map.entrySet().stream().filter(e->e.getKey()>3).forEach(System.out::println);


map.entrySet().stream().filter(e->e.getValue()>30).map(e->e.getKey()).forEach(System.out::println);

List<Integer> keys=map.entrySet().stream().map(Map.Entry::getKey).collect(Collectors.toList());
System.out.println(keys);

List<Integer> values=map.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.toList());
System.out.println(values);


Map<Integer,Integer> doubleMap=map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()*5));
System.out.println(doubleMap);


map.entrySet().stream().sorted(Map.Entry.comparingByKey()).forEach(System.out::println);
map.entrySet().stream().sorted(Map.Entry.<Integer,Integer>comparingByValue().reversed()).forEach(System.out::println);

System.out.println("-------------------------------");
Map.Entry<Integer, Integer> max =
map.entrySet().stream()
   .max(Map.Entry.comparingByValue())
   .orElse(null);

int max1=map.entrySet().stream().max(Map.Entry.comparingByKey()).map(Map.Entry::getValue).get();

System.out.println(max1);

Map<Integer, Integer> filterMap=map.entrySet().stream().filter(e->e.getKey()>4).collect(Collectors.toMap(Map.Entry::getKey,Map.Entry::getValue));

System.out.println(filterMap);


//--------------------------------------------------------------------------- Grouping
System.out.println("=====================================");

map.entrySet().stream().filter(e->e.getValue()>30).map(Map.Entry::getKey).forEach(System.out::println);

Map<Integer,Integer> groupMap2=map.entrySet().stream().filter(e->e.getValue()>20).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
System.out.println(groupMap2);


Map<Integer,Integer> groupMap3=map.entrySet().stream().collect(Collectors.toMap(Map.Entry::getKey,e->e.getValue()*2));
System.out.println(groupMap3);

System.out.println("=====================================");


Map<String, List<Map.Entry<Integer, Integer>>> result =
map.entrySet().stream()
   .collect(Collectors.groupingBy(
           e -> e.getValue() > 30 ? "HIGH" : "LOW"
   ));

System.out.println(result);

Map<String, Long> result1=map.entrySet().stream().collect(Collectors.groupingBy(e->e.getValue()>30?"High":"Low",Collectors.counting()));
System.out.println(result1.get("Low"));

System.out.println("=====================================================================");

Map<Boolean,List<Map.Entry<Integer, Integer>>> result3=map.entrySet().stream().collect(Collectors.partitioningBy(e->e.getValue()>30));
System.out.println(result3);


Map<Boolean, Long> partitionCount=map.entrySet().stream().collect(Collectors.partitioningBy(e->e.getValue()>30,Collectors.counting()));
System.out.println(partitionCount);












		
		

	}

}
