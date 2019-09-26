import java.util.Scanner;
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        String str = "";
		for(int i = 0;i < input.length();i++) {
			if(input.charAt(i) == c1) {
				str += c2;
			}else {
				str += input.charAt(i);
			}	
		}
		return str;
	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	String str = s.nextLine();
	char c1 = s.next().charAt(0);
	char c2 = s.next().charAt(0);
	String str2 = replaceCharacter(str,c1,c2);
	System.out.print(str2);
}

	}

