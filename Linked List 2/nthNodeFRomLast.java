/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {
    public static int getLength(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 0; 
		while(temp != null) {
			count++;
			temp = temp.next;
		}
		return count;
}

	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		LinkedListNode<Integer> main = head, ref = head;
        while(n-- != -1) {
        	ref = ref.next;
        	if(ref == null)
        		return null;
        }
        while(ref != null) {
        	main = main.next;
        	ref = ref.next;
        }
        return main;
	}
}
