import java.util.Scanner;
public class SecondLargest{	
	
	public static int secondLargestElement(int[] arr) {
		/* Your class should be named SecondLargest
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
  		 */
        if((arr.length<=1)||(arr[0]==arr[arr.length-1])) {
			return -2147483648;
		}
		
		
		int largest=Integer.MIN_VALUE;
		int secondLargest=Integer.MIN_VALUE;
		
		for(int j=0;j<arr.length;j++) {
			if(arr[j]>largest) {
			secondLargest=largest;
			largest=arr[j];
			}else if(arr[j]==largest) {
				continue;
			}else if(arr[j]<largest) {
				if(arr[j]>secondLargest) {
					secondLargest=arr[j];
				}
			}
		}
return secondLargest;

	}
}
