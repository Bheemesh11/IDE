package in.java8;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.NoSuchElementException;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class MajorityElementsInArray {
	public static void main(String[] args) {
		int majorityArray[] = { 5, 3, 2, 1, 2, 4, 3, 2, 6, 2, 3 };

		Entry<Integer, Long> orElseThrow = Arrays.stream(majorityArray).boxed()
				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
				.filter(e -> e.getValue() > majorityArray.length / 2).max(Map.Entry.comparingByValue())
				.orElseThrow(() -> new NoSuchElementException("Boss your element is not found"));

		;
		
		System.out.println(orElseThrow.getKey());

	}
}
