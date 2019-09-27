public class Solution {
	
	public static boolean checkNumber(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		 return check(input, 0, x);
	}
    public static boolean check(int[] input, int startIndex, int x) {
        if (startIndex == input.length) {
            return false;
        }

        if (input[startIndex] == x) {
            return true;
        }
        return check(input, startIndex + 1, x);

}
}
