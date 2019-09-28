import java.util.Scanner;
public class solution {

	public static void permutations(String input){
		// Write your code here
printPermutations(input,"");
	}
    public static void printPermutations(String input,String outputSoFar){
      if(input.length() == 0){
        System.out.println(outputSoFar);
        return;
      }
      for(int i = 0; i < input.length();i++){
        char ch = input.charAt(i);
        String toBePermuted = input.substring(0,i) + input.substring(i + 1);
         printPermutations(toBePermuted,outputSoFar + ch);
      }
    }

	public static void main(String[] args) {
	   Scanner s = new Scanner(System.in);
printPermutations(s.next(),"");
}
}
