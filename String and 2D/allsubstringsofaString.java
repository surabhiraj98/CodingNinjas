import java.util.Scanner;
public class Solution {

	public static void printSubstrings(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question.
		*/
for(int i = 0; i < str.length();i++) {
			for(int j = i+1 ;j <= str.length();j++) {
				System.out.println(str.substring(i,j));
			}
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        String str = s.nextLine();
        printSubstrings(str);
	}
	

}
