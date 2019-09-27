import java.util.Scanner;
public class solution {

	public static int sumOfDigits(int input){
		// Write your code here
if(input == 0){
          return 0;
        }
      return input % 10 + sumOfDigits(input / 10);

	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in); 
System.out.print(sumOfDigits(s.nextInt()));
	}
}
