import java.util.Scanner;
public class Solution {

	public static int countWords(String str){
	
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
	 	* Taking input and printing output is handled automatically.
		*/
int noOfWords = 1;
		for(int i = 0;i < str.length();i++) {
			if(str.charAt(i) == ' ')
				noOfWords++;
		}
		return noOfWords;
	}
	
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		String str = s.nextLine();
		int noOfWords = countWords(str);
		System.out.print(noOfWords);
	}
	

}
