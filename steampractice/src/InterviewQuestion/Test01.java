package InterviewQuestion;

import java.util.Arrays;
import java.util.OptionalInt;

public class Test01 {

	public static void main(String[] args) {
		 int[] arr ={2,1,7,9,3,0};
		 OptionalInt min = Arrays.stream(arr).min();
		 int asInt = min.getAsInt();
		 System.out.println(asInt);
	}

}
