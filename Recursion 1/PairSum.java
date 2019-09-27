import java.util.Scanner;
public class solution {

	// Return the updated string
	public static String addStars(String s) {
		// Write your code here
if(s.length() <= 1){
          return s;
        }
       String r = addStars(s.substring(1));
       if(s.charAt(0) == r.charAt(0)){
         return s.charAt(0) + "*" + r;
       }
      else{
        return  s.charAt(0) + r;
      }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.print(addStars(s.nextLine()));
	}
}
