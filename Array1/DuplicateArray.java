import java.util.Scanner;

import java.util.Arrays;
public class DuplicateInArray{	
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

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        Arrays.sort(arr);
      int i;
        for(i = 0;i < arr.length - 1 ;i++){
            if(arr[i] == arr[i + 1])
                break;
        }
        return arr[i];
	}

	public static void main(String[] args) {
	 int[] arr = takeInput();
	 int duplicate = duplicate(arr);
System.out.print(duplicate);

	}
}