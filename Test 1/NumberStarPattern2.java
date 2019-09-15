
import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {

		// Write your code here		
Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int n1=n,n2=n-1,n3=n;
      for(int i = n;i>=1;i--){
          for(int j=1;j<=n1;j++){
               System.out.print(j);
	        }
		    for(int j = n2;j < n-1;j++){
		        System.out.print("**");
	        }
	        for(int j = n3;j >= 1;j--){
	            System.out.print(j);

	        }
	        n1--;
		    n2--;
		    n3--;
		    System.out.println();
	    }	
              
     }
 }
