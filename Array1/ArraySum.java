
import java.util.Scanner;

public class Solution {

	
    public static int sum(int[] input){
		
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
