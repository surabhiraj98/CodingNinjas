import java.util.Scanner;
public class Solution {
	
	public static String minLengthWord(String input){
		
		// Write your code here
int start = 0,end,j,c = 0,d,i = 0,k;
		String str = "",result = "";
		for(i= 0;i < input.length();i++) {
			if(input.charAt(i) == ' ') {
				    end = i - 1;
				for(j = start; j <= end;j++)
				{
					str += input.charAt(j);

				}
					result = str;
					start = i+1;
					break;
			}
		}
		for(k = i+1;k < input.length();k++) {
			if(input.charAt(k) == ' ') {
				end = k - 1;
				str = "";
				for(j = start; j <= end;j++)
				{
					str += input.charAt(j);

				}
				if(str.length() < result.length())
					result = str;
				start = k + 1;
			}
			}
		str = "";
		for(k = start;k < input.length();k++) {
			str += input.charAt(k);
		}
		if(str.length() < result.length())
			result = str;
		return result;
	}

	public static void main(String[] args) {
		 Scanner s = new Scanner(System.in);
			String str = s.nextLine();
			String result = minLengthWord(str);
			System.out.print(result);
}
	}

