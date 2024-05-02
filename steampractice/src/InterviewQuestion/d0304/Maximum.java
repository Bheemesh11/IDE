package InterviewQuestion.d0304;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Maximum {
	public static void main(String[] args) {
		List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32,15);
		
		
		Optional<Integer> findFirst = myList.stream().sorted(Comparator.reverseOrder()).skip(1).findFirst();
		System.out.println(findFirst.get());
		
		Integer integer = myList.stream().min(Integer::compare).get();
		System.out.println(integer);
	}
}
