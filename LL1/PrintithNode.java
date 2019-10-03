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

	public static void printIth(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		*/
		LinkedListNode<Integer> temp = head;
		int count = 0;
		while (temp != null) {
			if (count == i) {
				System.out.println(temp.data);
				return;
			} else {
				count++;
				temp = temp.next;
				if (count == i) {
					System.out.println(temp.data);
					return;
				}
			}
		}
	}
}
