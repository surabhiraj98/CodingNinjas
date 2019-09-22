/*************** 
 * Following is the Node class already written 
class Node<T> {
	T data;
	Node<T> next;
	
	public Node(T data) {
		this.data = data;
	}
}
***************/

public class Solution {
	public static int length(Node<Integer> head){
        int ct = 0;
        while(head!=null){
            ct++;
            head=head.next;
        }
        return ct;
    }
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		int len = length(head);
        if(pos>len||pos<0){
            return head;
        }
        int count = 0;
        Node<Integer> curr = head;
        Node<Integer> prev = null;
        while(count<pos){
            prev=curr;
            curr=curr.next;
            count++;
        }
        Node<Integer>newmode=new Node<>(data);
        if(prev!=null){
            prev.next=newmode;
            newmode.next=curr;
            return head;
        }
        else {
            newmode.next=head;
            return newmode;
        }
	}
}
