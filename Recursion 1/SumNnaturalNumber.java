
public class Solution {

	public static int sum(int n) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(n<=1) {
		return 1;
	}
	int ans1 = sum(n-1);
	
	int ans = n+ans1;
	return ans;
	
	}
	}
