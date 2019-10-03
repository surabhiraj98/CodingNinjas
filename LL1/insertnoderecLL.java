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

	public static LinkedListNode<Integer> insertR(LinkedListNode<Integer> head, int data, int pos){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if (pos == 0) {
			 LinkedListNode<Integer> newNode = new  LinkedListNode<Integer>(data);
			newNode.next = head;
			return newNode;
		}
		if (head == null) {
			return head;
		}
		head.next = insertR(head.next, data, pos - 1);
		return head;
	

	}
}
