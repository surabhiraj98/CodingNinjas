
public class Solution {

	public static int firstIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        return index(input, 0, x);
		
	}
	public static int index(int[] input, int startIndex, int x) {
        if (startIndex == input.length) {
            return -1;
        }
        if (input[startIndex] == x) {
            return startIndex;
        }
        return index(input, startIndex + 1, x);
        
}
}
