import java.util.Scanner;
public class solution {

	// Return the subsequences saved in a string array
	public static String[] subsequence(String input){
		// Write your code here
if(input.length() == 0) {
			String[] rv = {""};
			return rv;
		}
		// Wrap the code except (base case) in else to increase readabilty
		else {
		String[] restSubSequences = subsequence(input.substring(1));
		String[] totalSubSequences = new String[restSubSequences.length * 2];
		int i,j = 0;
		for(i = 0;i < restSubSequences.length ;i++) {
			totalSubSequences[i] = restSubSequences[i];
		}
		for(;i < totalSubSequences.length;i++,j++) {
			totalSubSequences[i] = input.charAt(0) + restSubSequences[j]; 
		}
		return totalSubSequences;
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] res = subsequence(input);
		for(String val:res) {
			System.out.println(val);
}
	}
}
