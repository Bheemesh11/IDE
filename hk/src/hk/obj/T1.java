package hk.obj;

public class T1 {
	public void m1() {
		this.a=null;
	}
	public void m2() {
		this.m1();
	}
	T1 a =null;
	public static void main(String[] args) {
         m1 a = new m1();
         Object o = null;
        
         
	}
}
class m1{
	
}