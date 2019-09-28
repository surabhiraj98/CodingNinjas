import java.util.Scanner;
public class Solution {

	public static int findWays(int n){
		
		
		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 
 if(n == 0){
	          return 0;
	      }
	      if(n ==1){
	         return 1;
	      }
	      if(n == 2){
	        return 2;
	      }
	      if(n == 3){
	        return 4;
	      }
	      int y = findWays(n - 1) + findWays(n - 2) + findWays(n-3);
	      return y;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.println(findWays(s.nextInt()));
	}
}
