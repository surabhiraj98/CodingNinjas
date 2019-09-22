
import java.util.Scanner;

public class Solution {

	
    public static int sum(int[] input){
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/	
		int retVal = Sum(input);
        return retVal;
			
	}
	
	public static int Sum(int[] arr) {
		int sum = 0;
    	for(int i=0; i<arr.length; i++){
    		sum = sum + arr[i];
    	}
		
			return sum;
	}
	
	}