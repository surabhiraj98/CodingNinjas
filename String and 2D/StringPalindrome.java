import java.util.Scanner;
public class Solution {

	public static boolean checkPalindrome(String str){
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        boolean isPalindrome = true;
		for(int i = 0,j = str.length() - 1;i < (str.length()/2);i++,j--){
		if(str.charAt(i) != str.charAt(j)){
		isPalindrome = false;
		break;
		}
		}
		return isPalindrome;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String str = s.nextLine();
		boolean isPalindrome = checkPalindrome(str);
		System.out.print(isPalindrome);
    }
}
