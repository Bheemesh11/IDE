package java8.ashok.sir.note;

import java.util.Arrays;

public class StringStrartWithA {
	public static void main(String[] args) {
		String[ ]  names = {"Anushka", "Anupama", "Deepika", "Kajol", "Sunny" };
		
		Arrays.stream(names).filter(e->e.startsWith("A")).forEach(System.out::println);
	}
}
