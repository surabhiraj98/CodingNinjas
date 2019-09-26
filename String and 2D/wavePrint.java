
public class Solution {

	
	// input - input 2D array
	public static void wavePrint(int input[][]){
		
		// Write your code here
for (int i = 0; i < input[0].length; i++) {
            if (i % 2 == 0) {
                for (int j = 0; j <=input.length-1; j++) {
                    System.out.print(input[j][i]+" ");
                }
            }
            else if (i % 2 != 0) {
                for (int j = input.length - 1; j >= 0; j--) {
                    System.out.print(input[j][i]+" ");
                }
            }
        }

    }


    public static void main(String[] args) {
         int[][] arr = {{1, 2, 3, 4}, {5, 6, 7, 8}, {9, 10, 11, 12}};
        wavePrint(arr);
    }
}
