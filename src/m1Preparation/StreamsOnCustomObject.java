package m1Preparation;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;


class Employee {

    private int id;
    private String name;
    private String department;
    private double salary;

    public Employee(int id, String name, String department, double salary) {
        this.id = id;
        this.name = name;
        this.department = department;
        this.salary = salary;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDepartment() {
        return department;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return name + " (" + department + ", " + salary + ")";
    }
}

public class StreamsOnCustomObject {

	public static void main(String[] args) {
		Map<Integer, Employee> empMap = new HashMap<>();

		empMap.put(1, new Employee(1, "John", "IT", 60000));
		empMap.put(2, new Employee(2, "Sara", "HR", 45000));
		empMap.put(3, new Employee(3, "Mike", "IT", 70000));
		empMap.put(4, new Employee(4, "Emma", "Finance", 80000));
		empMap.put(5, new Employee(5, "Tom", "HR", 40000));
		
		
		Map<String,List<Employee>> departmentWise=empMap.entrySet().stream().map(Map.Entry::getValue).collect(Collectors.groupingBy(Employee::getDepartment));
		System.out.println(departmentWise);
		
		Map<String,Long> departmentWiseCount=empMap.values().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.counting()));
		System.out.println(departmentWiseCount);
		
		Map<String, Double> departmentWiseSalaryMap=empMap.values().stream().collect(Collectors.groupingBy(Employee::getDepartment,Collectors.summingDouble(e->e.getSalary())));
		System.out.println(departmentWiseSalaryMap);
		
		Map<Boolean, List<Employee>> highAndLowEmployeePartitionMap=empMap.values().stream().collect(Collectors.partitioningBy(e->e.getSalary()>60000));
		System.out.println(highAndLowEmployeePartitionMap);
		
		Map<String, Double> maxSalaryByDept = new HashMap<>();

		empMap.values().stream()
		      .collect(Collectors.groupingBy(Employee::getDepartment))
		      .forEach((dept, employees) -> {
		          double maxSalary = employees.stream()
		                                      .mapToDouble(Employee::getSalary)
		                                      .max()
		                                      .orElse(0);
		          maxSalaryByDept.put(dept, maxSalary);
		      });

		System.out.println(maxSalaryByDept);
		
		
		
		
		empMap.values().stream().sorted(Comparator.comparingDouble(Employee::getSalary)).forEach(System.out::println);
		empMap.values().stream().sorted(Comparator.comparingDouble(Employee::getSalary).reversed()).forEach(System.out::println);


		
		


	}

}
