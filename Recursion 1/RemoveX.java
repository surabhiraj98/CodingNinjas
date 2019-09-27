import java.util.Scanner;
public class solution {

	// Return the changed string
	public static String removeX(String input){
		// Write your code here
if(input.length() == 0){
          return "";
        }
      if(input.charAt(0) == 'x'){
        return removeX(input.substring(1));
      }
      else{
        return input.charAt(0) + removeX(input.substring(1));
      }
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.println(removeX(s.nextLine()));
	}
}
