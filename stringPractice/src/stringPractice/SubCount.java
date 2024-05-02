package stringPractice;



public class SubCount {
	public static void main(String[] args) {
		System.out.println(sub(100,10));
	}
	
	private static int sub(int a ,int b) {
		int count = 0;
		while(a>0) {
			a-=b;
			count++;
		}
		return count;
	}
	
}
