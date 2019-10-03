/***********
 
Following is the Linked list node structure already written 
 
class ListNode<t> {
	public t data;
	 public ListNode<t> next;
	 public ListNode(t data)
	 {
		 this.data=data;
	 }
}

************/


public class solution {
	
	public static ListNode<Integer> changelist(ListNode<Integer> head) {
		// Write your code here
ListNode<Integer> slow = head , fast = head,ptr = head;
        if(head.next== null)
            return head;
        while(fast!= null&&fast.next!=null){
            ptr = slow;
            slow = slow.next;
            fast = fast.next.next;
        }
        if(fast==null){
            fast = ptr.next;
            ptr.next=null;
        }
        else 
        {
            fast=slow.next;
            slow.next=null;
        }
        ListNode<Integer> temp = fast.next;
        ptr = null;
        while(temp!=null){
            fast.next = ptr;
            ptr=fast;
            fast=temp;
            temp=temp.next;
        }
        fast.next=ptr;
        ListNode<Integer> h=new ListNode<Integer>(0);
        temp =h;
        while(head!=null&&fast!=null){
            temp.next=head;
            head=head.next;
            temp=temp.next;
            temp.next=fast;
            fast= fast.next;
            temp=temp.next;
        }
        if(head!=null){
            temp.next=head;
        }
      return h.next;  
    }
}

