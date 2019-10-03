import java.util.Stack;
public class Solution {

	public static int[] stockSpan(int[] price) {
		// Write your code here
        int length=price.length;
        int[] S = new int[price.length];
        Stack<Integer> myStack = new Stack<>();
        int h = 0;
        for(int i = 0; i<length;i++){
            h = 0;
            while(!myStack.isEmpty()){
                if(price[i]> price[myStack.peek()]){
                    myStack.pop();
                } else {
                    break;
                }
            }
            h = myStack.isEmpty() ? -1 : myStack.peek();
            S[i] = i-h;
            myStack.push(i);
        }
        return S;
	}
}
