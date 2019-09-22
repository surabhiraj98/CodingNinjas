import java.util.Scanner;
public class FindUnique{	

	public static int findUnique(int[] arr){
	
		 for (int i = 0; i <arr.length ; i++) {
        int j;
            for ( j = 0; j <arr.length ; j++) {
             if(i!=j){
                 if(arr[i]==arr[j]){
                     break;
                 }
             }
            }
            if (j==arr.length){
                return arr[i];
            }
        }
        return Integer.MAX_VALUE;
}

	}