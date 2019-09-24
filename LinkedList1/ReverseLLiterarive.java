
/*
 class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
 * */
public class Solution {
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
	LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> previous = null;
		LinkedListNode<Integer> temp;
		while (current != null) {
			temp = current.next;
			current.next = previous;
			previous = current;
			current = temp;
		}
return previous;	
	}
    //tc o(n)
    //sc o(1)

}
