import java.util.Scanner;
public class solution {

	public static int multiplyTwoIntegers(int m, int n){
		// Write your code here
	if(n == 1)
          return m;
        int result = m + multiplyTwoIntegers(m,n - 1);
	    return result;
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println(multiplyTwoIntegers(s.nextInt(),s.nextInt()));
}
}
