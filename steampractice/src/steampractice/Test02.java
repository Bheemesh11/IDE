package steampractice;

import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

import steampractice.binding.Employee;

public class Test02 {

	public static void main(String[] args) {
		Employee e1 = new Employee(1,"bheem",90000);
		Employee e2 = new Employee(2,"siva",80000);
		Employee e3 = new Employee(3,"raj",70000);
		Employee e4 = new Employee(4,"kumar",60000);
		Employee e5 = new Employee(5,"naveen",78000);
		Employee e6 = new Employee(6,"pooja",40000);
		Employee e7 = new Employee(7,"himam",60000);
		
		
		List<Employee> of = List.of(e1, e2, e3, e4, e5, e6, e7);
		
		Optional<Employee> collect = of.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
		Employee employee = of.stream().collect(Collectors.minBy(Comparator.comparing(e->e.getSalary()))).get();
		
		Double collect2 = of.stream().collect(Collectors.averagingInt(e->e.getSalary()));
		
		System.out.println("serival stream");
		
		
		of.stream().forEach(System.out::println);
		System.out.println("parellal stream");
		of.parallelStream().forEach(System.out::println);
		
		
	}
}
