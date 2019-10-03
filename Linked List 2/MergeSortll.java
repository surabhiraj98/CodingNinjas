
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
public static LinkedListNode<Integer> getMiddle(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> middle;
		LinkedListNode<Integer> slow = head;
		LinkedListNode<Integer> fast = head;
		if (head == null) {
			return head;
		}
		if (length(head) % 2 == 0) {
			while (fast.next.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow;
		} else {
			while (fast.next != null) {
				slow = slow.next;
				fast = fast.next.next;
			}
			middle = slow;
		}
		return middle;
}
    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		LinkedListNode<Integer> head = null, tail = null; 
		if (head1.data < head2.data) { 
			head = head1; 
			tail = head1; 
			head1 = head1.next; 
			} else { 
				head = head2; 
				tail = head2; 
				head2 = head2.next; 
			} 
		while (head1 != null && head2 != null) { 
			if (head1.data < head2.data) { 
				tail.next = head1; 
				tail = tail.next; 
				head1 = head1.next; 
			} else { 
				tail.next = head2; 
				tail = tail.next; 
				head2 = head2.next; 
			} 
		} 
		if (head1 != null) { 
			tail.next = head1; 
		} 
		if (head2 != null) { 
			tail.next = head2; 
		} 
		return head; 
}
	public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {
		// write your code here
if (head == null || head.next == null) {
			return head;
		}
		LinkedListNode<Integer>h1 = head;
		LinkedListNode<Integer> t1 = getMiddle(head);
		LinkedListNode<Integer>h2 = t1.next;
		t1.next = null;
return mergeTwoList(mergeSort(h1), mergeSort(h2));
	}

}
