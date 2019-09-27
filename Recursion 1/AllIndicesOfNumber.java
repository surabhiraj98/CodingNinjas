
public class Solution {

	public static int[] allIndexes(int input[], int x) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		return allIndexes(input,x,0);
	}
    public static int[] allIndexes(int input[], int x,int startIndex){
	      if(startIndex == input.length){
	        int[] rv = new int[0];
	        return rv;
	      }
	      int[] roaIndex = allIndexes(input,x,startIndex + 1);
	      if(input[startIndex] == x){
	        int[] totalIndex = new int[(roaIndex.length) + 1];
	        totalIndex[0] = startIndex;
	        for(int i = 0;i < roaIndex.length;i++){
	          totalIndex[i+1] = roaIndex[i];
	        }
	        return totalIndex;
	      }
	      else{
	        return roaIndex;
} 
    }
}
