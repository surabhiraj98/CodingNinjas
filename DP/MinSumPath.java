public class Solution {
    
	public static int minCostPath(int input[][]) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		int m = input.length;
		
int n = input[0].length;
		
		
int[][] dp = new int[m+1][n+1];
		
for(int i=0;i<dp.length;i++) {
			
for(int j=0;j<dp[0].length;j++) {
				
dp[i][j] = Integer.MAX_VALUE;
			}
		}
	
	
		for(int i=1;i<=m;i++) {
		
	for(int j=1;j<=n;j++) {
			
	if(i==1 && j==1) {
					
dp[i][j] = input[i-1][j-1];
					
continue;
				}
			
	int ans1 = dp[i-1][j];
				
int ans2 = dp[i][j-1];
				
int ans3 = dp[i-1][j-1];
			
	dp[i][j] = Math.min(ans1, Math.min(ans2, ans3)) + input[i-1][j-1];
			}
		}
	
	return dp[m][n];
	
	}
}
