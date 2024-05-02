package InterviewQuestion.d0304;

import java.util.List;
import java.util.stream.Collectors;

//Given a list of integers,
//find out all the numbers starting with 1 using Stream
// functions?
public class StartWith1 {
	public static void main(String[] args) {
		
		List<Integer> l = List.of(1,2,3,11,14,45,78,10,12,8,15,23,87);
		l.stream().filter(e->e.toString().startsWith("1")).forEach(System.out::println);
		
		List<String> collect = l.stream().map(String::valueOf).filter(e->e.startsWith("1")).toList();
		System.out.println(collect);
	}}
