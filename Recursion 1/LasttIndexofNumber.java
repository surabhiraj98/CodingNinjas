
public class Solution {

	public static int lastIndex(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
         return lastIndexOfElement(input,x, 0);
	}
	public static int  lastIndexOfElement(int[] input,int x,int startIndex){
	       if(startIndex == input.length)
	         return -1;     
	       int index =  lastIndexOfElement(input,x,startIndex + 1);
	       if(index == -1)
	       {
	         if(x == input[startIndex])
	           return startIndex;
	         else 
	           return -1;
	       }
	       else
	         return index;  
} 
}
