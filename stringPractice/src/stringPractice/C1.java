package stringPractice;
//check
public class C1 {

	public static void main(String[] args) {
		String str1 = "amazon";
		String str2 = "onamaz";//azonam or onamaz
		System.out.println(approach1(str1, str2));

	}
	
	public static String approach1(String s1, String s2) {
		String clock = s1.substring(2, s1.length())+s1.substring(0, 2);
		String antiClock = s1.substring(s1.length()-2,s1.length())+s1.substring(0, s1.length()-2);
		return (s2.equalsIgnoreCase(antiClock))||(s2.equalsIgnoreCase(clock))?"yes":"no";
	} 

}
