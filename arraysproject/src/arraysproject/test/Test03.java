package arraysproject.test;

public class Test03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Test03 o = new Test03();
		o.print(1);
	}
	
	
	public int print(int i) {
		if(i<=10) {
			System.out.println(i);
			return print(++i);
		}else {
		return i;
		}
	}

}
