public class Solution {

	public static int balancedTreesOfHeightH(int height){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
    //for not getting into negative we use long
       int modValue = (int)Math.pow(10, 9) + 7;
		
		
if(height==0 || height==1) {
			
return 1;
		}
		
int x = balancedTreesOfHeightH(height-1);
		
int y = balancedTreesOfHeightH(height-2);
		
		
long ans1 = ((long)x*x)%(modValue);
		
long ans2 = (2*x*(long)y)%(modValue);
		
		
int res1 = (int) ans1;
		
int res2 = (int) ans2;
		
		
int ans = (res1 + res2)%(modValue);
		
return ans;
	 
	}
}
