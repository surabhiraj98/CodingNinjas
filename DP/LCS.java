
public class Solution {

	
	public static int lcs(String s1, String s2){
		
	/* Your class should be named Solution
	 * Don't write main().
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	*/
int[][] storage = new int[s1.length() + 1][s2.length() + 1];
        return lcs(s1, s2, storage);

    }

    public static int lcs(String s1, String s2, int[][] storage) {

        int m = s1.length();
        int n = s2.length();

        if (storage[m][n] > 0) {
            return storage[m][n];
        }
        if (m == 0 || n == 0) {
            storage[m][n] = 0;
            return storage[m][n];
        }
        if (s1.charAt(0) == s2.charAt(0)) {
            storage[m][n] = 1 + lcs(s1.substring(1), s2.substring(1), storage);
            return storage[m][n];

        } else {
            int op1 = lcs(s1.substring(1), s2, storage);
            int op2 = lcs(s1, s2.substring(1), storage);
            storage[m][n] = Math.max(op1, op2);
            return storage[m][n];
        }

    }
}

    
