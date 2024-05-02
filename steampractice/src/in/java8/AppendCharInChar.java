package in.java8;

import java.util.stream.Stream;

//- Write a program to append char in char ex-input- {A, B, C} 
//output->[A_X, B_Y, C_Z].
public class AppendCharInChar {
	public static void main(String[] args) {
		Stream<Character> of = Stream.of('A', 'B', 'C');
		of.forEach(c -> {
			char e = (char) (c + F);
			System.out.println(c + "_" + e);
			System.out.println();
			
		});
	}
}
