package arraysproject.test;

public class Test01 {

	public static void main(String[] args) {
		String str = "hi         hello,      ,hjhg  ,  kj. 8976.";
		

		String st1 = str.replaceAll("\\s+", " ");

		int count = 0;
		char[] charArray = str.toCharArray();
		for(int i=0;i<charArray.length;i++) {
			char ch = charArray[i];
			
			if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {
				count++;
			}
		}
		System.out.println(st1);
	}

}
