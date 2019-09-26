import java.util.Scanner;
public class Solution {

	public static String compress(String inputString) {
		// Write your code here
int i,c = 1,j = 0;
   String result = "";
   for(i = 0;i < inputString.length() - 1;i++) {
	   if(inputString.charAt(i+1) == inputString.charAt(i)) {
		   c++;	   
	   }
	   else {
		   if(c != 1)
		   result = result + inputString.charAt(i) + c;
		   else
		   result = result + inputString.charAt(i);
           c = 1;
	   }
   }
   if(c != 1)
   result = result + inputString.charAt(i) + c;
   else
   result = result + inputString.charAt(i);   
   return result;
}
	
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		String result = compress(str);
System.out.print(result);
	}

}
