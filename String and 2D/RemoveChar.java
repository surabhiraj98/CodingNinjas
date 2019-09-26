import java.util.Scanner;
public class solution {
public static int[][] takeInput(){
		Scanner s = new Scanner(System.in);
		int rows = s.nextInt();
		int cols = s.nextInt();
		int[][] arr = new int[rows][cols];
		for(int i = 0;i < rows;i++) {
			for(int j= 0;j < cols;j++) {
	             arr[i][j] = s.nextInt();			
			}
		}
		return arr;
	}

	public static String removeAllOccurrencesOfChar(String input, char c) {
	    // Write your code here
String result = "";
		for(int i= 0;i < input.length();i++) {
			if(input.charAt(i) == c)
				continue;
			result += input.charAt(i);
		}
		return result;
	}

	public static void main(String[] args) {
       Scanner s = new Scanner(System.in);
       String input = s.nextLine();
       char c = s.next().charAt(0);
       String result = removeAllOccurrencesOfChar(input,c);
System.out.print(result);
	}

}
