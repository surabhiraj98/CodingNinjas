import java.util.*;
public class solution {

	public static String uniqueChar(String str){
		// Write your code here
 Map<Character,Boolean> mp=new HashMap<>();
        String uniqueString="";
        for(int i=0;i<str.length();i++){
            
            if(mp.containsKey(str.charAt(i))){
                continue;
            }
            mp.put(str.charAt(i),true);
            uniqueString+=str.charAt(i);
        }
        return uniqueString;

	}
}
