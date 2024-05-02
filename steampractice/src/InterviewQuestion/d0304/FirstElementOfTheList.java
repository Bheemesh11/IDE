package InterviewQuestion.d0304;

import java.util.List;

public class FirstElementOfTheList {
public static void main(String[] args) {
	List<Integer> of = List.of(1,13,3,14,79,90,43,77);
	
	//of.stream().filter(e->e.toString().length()>1).map(e->e.toString().charAt(0)).forEach(System.out::println);
	
	of.stream().findFirst().ifPresent(System.out::println);
	long count = of.stream().count();
	System.out.println(of.size());
	
}
}
