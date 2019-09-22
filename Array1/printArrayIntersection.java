import java.util.Scanner;
import java.util.Arrays;
public class Intersection{
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
	
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
        Arrays.sort(arr1);
      Arrays.sort(arr2);
      int i = 0,j = 0;
      while(i < arr1.length && j < arr2.length){
        if(arr1[i] < arr2[j]){
          i++;
        }
        else if(arr2[j] < arr1[i]){
         j++;          
        }
        else{
        System.out.println(arr1[i]);
          i++;
          j++;
        }
      }
	}

	public static void main(String[] args) {
     int[] arr1 = takeInput();
     int[] arr2 = takeInput();
intersection(arr1,arr2);

	}
}