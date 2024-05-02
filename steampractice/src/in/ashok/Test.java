package in.ashok;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Test {

	public static void main(String[] args) {
//		IntStream.rangeClosed(1, 100).forEach(System.out::println);

		// Stream.iterate(1,(n)->n+1).limit(100).forEach(System.out::print);

//		

//		String str = "Hello world";
//		Map<Character, Long> collect = str.chars().mapToObj(e -> (char) e)
//				.collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
//             
//		Comparator<Entry<Object, ?>> comparingByValue = Map.Entry.comparingByValue();
//		Character key = collect.entrySet().stream().max(Map.Entry.comparingByValue()).get().getKey();
//             System.out.println(key);

//		String str = "Hello World";
//		
////		Map<Character, Long> collect = str.chars().mapToObj(e->(char)e).collect(Collectors.groupingBy(e-> e, Collectors.counting()));
////		collect.entrySet().stream().filter(e->e.getValue()>1).forEach(System.out::println);
//		
//		str.chars().mapToObj(e-> (char)e).filter(e->str.indexOf(e)!=str.lastIndexOf(e)).distinct().forEach(System.out::println);

		int[] arr = { 1, 2, 3, 4, 5, 64 ,34,786};
//		Integer[] array = IntStream.range(0, arr.length).mapToObj(e -> arr[arr.length - 1 - e]).toArray(Integer[]::new);
//		int[] ar = new int[arr.length];
//		
//		Integer[] array2 = Stream.iterate(0,n->n+1).limit(arr.length).map(e->arr[arr.length-1-e]).toArray(Integer[]::new);
//		System.out.println(Arrays.toString(array));
//		System.out.println(Arrays.toString(array2));
		
		Map<Boolean, List<Integer>> collect = Arrays.stream(arr).boxed().collect(Collectors.partitioningBy(e->e%2==0));
		
		
		System.out.println(" Even" + collect.get(true));
		System.out.println(" Odd " + collect.get(false));
		
		
		

	}
}
