import java.util.Scanner;
public class Solution {

	public static void main(String[] args) {
		// Write your code here
        Scanner s = new Scanner(System.in);
				int n = s.nextInt();
				int i,j,n1 = n-1,n2 = 1,n3 = 1;
				for(i = 1;i <= n;i++){
				    for(j = n1;j > 0;j--){
				        System.out.print(" ");
			        }
			        for(j = n2;j >= 2;j--){
			            System.out.print(j);
			        }
			        for(j = 1;j <= n3;j++){
			            System.out.print(j);
			        }
			    n1--;
			    n2++;
			    n3++;
			    System.out.println();
			    }		
        
	}
}
