package steampractice;

import java.util.List;
import java.util.stream.Collectors;

import steampractice.binding.Employee;

public class StreamInterviewQuestion {

	public static void main(String[] args) {
		StreamInterviewQuestion s1 = new StreamInterviewQuestion();
		List<Employee> q1 = s1.q1();
		System.out.println(q1);
		
		
	}
	
	
	public static List<Employee> emp() {
		Employee e1 = new Employee(1,"sivaji",50000,25,3);
		Employee e2 = new Employee(2,"rajesh",50000,25,3);
		Employee e3 = new Employee(3,"manideep",50000,25,3);
		Employee e4 = new Employee(4,"tirualesh",50000,25,3);
		Employee e5 = new Employee(5,"pooja",50000,25,2);
		Employee e6 = new Employee(6,"himam",50000,25,3);
		Employee e7 = new Employee(7,"naveen",50000,25,3);
		Employee e8 = new Employee(8,"divya",50000,25,2);
		Employee e9 = new Employee(9,"Bheemesh",50000,25,3);
		
		
		
		
		return List.of(e1, e2, e3, e4, e5, e6, e7, e8, e9);
	}
	
	public List<Employee> q1(){
		List<Employee> emp = emp();
		return  emp.stream().filter(e->e.getSalInteger().equals(Integer.valueOf(2))).collect(Collectors.toList());
	}

}
