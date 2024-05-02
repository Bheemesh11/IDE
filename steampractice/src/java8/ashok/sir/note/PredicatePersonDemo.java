package java8.ashok.sir.note;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class PredicatePersonDemo {
	public static void main(String[] args) {
		Person p1 = new Person("John", 26);
		Person p2 = new Person("Smith", 16);
		Person p3 = new Person("Raja", 36);
		Person p4 = new Person("Rani", 6);
		
		List<Person> asList = Arrays.asList(p1,p2,p3,p4);
		
		Predicate<Person> person = p->p.age>=18;
		
		for(Person p : asList) {
			if(person.test(p))
				System.out.println(p.getName());
		}
	}
}
