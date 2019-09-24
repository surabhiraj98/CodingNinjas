
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
	public static void printReverseRecursive(LinkedListNode<Integer> root) {
        LinkedListNode<Integer> head = root;
		LinkedListNode<Integer> temp = head;
		if (head.next == null) {
			System.out.println(head.getData());
			return;
		} else {
			while (head.next.next != null) {
				head = head.next;
			}
			System.out.print(head.next.getData() + " ");
			head.next = null;
printReverseRecursive(temp);
    }
}
}
