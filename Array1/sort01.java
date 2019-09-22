import java.util.Scanner;
public class SortBinaryArray{	
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
	public static void sortBinaryArray(int[] arr){
		/* Your class should be named SortBinaryArray.
		 * Don't write main().
     		 * Don't read input, it is passed as function argument.
     		 * Update in the given array itself. Don't return or print anything.
     		 * Taking input and printing output is handled automatically.
                 */
      
		int c = 0,i;
		for(i = 0;i < arr.length;i++) {
			if(arr[i] == 0)
				c++;
		}
		for(i = 0; i < c;i++ ) {
			arr[i] = 0;
		}
		for(;i < arr.length;i++) {
			arr[i] = 1;
		}
	}

	public static void main(String[] args) {
		int[] arr = takeInput();
		sortBinaryArray(arr);
printArray(arr);

	}
}