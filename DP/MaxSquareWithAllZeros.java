
public class Solution {
	
	public static int findMaxSquareWithAllZeros(int[][] input){
		
	/* Your class should be named Solution.
	 * Don't write main() function.
	 * Don't read input, it is passed as function argument.
	 * Return output and don't print it.
	 * Taking input and printing output is handled automatically.
	 */

	 int max = 0;
        int[][] array = new int[input.length][input[0].length];
        for(int i=0;i<input.length;i++){
            if(input[i][0]==0){
                array[i][0] = 1;
                max = 1;
                
            } else 
                array[i][0]=0;
        }
        for(int j=0;j<input[0].length;j++){
            if(input[0][j]==0){
                array[0][j] = 1;
                max = 1;
                
            } else
                array[0][j]=0;
        }
        for(int i=1;i<input.length;i++){
            for(int j=1;j<input[0].length;j++){
            if(input[i][j]==1){
                array[i][j]=0;
            }
                else {
                    array[i][j]=1+Math.min(array[i-1][j-1],Math.min(array[i][j-1],array[i-1][j]));
                    if(array[i][j]>max){
                        max = array[i][j];
                    }
                }
            }
        }
            
     return max;       
        
	}

	
}
