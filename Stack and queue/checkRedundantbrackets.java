import java.util.Stack;

public class solution {
	public static boolean isRedundant = false;
public static boolean consecutiveStartBrackets = false;
	public static boolean checkRedundantBrackets(String input) {
		// Write your code here
        int i = 0;
		Stack<Character> stackLL = new Stack<>();
		for (i = 0; i < input.length() - 1; i++) {
			if (input.charAt(i) == '(') {
				if (input.charAt(i + 1) == ')') {
					isRedundant = true;
					break;
				} else if (input.charAt(i + 1) == '(') {
					consecutiveStartBrackets = true;
				}
				stackLL.push(input.charAt(i));
			} 
			if (input.charAt(i) == ')') {
				if (input.charAt(i + 1) == ')') {
					if (consecutiveStartBrackets == true) {
						isRedundant = true;
						break;
					}
				} else if (!stackLL.isEmpty() && stackLL.pop() == '(') {
					stackLL.pop();
					continue;
				} else {
					break;
				}
			}
		}
return isRedundant;
	}
}
