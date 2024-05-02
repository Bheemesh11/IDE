package InterviewQuestion.d0304;

import java.util.Collections;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Collectors;

//How to find duplicate elements in a given
//integers list in java using Stream functions?
public class DublicateElements {
public static void main(String[] args) {
		
		List<Integer> l = List.of(1,2,3,11,2,3,10,8,1);
		Set<Integer> s  = new LinkedHashSet<Integer>();
//		 l.stream().filter(e->!s.add(e)).forEach(System.out::println);
		l.stream().filter(e->Collections.frequency(l, e)>1).collect(Collectors.toSet()).forEach(System.out::println);
}}		
