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

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		if(head==null){
          return null;
        }
      	
      	LinkedListNode<Integer> temp=head;
      	int actual_length=0;
      	while(temp!=null){
        	temp=temp.next;
          	actual_length++;
        }
      	
      	if(i>actual_length-1){
          return head;
        }	
      	temp=head;
      	if(i==0){
          head=temp.next;
          return head;
        }
		LinkedListNode<Integer> prev=null;
      	int len=0;
      
      	while(len<i){
          prev=temp;
          temp=temp.next;
          len++;
        }
      	prev.next=temp.next;
      	return head;

	}
}
