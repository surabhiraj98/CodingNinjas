import java.util.Scanner;
import java.util.Arrays;
public class TripletSum {	
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
	public static void FindTriplet(int[] arr, int x){
		/* Your class should be named TripletSum.
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
		 * Taking input is handled automatically.
		 */
        Arrays.sort(arr);
        for(int i = 0;i < arr.length -2;i++){
            for(int j = i + 1;j < arr.length;j++){
              for(int k = j + 1;k < arr.length;k++){
                if((arr[i] + arr[j] + arr[k]) == x)
                 System.out.print(arr[i] + " " + arr[j] + " " + arr[k] + "\n");
              }
            }
          }
    	}
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		 int[] arr = takeInput();
		 int num = s.nextInt();
            FindTriplet(arr, num);
	}
}