import java.util.Scanner;
public class ArrayRotate {	
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

	public static void rotate(int[] arr, int d) {
		/* Your class should be named ArrayRotate
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to print or return the output.
      		 * Taking input and printing the output is handled automatically.
     		 */

		int[] arr1 = new int[arr.length];
        int i;
		for(i= 0;i < arr.length;i++) {
			arr1[i] = arr[i];
		}
		for(i = 0;i < arr.length - d;i++) {
			arr[i] = arr1[i+d];
		}
		for(int j = i;j < arr.length;j++) {
			arr[j] = arr1[d - arr.length + j];
		}
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int[] arr = takeInput();
		int d = s.nextInt();
		rotate(arr,d);
		printArray(arr);
	}
}
	
