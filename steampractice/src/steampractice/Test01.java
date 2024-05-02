package steampractice;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import steampractice.binding.Person;

public class Test01 {
	public static void main(String[] args) {
		
		Person p1 = new Person("sivaji" ,"usa");
		Person p2 = new Person("poja" ,"Japan");
		Person p3 = new Person("rajesh" ,"koria");
		Person p4 = new Person("naveen" ,"russia");
		Person p5 = new Person("manideep" ,"usa");
		Person p6 = new Person("Bheemesh" ,"india");
//		
		List<Person> of = List.of(p1,p2,p3,p4,p5,p6);
////		boolean anyMatch = of.stream().anyMatch(p->p.getAdd().equals(""));
////		
////		System.out.println(anyMatch);
// List<String> collect = of.stream().filter(p->p.getAdd().equals("usa")).map(p->p.getName())
//				.collect(Collectors.toList());
//		System.out.println(collect);
		Map<String, List<Person>> collect = of.stream().collect(Collectors.groupingBy(e->e.getName()));
		System.out.println(collect);
	}
}
