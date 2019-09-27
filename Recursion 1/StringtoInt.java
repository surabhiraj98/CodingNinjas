import java.util.Scanner;
public class solution {

	public static int convertStringToInt(String input){
		// Write your code here
return convertStringToInteger(input,input.length()-1);
	}
    public static int convertStringToInteger(String input,int i){
      if(input.length() == 0){
          return 0;
        }
        return ((int)input.charAt(0) - 48)*(int)(Math.pow(10,i)) + convertStringToInteger(input.substring(1),i - 1);

    }

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.print(convertStringToInt(s.nextLine()));

}
}
