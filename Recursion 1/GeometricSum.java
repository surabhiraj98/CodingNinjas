import java.util.Scanner;
public class solution {

	public static double findGeometricSum(int k){
		// Write your code here
if(k==0){
          return 1;
        }
        return findGeometricSum(k - 1)+(1 / Math.pow(2,k));

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.print(findGeometricSum(s.nextInt()));
	}
}
