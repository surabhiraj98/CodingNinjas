import java.util.Scanner;
public class solution {

	public static void printSubsequences(String input) {
		// Write your code here
printSubsequences(input, "");
	}
    public static void printSubsequences(String input, String outputSoFar) {
		if (input.length() == 0) {
			System.out.println(outputSoFar);
			return;
		}
		printSubsequences(input.substring(1), outputSoFar);
		printSubsequences(input.substring(1), outputSoFar + input.charAt(0));
	}
	
public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);
		
		String input = scanner.next();
		
printSubsequences(input);
}
}

