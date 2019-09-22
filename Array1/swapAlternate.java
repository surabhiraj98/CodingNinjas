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

	public static void swapAlternate(int[] arr){
		
		/* Your class should be named Solution.
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
		* Taking input and printing output is handled automatically.
		*/			
        int i;
      for(i = 0; i < arr.length - 1;i = i + 2){
        int t = arr[i];
        arr[i] = arr[i + 1];
        arr[i + 1] = t;   
      }
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		swapAlternate(arr);
		printArray(arr);

	}
	}
	

