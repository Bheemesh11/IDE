package InterviewQuestion.d0304;

import java.util.LinkedHashSet;
import java.util.Set;

public class FirstNonRepeatedCharacter {
	public static void main(String[] args) {
		String input = "Java articles are Awesome";
		Character character = input.chars().mapToObj(e->(char)e)
		.filter(e->input.indexOf(e)==input.lastIndexOf(e)).findFirst().get();
		
		
		System.out.println(character);
		

	}
}
