package InterviewQuestion;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test02 {
public static void main(String[] args) {
	String s = "Bheemesh";
    Map<Character, Integer> map = new LinkedHashMap<>();
    
    for(int i=0;i<s.length();i++){
        if(!map.containsKey(s.charAt(i))) {
        	map.put(s.charAt(i),1 );
        }
        
    }
    String ans = "";
    
    for(Character c : map.keySet()) {
    	ans+=c;
    }
    
    System.out.println(ans);
    
}

}
