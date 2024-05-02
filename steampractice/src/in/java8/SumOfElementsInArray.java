package in.java8;

import java.util.Arrays;
import java.util.stream.Collectors;

public class SumOfElementsInArray {
public static void main(String[] args) {
	int a[] = { 3, 6, 32, 1, 8, 5, 31, 22 };
	
	int sum = Arrays.stream(a).sum();
	System.out.println(sum);
	
	long sum2 = Arrays.stream(a).summaryStatistics().getSum();
	System.out.println(sum2);
	
	int intValue = Arrays.stream(a).boxed().reduce(0, (c,d)->c+d).intValue();
	System.out.println(intValue);
}
}
