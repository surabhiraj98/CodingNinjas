import java.util.Scanner;
public class solution {

	public static String removeConsecutiveDuplicates(String input) {
	    // Write your code here
String result = "";
		char ch = input.charAt(0);
		result += ch;
		for(int i = 1;i < input.length();i++) {
			if(input.charAt(i) == ch);
			else 
				result += input.charAt(i);
			ch = input.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	String result = removeConsecutiveDuplicates(str);
System.out.print(result);
	}
}
