import java.util.*;
public class solution {

	// Return a string array that contains all possible codes
	public static  String[] getCode(String input){
		// Write your code here
		if (input.length() == 0) {
            // return new String[0];
            String[] myAns = { "" };
            return myAns;
        }
        int firstdigit = (input.charAt(0) - '0');
        String[] smallAns1 = getCode(input.substring(1));
        String[] smallAns2 = new String[0];

        int firsttwodigits = 0;
        if (input.length() >= 2) {
            firsttwodigits = (input.charAt(0) - '0') * 10 + (input.charAt(1) - '0');
            if (firsttwodigits > 10 && firsttwodigits <= 26) {
                smallAns2 = getCode(input.substring(2));
            }
        }
        String[] myAns = new String[smallAns1.length + smallAns2.length];
        int k = 0;
        for (int i = 0; i < smallAns1.length; i++) {
            char first = getchar(firstdigit);
            myAns[k] = first + smallAns1[i];
            k++;

        }
        for (int i = 0; i < smallAns2.length; i++) {
            char first = getchar(firsttwodigits);
            myAns[k] = first + smallAns2[i];
            k++;
        }
        return myAns;

    }

    public static char getchar(int n) {
        return (char)(96+n);

	}

}
