import java.util.Scanner;
public class Solution {
    public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0;i < rows;i++) {
			for(int j= 0;j < cols;j++) {
	             arr[i][j] = s.nextInt();			
			}
		}
		return arr;
	}	

	public static int rowSum(int[][] arr,int row) {
		int rSum = 0;
			for(int j = 0;j < arr[row].length;j++) {
				rSum += arr[row][j]; 
			}
		return rSum;
	}
	
	public static int colSum(int[][] arr,int col) {
		int cSum = 0;
			for(int i = 0;i < arr.length;i++) {
				cSum += arr[i][col]; 
			}
		return cSum;
	}
	

	
	public static void findLargest(int input[][]){
		
		/* Your class should be named Solution.
		* Don't write main() function.
	 	* Don't read input, it is passed as function argument.
	 	* Print output as specified in the question
		*/
int maxSum = rowSum(input,0);
		String dim = "row";
		int index = 0;
		for(int i = 1;i < input.length;i++)
			if(maxSum < rowSum(input,i)) {
				maxSum = rowSum(input,i);
				dim = "";
				dim += "row";
				index = i;
			}
		
		for(int j = 0;j < input[0].length;j++)
			if(maxSum < colSum(input,j)) {
				maxSum = colSum(input,j);
				dim = "";
				dim += "column";
				index = j;
			}
	  System.out.print(dim + " " + index + " " + maxSum);
	}

	public static void main(String[] args) {
	int[][] arr = takeInput();	
	findLargest(arr);
}
}

