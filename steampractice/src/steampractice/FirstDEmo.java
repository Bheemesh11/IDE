package steampractice;

import java.util.List;

public class FirstDEmo {
	public static void main(String[] args) {
		List<String> javacourses = List.of("core java", "adv java" , "springboot");
		List<String> uicourse = List.of("html", "css", "bs", "js");
		List<List<String>> course = List.of(javacourses, uicourse);
		javacourses.stream().filter(e->e.startsWith("a")).forEach(System.out::println);
	}
}
