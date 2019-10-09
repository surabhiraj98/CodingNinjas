
public class solution {
	 static int INF = 1000000000;
    int [][] dp;
    int [][] next;
	public int solve(String S,String V){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input. Input is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        int n = S.length(), m = V.length() ,i,j,prev;
        dp = new int[n+1][m+1];
        next = new int[n+1][m+1];
        for(i=0;i<n;i++){
            prev = -1;
            for(j=0;j<m;j++){
                if(S.charAt(i)==V.charAt(j))
                    prev = j;
                next[i+1][j+1]=prev;
            }
        }
        for(i=1;i<=n;i++)
            dp[i][0]=1;
        
        for(i=0;i<=m;i++){
            dp[0][i] = INF;
        }
      for(i=1;i<=n;i++){
          for(j=1;j<=m;j++){
              if(next[i][j]== -1)
                  dp[i][j]=1;
              else {
                  dp[i][j] = Math.min(dp[i-1][j],1+dp[i-1][next[i][j]]);
              }
          }
      }  
     return dp[n][m];   
	}
}

