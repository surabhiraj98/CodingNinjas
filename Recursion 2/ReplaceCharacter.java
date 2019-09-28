
public class Solution {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
if(input.length()==1)
		{
			if(input.charAt(0)==c1) {
			return c2+"" ;}
			else {
				return input ;}
		}
		String myans = replaceCharacter(input.substring(1), c1, c2) ;
		if(input.charAt(0)==c1)
		{
			String temp = c2 + myans ;
			myans = temp ;
		}
		else
		{
			String temp = input.charAt(0) + myans ;
			myans = temp ;
		}
		return myans ;
	}

	public static void main(String[] args) {
		
System.out.println(replaceCharacter("lokilokill", 'l', 't'));
	}
}
