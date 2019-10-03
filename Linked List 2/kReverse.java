
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
	public static LinkedListNode<Integer> kReverse(LinkedListNode<Integer> head, int k) {
        if(head== null){
            return null;
        } //base case
        LinkedListNode<Integer> current = head;
		LinkedListNode<Integer> next = null; 
		LinkedListNode<Integer> prev = null; 
		int count = 0; 
		/* Reverse first k nodes of linked list */ 
		while (count < k && current != null) { 
	     next = current.next; 
			current.next = prev; 
			prev = current; 
			current = next; 
			count++; 
		} 
		if (next != null) { 
			head.next = kReverse(next, k); 
		} 
return prev;
    }
}
