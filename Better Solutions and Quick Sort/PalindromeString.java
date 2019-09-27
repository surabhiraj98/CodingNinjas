
public class PalindromeSubstrings {
     

	public static int countPalindromeSubstrings(String s) {
		// Write your code here
int n = s.length();
        int count = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j <= n; j++) {
                if (j - i == 1) {
                    count++;
                } else {
                    if (isPalindrome(s, i, j)) {
                        count++;
                    }
                }
            }
        }
        return count;
    }

    public static boolean isPalindrome(String s, int x, int y) {
        int n = y - x;
        int mid = n / 2;
        for (int i = 0; i < mid; i++) {
            if (s.charAt(x++) != s.charAt(--y)) {
                return false;
            }
        }
return true;
	}
}
