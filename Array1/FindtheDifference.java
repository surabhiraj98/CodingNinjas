import java.util.Scanner;
public class Solution {
public static int[] takeInput() {
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = s.nextInt();
		}
		return arr;
	}
	
	public static void printArray(int[] arr) {
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i] + " ");
		}
}
	
	public static int findDifference(int[] input){

		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/	
int sumEven = 0,sumOdd = 0;
	      for(int i = 0;i < input.length;i++){
	        if(i % 2 == 0)
	          sumEven += input[i];
	        else 
	          sumOdd += input[i];
	      }
	      return sumEven - sumOdd;
		}

	public static void main(String[] args) {
		int[] arr = takeInput();
		int difference = findDifference(arr);
		System.out.print(difference);

	}
	
}
