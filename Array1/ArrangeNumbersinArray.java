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
	public static int[] arrange(int n){
		
		/* Your class should be named Solution
	 	* Don't write main().
	 	* Don't read input, it is passed as function argument.
	 	* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/			
  int i = 0,j = n-1,c = 1;
      int[] arr = new int[n]; 
      for(c = 1; c <= n ;c++){
        if(c % 2 != 0) {
        arr[i] = c;
        i++;
        }
        else {
        arr[j] = c;
        j--;}
      }
      return arr;

	}

	public static void main(String[] args) {
	Scanner s = new Scanner(System.in);
	int n = s.nextInt();
	int[] arr = arrange(n);
	printArray(arr);

	}

	}
