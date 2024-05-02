package in.java8;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class TwoArraysInAssendingOrder {
	public static void main(String[] args) {
		int i[] = { 4, 5, 13, 22 };
		int j[] = { 0, 9, 3, 7, 12, 11 };
		Integer[] array = Stream.concat(Arrays.stream(i).boxed(), Arrays.stream(j).boxed()).sorted().toArray(Integer[]::new);
        System.out.println(Arrays.toString(array));
	}
}
