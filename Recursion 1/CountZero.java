import java.util.Scanner;
public class solution {

	public static int countZerosRec(int input){
		// Write your code here
       if(input/10 == 0) {
           
           if(input == 0) {
            return 1;
        }
           return 0;
       }
        
		
        
       int smallAns = countZerosRec(input/10);
        if(input % 10 == 0) {
            return smallAns + 1;
        }
        return smallAns;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
System.out.print(countZerosRec(s.nextInt()));
	}
}
