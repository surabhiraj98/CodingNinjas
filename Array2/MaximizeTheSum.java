import java.util.Scanner;
public class Solution {
public static int[] takeInput() {	
		Scanner s = new Scanner(System.in);
		int n = s.nextInt();
		int[] arr = new int[n];
		for(int i = 0;i<n;i++) {
			arr[i]= s.nextInt();
		}
		return arr;
	}
	public static void printArray(int[] arr) {
		for(int i=0;i<arr.length;i++) {
			System.out.print(arr[i]+" ");
		}
	}
	public static long maximumSumPath(int[] arr1, int[] arr2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		long sum = 0;
		int i=0,j=0,sum1 = 0,sum2 = 0;
		while(i < arr1.length && j<arr2.length) {
			if(arr1[i] < arr2[j]) {
				sum1 += arr1[i];
				i++;
			}
			else if(arr2[j]< arr1[i]) {
				sum2 += arr2[j];
				j++;
			}
			else {
				if(sum1 < sum2) {
					sum += sum2;
				}
				else {
					sum += sum1;
				}
				sum1 = 0;
				sum2 = 0;
				sum += arr1[i];
				i++;
				j++;
			}
		}
		for(;i<arr1.length;i++)
			sum1 += arr1[i];
		for(;j < arr2.length;j++)
			sum2 += arr2[j];
		if(sum1 > sum2)
			sum += sum1;
		else 
			sum += sum2;
		return sum;
	}
	public static void main(String[] args) {
		 int[] arr1 = takeInput();
	      int[] arr2 = takeInput();
	      long sum = maximumSumPath(arr1,arr2);
	System.out.print(sum);
	}
}
