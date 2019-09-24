
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
	
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> head) {
		
	LinkedListNode<Integer> h = head;
		LinkedListNode<Integer> temp = h;
		if (h.next == null) {
			return h;
		}
		while (h.next.next != null) {
			h = h.next;
		}
		LinkedListNode<Integer> tempHead = h.next;
		h.next = null;
		tempHead.next = reverse_R(temp);
		return tempHead;
}
}
