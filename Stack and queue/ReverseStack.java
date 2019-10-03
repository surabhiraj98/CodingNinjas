import java.util.Stack;

public class Solution {

	public static void reverseStack(Stack<Integer> s1, Stack<Integer> s2) {
		int temp;
		int counter;
		int limiter = s1.size() - 1;
		for (int i = 0; i < s1.size() - 1; i++) {
			counter = i;
			s2.push(s1.pop());
			temp = s2.pop();
			while (counter < limiter) {
				s2.push(s1.pop());
				counter++;
			}
			s1.push(temp);
			while (s2.size() != 0) {
				s1.push(s2.pop());
}
	}
}
}
