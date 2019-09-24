

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

	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        
    if (length(head) == 1) {
			return head;
		}
		LinkedListNode<Integer> temp = head;
		LinkedListNode<Integer> temp2 = temp;
		int data = 0;
		while (temp.next != null) {
			data = temp.getData();	// 1, 2, 3
			if (data != temp.next.getData()) {
				temp = temp.next; // 2, 3
			} else {	
				if (temp.next.next == null) {
					temp.next = null;
					break;
				}
				LinkedListNode<Integer> temp3 = temp;	// 4
				temp3 = temp3.next;
				while (data == temp3.getData()) {
					 if (temp3.next == null) {
						temp.next = null;
						break;
					}
					temp3 = temp3.next;
				}
				temp.next = temp3;
			}
		}
return temp2;
    
}
}
