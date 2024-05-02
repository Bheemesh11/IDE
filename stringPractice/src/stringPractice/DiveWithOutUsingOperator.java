package stringPractice;

public class DiveWithOutUsingOperator {
	public static void main(String[] args) {
		int a = 100;
		int b = 1000;
	   System.out.println( div(a, b));
	}
	
	private static int div(int num1 ,int num2) {

       
       int ans = 0;
       while(num1>=num2) {
    	   num1-=num2;
    	   ans++;
       }
       return ans;
	}
}
