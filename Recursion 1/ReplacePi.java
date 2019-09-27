import java.util.Scanner;
public class solution {

	// Return the changed string
	public static String replace(String input){
		// Write your code here
if(input.length() <= 1){
      return input;
    }
      String r = replace(input.substring(1));
     if(input.charAt(0) == 'p'){
       if(r.charAt(0) == 'i'){
         return "3.14" + r.substring(1);
       }
       else{
         return input.charAt(0) + r;
       }
     }
      else{
         return input.charAt(0) + r;
       } 
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.print(replace(s.nextLine()));
	}
}
