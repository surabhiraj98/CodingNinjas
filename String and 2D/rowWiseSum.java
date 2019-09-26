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

	public static void main(String[] args) {
		/* Your class should be named Solution.
	 	* Read input as specified in the question.
	 	* Print output as specified in the question.
		*/
int[][] arr =takeInput();
	 int rSum,i,j;
	 for(i = 0;i < arr.length;i++) {
		 rSum = 0;
		 for(j = 0;j < arr[i].length;j++) {
			 rSum += arr[i][j];
		 }
		 System.out.print(rSum + " ");
	 }
}
	}
