package InterviewQuestion;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class IMPQuestion {

	
	/*
	 * 1. How many male and female employees are there in the organization?
	 * 2. Print the name of all dept in the organization? 
	 * 3. What is the average age of male and female employees? 
	 * 4. Get the details of highest paid employee in the organization? 
	 * 5. Get the names of all employees who have joined after 2015?
	 * 6. Count the number of employees in each dept? 
	 * 7. What is the average salary of each dept? 
	 * 8. Get the details of youngest male employee in the  development dept? 
	 * 9. Who has most working experience in the organization? 
	 * 10. How many male and female employees are there in the sales team? 
	 * 11. What is the average salary of male and female employees? 
	 * 12. List down the names of all employees in each department? 
	 * 13. What is the average salary and total salary of the whole organization? 
	 * 14. Separate the employees who are younger or equal to 25 years from those employees who are older than 25 years ? 
	 * 15. Who is the oldest employee in the organization? what is his age and which department he belongs to ?
	 * 16. Get the employee Who is having highest salary ?
	 * 17. Get the employee who is having second highest salary?
	 * 
	 */

	public static void main(String[] args) {
		List<Employee> empList = new ArrayList<Employee>();
		empList.add(new Employee(1, "Jhansi", 32, "Female", "HR", 2011, 25000.0));
		empList.add(new Employee(2, "Sivaji", 25, "Male", "Sales", 2015, 15000.0));
		empList.add(new Employee(3, "Raj Kumar", 29, "Male", "InfraStructure", 2012, 17000.0));
		empList.add(new Employee(4, "Manali", 27, "Male", "Development", 2014, 32500.0));
		empList.add(new Employee(5, "Thirumalesh", 27, "Male", "HR", 2013, 22700.0));
		empList.add(new Employee(6, "Himaam", 43, "Male", "Security", 2016, 10500.0));
		empList.add(new Employee(7, "Divya", 35, "Female", "Finance", 2010, 27000.0));
		empList.add(new Employee(8, "Bheem", 22, "Male", "Development", 2015, 35000.0));
		empList.add(new Employee(9, "Nikky", 32, "Female", "Sales", 2016, 12500.0));
		empList.add(new Employee(10, "Manideep", 38, "Male", "HR", 2015, 21500.0));
		empList.add(new Employee(11, "Gourish", 27, "Male", "InfraStructure", 2014, 25700.0));
		empList.add(new Employee(12, "Pooja", 24, "Female", "Development", 2016, 38200.0));
		empList.add(new Employee(13, "Swathi", 26, "Female", "Finance", 2013, 21300.0));
		empList.add(new Employee(14, "Buttler", 25, "Male", "Sales", 2017, 11700.0));
		empList.add(new Employee(15, "Rajesh", 23, "Male", "Development", 2018, 12700.0));
		empList.add(new Employee(16, "Sanvi", 26, "Female", "InfraStructure", 2015, 28900.0));

//		//Ans -1
//		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender ,Collectors.counting()));
//				System.out.println("Q1  "+collect);
//				
//		//Ans -2		
//            empList.stream().map(Employee::getDept).distinct().forEach(System.out::println);	
//            
//          //a -3  
//            Map<String, Double> collect2 = empList.stream().collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getAge) ));	
//				
//				System.out.println(collect2);
//				
//		//a-4		
//			Optional<Employee> collect3 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(e->e.getSalary())));
//			System.out.println(collect3.get().getName());
//			//q-5
//			empList.stream().filter(e->e.getYearOfJoing()>2015).map(e->e.getName()+"--"+e.getYearOfJoing()).forEach(System.out::println);
//				
//		Map<String, Long> collect4 = empList.stream().collect(Collectors.groupingBy(Employee::getDept ,Collectors.counting()));		
//				
//		System.out.println(collect4);
//				
//		Map<String, Double> collect5 = empList.stream().collect(Collectors.groupingBy(Employee::getDept ,Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(collect5);
//		
//		Optional<Employee> collect6 = empList.stream().filter(e->e.getGender().equals("Male") && e.getDept().equals("Development"))
//				.collect(Collectors.minBy(Comparator.comparing(e -> e.getAge())));
//		System.out.println(collect6.get().getName()+"--"+collect6.get().getAge());
//		
//		
//		Optional<Employee> collect7 = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoing)));
//		
//		
//		System.out.println(collect7.get().getName());
//		
//		Map<String, Long> collect8 = empList.stream().filter(e->e.getDept().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender , Collectors.counting()));
//		System.out.println(collect8);
//		
		
		
		
		Map<String, Long> collect = empList.stream().collect(Collectors.groupingBy(Employee::getGender ,Collectors.counting()));
		System.out.println(collect);
		
		List<String> collect2 = empList.stream().filter(e->e.getGender().equals("Male")).map(e->e.getGender()).collect(Collectors.toList());
		
		System.out.println("\n\n---------\n\n");
		
		empList.stream().map(Employee::getDept).forEach(System.out::println);
		
		System.out.println("\n\n---------\n\n");
		
		Map<String, Double> collect3 = empList.stream().collect(Collectors.groupingBy(Employee::getGender ,Collectors.averagingDouble(Employee::getAge)));
		
		System.out.println(collect3);
		
		Optional<Employee> collect4 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
		
		System.out.println(collect4.get());
		
		
		System.out.println("\n\n---------\n\n");
		
		empList.stream().filter(e->e.getYearOfJoing()>2015).map(Employee::getName).forEach(System.out::println);
		
		
		System.out.println("\n\n---------\n\n");
		
		Map<String, Long> collect5 = empList.stream().collect(Collectors.groupingBy(Employee::getDept , Collectors.counting()));
		
		System.out.println(collect5);
		
		Map<String, Double> collect6 = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(collect6);
		
		Optional<Employee> min = empList.stream().filter(e->e.getGender().equals("Male")&& e.getDept().equals("Development")).min(Comparator.comparing(Employee::getAge));
		System.out.println(min.get());
		System.out.println("\n\n---------\n\n");
		
		Optional<Employee> max = empList.stream().min(Comparator.comparing(Employee::getYearOfJoing));
		
		
		System.err.println(max.get());
		
		
		System.out.println("\n\n---------\n\n");
		
		
		
		Map<String, Long> collect7 = empList.stream().filter(e->e.getDept().equals("Sales")).collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));;		
		System.out.println(collect7);
		
		
		Map<String,Double> collect8 = empList.stream().collect(Collectors.groupingBy(Employee::getGender , Collectors.averagingDouble(Employee::getSalary)));
		
		System.out.println(collect8);
		
		System.out.println("\n\n---------\n\n");

		Map<String, List<Employee>> collect9 = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.toList()));
		
		for (Map.Entry<String, List<Employee>> entry : collect9.entrySet()) {
		    String department = entry.getKey();
		    List<Employee> employees = entry.getValue();
		    
		    // Output the department name
		    System.out.println("Department: " +department );
		    
		    // Iterate over the employees in the list
		    for (Employee employee : employees) {
		        // Output or manipulate each employee
		        System.out.println( employee.getName());
		        // You can access other properties of the employee here
		    }
		}
		
		System.out.println();
		
		System.out.println("\n\n---------\n\n");
		
		Double collect10 = empList.stream().collect(Collectors.averagingDouble(Employee::getSalary));
		
		System.out.println("average salary  : "+ collect10);
		
		int sal =0;
		int i =1;
		for(Employee e : empList) {
			sal+=e.getSalary();
			i++;
		}
		System.out.println(sal);
		
		empList.stream().filter(e->e.getAge()<=25).map(Employee::getName).forEach(System.out::println);
		
		Optional<Employee> collect11 = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getAge)));
		
		System.out.println(collect11.get());
		
		
		
		Optional<Employee> max2 = empList.stream().max(Comparator.comparing(Employee::getSalary));
		System.out.println(max2.get());
		
		List<Employee> collect12 = empList.stream().sorted(Comparator.comparing(Employee::getSalary)).collect(Collectors.toList());
		
		
		Employee employee = collect12.get(1);
		System.out.println(employee);
		
		
		
		
		
		
		//------------------------------------------------------------------
		
//		Map<String, List<Employee>> collect9 = empList.stream().collect(Collectors.groupingBy(Employee::getDept));
//		
//		System.out.println("Ans pr"+collect9);
		
		
		
		//------------------------------------------------------------------
//		Map<String, Long> cntPersons = empList.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.counting()));
//		System.out.println(cntPersons);
//		
//		System.out.println("-----------------------------------------");
//
////		empList.stream().map(Employee::getDept).distinct().forEach(name -> System.out.println(name));
//		empList.stream().map(e -> e.dept).distinct().forEach(e -> System.out.println(e));
//
//		System.out.println("-----------------------------------------");
//		
//		Map<String, Double> avgAge = empList.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingInt(Employee::getAge)));
//		System.out.println(avgAge);
//		
//		System.out.println("-----------------------------------------");
//		
//		Optional<Employee> maxSal = empList.stream().collect(Collectors.maxBy(Comparator.comparing(e -> e.salary)));
//		System.out.println(maxSal.get().getName() +" - "+maxSal.get().salary);
//		
//		System.out.println("-----------------------------------------");
//		
//		empList.stream().filter(e -> e.yearOfJoing > 2015).map(e -> e.name).forEach(name -> System.out.println(name));
//		
//		System.out.println("-----------------------------------------");
//		
//		Map<String, Long> cntByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.counting()));
//		System.out.println(cntByDept);
//		
//		System.out.println("-----------------------------------------"); 
//		
//		Map<String, Double> avgSalByDept = empList.stream().collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(avgSalByDept);
//		
//		System.out.println("-----------------------------------------");
//		
//		Optional<Employee> name = empList.stream().filter(e -> e.dept.equals("Development") && e.gender.equals("Male"))
//							.collect(Collectors.minBy(Comparator.comparing(e -> e.name)));
//		System.out.println(name.get().getName());
//		
//		System.out.println("-----------------------------------------");
//		
//		Optional<Employee> mostExp = empList.stream().collect(Collectors.minBy(Comparator.comparing(Employee::getYearOfJoing)));
//		System.out.println(mostExp.get().getName());
//		
//		System.out.println("-----------------------------------------");
//		
//		Map<String, Long> salesCnt = empList.stream().filter(e -> e.dept.equals("Sales"))
//		.collect(Collectors.groupingBy(Employee :: getGender, Collectors.counting()));
//		System.out.println(salesCnt);
//		
//		System.out.println("-----------------------------------------");
//		
//		Map<String, Double> avgSalByGender = empList.stream()
//				.collect(Collectors.groupingBy(Employee::getGender, Collectors.averagingDouble(Employee::getSalary)));
//		System.out.println(avgSalByGender);
//		
//		System.out.println("-----------------------------------------");
//		
//		/*
//		 * Map<String, Map<String, List<Employee>>> namesByDept = empList.stream()
//		 * .collect(Collectors.groupingBy(Employee :: getName,
//		 * Collectors.groupingBy(Employee :: getDept)));
//		 * System.out.println(namesByDept);
//		 */
//				
//		Optional<Employee> maxiSal = empList.stream().collect(Collectors.maxBy(Comparator.comparing(Employee::getSalary)));
//		System.out.println(maxiSal.get().getName());
//		
//		System.out.println("-----------------------------------------");
//		
//		Optional<Employee> secMaxSal = empList.stream()
//				.sorted(Comparator.comparing(Employee::getSalary).reversed()).skip(1).findFirst();
//		System.out.println(secMaxSal.get());
//		
//		List<Employee> secondHighSal = empList.stream().sorted(Comparator.comparing(Employee::getSalary)
//					.reversed()).collect(Collectors.toList());
//		System.out.println(secondHighSal.get(1));
//		
//		System.out.println("-----------------------------------------");
//		
//		
	}

}

class Employee {
	int id;
	String name;
	int age;
	String gender;
	String dept;
	int yearOfJoing;
	double salary;

	public Employee(int id, String name, int age, String gender, String dept, int yearOfJoing, double salary) {
		this.id = id;
		this.name = name;
		this.age = age;
		this.gender = gender;
		this.dept = dept;
		this.yearOfJoing = yearOfJoing;
		this.salary = salary;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getDept() {
		return dept;
	}

	public void setDept(String dept) {
		this.dept = dept;
	}

	public int getYearOfJoing() {
		return yearOfJoing;
	}

	public void setYearOfJoing(int yearOfJoing) {
		this.yearOfJoing = yearOfJoing;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [id=" + id + ", name=" + name + ", age=" + age + ", gender=" + gender + ", dept=" + dept
				+ ", yearOfJoing=" + yearOfJoing + ", salary=" + salary + "]";
	}

	

}