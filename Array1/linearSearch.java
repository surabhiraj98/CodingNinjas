import java.util.Scanner;
public class LinearSearch{	
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
	public static int linearSearch(int[] arr, int num){
		/* Your class should be named LinearSearch
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		boolean flag = false;
      int i;
      for(i = 0;i < arr.length;i++){
        if(num == arr[i])
        {
          flag = true;
          break;
        }
      }
      
      if(flag == false)
        return -1;
      else 
        return i;	
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
		int[] arr = takeInput();
		int elem = s.nextInt();
		int result = linearSearch(arr,elem);
		System.out.print(result);	
	}
}