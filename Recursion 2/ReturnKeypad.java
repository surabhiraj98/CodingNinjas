import java.util.Scanner;
public class solution {

	// Return a string array that contains all the possible strings
	public static String[] returnKeys(int n) {
		// Write your code here
if(n == 2) {
			return new String[] {"a","b","c"};
		}
		else if(n == 3) {
			return new String[] {"d","e","f"};
		}
		else if(n == 4) {
			return new String[] {"g","h","i"};
		}
		else if(n == 5) {
			return new String[] {"j","k","l"};
		}
		else if(n == 6) {
			return new String[] {"m","n","o"};
		}
		else if(n == 7) {
			return new String[] {"p","q","r","s"};
		}
		else if(n == 8) {
			return new String[] {"t","u","v"};
		}
		else {
			return new String[] {"w","x","y","z"};
		}		
	}
	public static String[] keypad(int n){
		if(n == 0){
          return new String[] {""};
        }
		String[] restOfCombinations = keypad(n/10);
		String[] totalCombinations = new String[returnKeys(n % 10).length * restOfCombinations.length];
		int k = 0;
		for(String s1:restOfCombinations) {
			for(String s2:returnKeys(n % 10)) {
				totalCombinations[k++] = s1 + s2;
			}
		}
		return totalCombinations;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String[] result = keypad(s.nextInt());
        for(String val:result) {
        	System.out.println(val);
}
	}
	
}

