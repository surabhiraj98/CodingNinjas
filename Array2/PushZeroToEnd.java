import java.util.Scanner;
public class PushZerosAtEnd {
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
	
	public static void pushZerosAtEnd(int[] arr){
		/* Your class should be named PushZerosAtEnd 
		 * Don't write main().
	         * Don't read input, it is passed as function argument.
     		 * No need to return or print the output.
     		 * Taking input and printing output is handled automatically.
     		 */
        int i,j;
	      for(i = 0,j = 0;j < arr.length;j++) {
			if(arr[j] != 0){	
	        arr[i] = arr[j];
	        i++;
	        }
	      }
	        for(int k = i;k < arr.length;k++)
	          arr[k] = 0;
		}

		public static void main(String[] args) {
		int arr[] = takeInput();
		pushZerosAtEnd(arr);
		printArray(arr);


	}
}
