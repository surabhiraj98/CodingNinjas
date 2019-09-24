
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
    public static int length(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		int count = 1;
		while (temp.next != null) {
			count++;
			temp = temp.next;
		}
		return count;
}
	public static int printMiddel(LinkedListNode<Integer> head) {
        int middle = 0;
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		if (length(head) % 2 == 0) {
			while (fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow.getData();
		} else {
			while (fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow.getData();
		}
return middle;
    }
}
