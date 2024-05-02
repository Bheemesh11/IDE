package in.demo;

import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ComparatorDemo  {

	
	
	
	
	public static void main(String[] args) {
		Student s1 = new Student("naveen" , 20);
		Student s2 = new Student("sivaji" , 15);
		Student s3 = new Student("pooja" , 2);
		Student s4 = new Student("bheem" , 22);
		Student s5 = new Student("rajesh" , 25);
		Student s6= new Student("himmam" , 39);
		Student s7 = new Student("divya" , 35);
		
		
		List<Student> of = List.of(s1,s2,s3,s4,s5,s6,s7);
		System.out.println(of);
		Collections.sort(of);
		System.out.println(of);

		
		
		System.out.println("-------------------");
		
		
	}

	
}


class Employee implements Comparator<Employee>{
	
	String name;
	Integer salary;
	
	
	
	
	public Employee(String name, Integer salary) {
		super();
		this.name = name;
		this.salary = salary;
	}




	@Override
	public String toString() {
		return "Employee [name=" + name + ", salary=" + salary + "]";
	}




	public String getName() {
		return name;
	}




	public void setName(String name) {
		this.name = name;
	}




	public Integer getSalary() {
		return salary;
	}




	public void setSalary(Integer salary) {
		this.salary = salary;
	}




	@Override
	public int compare(Employee o1, Employee o2) {
		
		return o1.compare(o1, o2);
	}
	
}










class Student implements Comparable<Student>{
	String name ;
	@Override
	public String toString() {
		return "Student [name=" + name + ", age=" + age + "]";
	}
	Integer age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getAge() {
		return age;
	}
	public void setAge(Integer age) {
		this.age = age;
	}
	public Student(String name, Integer age) {
		super();
		this.name = name;
		this.age = age;
	}
	@Override
	public int compareTo(Student o) {
		
		return o.age-this.age;
	}
	
	
}