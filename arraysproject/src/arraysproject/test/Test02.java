package arraysproject.test;

public class Test02 {

	public static void main(String[] args) {
		String str = "abc";
		String str2 = "def";
		String s="";
		for (int i = 0; i < str.length(); i++) {
			
				s += str.charAt(i) + "" + str2.charAt(i);
		}
		System.out.println(s);
	}

}
