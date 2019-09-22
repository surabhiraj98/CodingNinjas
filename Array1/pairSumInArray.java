import java.util.Scanner;
public class PairSum{	
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
	public static void pairSum(int[] arr, int num){
		/* Your class should be named PairSum
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		 */
for(int i = 0;i < arr.length - 1;i++){
			for(int j = i + 1;j < arr.length;j++){
				if((arr[i] + arr[j])==num) {
					if(arr[i] < arr[j]) {
					System.out.print(arr[i] + " ");
					System.out.print(arr[j] + " ");
	                System.out.println();
					}
					else {
						System.out.print(arr[j] + " ");
						System.out.print(arr[i] + " ");
		                System.out.println();
						}	
				}
			}
			
		}
	}

	public static void main(String[] args) {
	 Scanner s = new Scanner(System.in);
	 int[] arr = takeInput();
	 int num = s.nextInt();
pairSum(arr, num);
	}
}