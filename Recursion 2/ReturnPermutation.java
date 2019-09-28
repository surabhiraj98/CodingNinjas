import java.util.Scanner;
public class solution {
    public static int fact(int n) {
		int fact = 1;
		for(int i = n;i >= 1;i--) {
			fact = fact * i;
		}
		return fact;
	}

	
	public static String[] permutationOfString(String input){
		// Write your code here
		if(input.length() == 1){
	        String[] retVal = {input};
	        return retVal;
	      }
	      String[] rop = permutationOfString(input.substring(1));
	      String[] tp = new String[fact(rop[0].length() + 1)];
	      int k = 0;
	      for(int i = 0;i < rop.length;i++){
	    	  String temp = rop[i];
	    	for(int j = 0;j <= temp.length();j++,k++) {
	    		tp[k] = temp.substring(0,j) + input.charAt(0) + temp.substring(j);
	    	}
	      }
			return tp;
		}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		String input = s.next();
		String[] result = permutationOfString(input);
		for(String val:result) {
			System.out.println(val);
}
	}
	
}
