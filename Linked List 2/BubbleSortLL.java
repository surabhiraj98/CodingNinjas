
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


	public static LinkedListNode<Integer> bubbleSort(LinkedListNode<Integer> head )
	{
		//Write your code here
        int n = length(head); 
		for (int i = 0; i < n - 1; i++) { 
			LinkedListNode<Integer> prev = null; 
			LinkedListNode<Integer> curr = head; 
			for (int j = 0; j < n - i - 1; j++) { 
				if (curr.data <= curr.next.data) { 
					prev = curr; curr = curr.next; 
				} else { 
					if (prev == null) { 
						LinkedListNode<Integer> fwd = curr.next; 
						head = head.next; 
						curr.next = fwd.next; 
						fwd.next = curr; 
						prev = fwd; 
					} else { 
						LinkedListNode<Integer> fwd = curr.next; 
						prev.next = fwd; 
						curr.next = fwd.next; 
						fwd.next = curr; 
						prev = fwd; 
					} 
				} 
			} 
		} 
return head;
	}
}
