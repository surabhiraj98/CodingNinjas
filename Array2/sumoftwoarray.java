import java.util.Scanner;
public class SumOfTwoArrays{	
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
	public static int[] sumOfTwoArrays(int[] arr1, int[] arr2){
		/* Your class should be named SumOfTwoArrays
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return the output array. No need to print.
		 * Taking input and printing output is handled automatically.
		 */
 int carry = 0,k,i,j;
			int[] arr3;
			if(arr1.length > arr2.length) {
				 arr3 = new int[arr1.length + 1];
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						arr3[i + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = i+1;k > 0 && i >= 0;k--) {
					 arr3[k] = (arr1[i] + carry) % 10;
				     carry = (arr1[i] + carry) / 10;
	               i--;
				 } 
				 arr3[0] = carry;
			}
			else {
				 arr3 = new int[arr2.length + 1];
				 i = arr1.length - 1;
	             j = arr2.length - 1;
				 while(i >= 0 && j >= 0) {
						arr3[j + 1] = (arr1[i] + arr2[j] + carry) % 10;
						carry = (arr1[i] + arr2[j] + carry)/10;
						i--;
						j--;
			}
				 for(k = j+1;k > 0 && j >= 0;k--) {
					 arr3[k] = (arr2[j] + carry) % 10;
				     carry = (arr2[j] + carry) / 10;
	                 j--;
				 }
				 arr3[0] = carry;
		}
			return arr3;
	}

	public static void main(String[] args) {
	int[] arr1 = takeInput();
	int[] arr2 = takeInput();
	int[] arr3 = sumOfTwoArrays(arr1,arr2);
	printArray(arr3);

	}
}
