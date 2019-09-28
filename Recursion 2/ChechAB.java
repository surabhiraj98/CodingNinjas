import java.util.Scanner;
public class Solution {

	public static boolean checkAB(String input) {
		// Write your code here
 if(input.length() == 0){
          return true;
        }
       if(input.length() == 1){
         if(input.charAt(0) == 'a')
         return true;
         else
         return false;
       }
       if(input.charAt(0) == 'a'){
         if(input.charAt(1) == 'b' && input.length() > 2 && input.charAt(2) == 'b')
           return checkAB(input.substring(3));
         else if(input.charAt(1) == 'a')
           return checkAB(input.substring(1));
         else 
           return false;
       }
      else 
         return false;
   }

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
System.out.println(checkAB(s.next()));
	}
}
