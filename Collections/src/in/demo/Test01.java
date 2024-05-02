package in.demo;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;

public class Test01 {
	public static void main(String[] args) {
		List<Integer> l = new ArrayList<>();
		l.addAll(List.of(1,2,3,4,5,9,10));
//
//		l.contains(3);
//		List<Integer> l1 = new LinkedList<>();
		
//		Stack<Integer> l = new Stack<>();
		
//		l.addAll(List.of(1,2,3,4,5,9,10));
//		System.out.println(l.pop());
//		System.out.println(l);
//		System.out.println(l.peek());
//		System.out.println(l);
//		Iterator<Integer> iterator = l.iterator();
//		while(iterator.hasNext()) {
//			System.out.println(iterator.next());
//		}
		
		
		ListIterator<Integer> listIterator = l.listIterator();
		while(listIterator.hasNext()) {
//			System.out.println(listIterator.next());
			listIterator.next();
		}

		while(listIterator.hasPrevious()) {
			
			System.out.println(listIterator.previous());
		}
		
	}
}
