import java.util.ArrayList;

import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;

public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */
public static Node<BinaryTreeNode<Integer>> reverse_R(Node<BinaryTreeNode<Integer>> head) {
		if(head.next==null)
		{
		    return head;
		}
		Node<BinaryTreeNode<Integer>> temp = reverse_R(head.next);
		Node<BinaryTreeNode<Integer>> t = temp;
		while(temp.next!=null)
		{
		    temp=temp.next;
		}
		temp.next=head;
		head.next=null;
		
		return t;
}
	public static void printZigZag(BinaryTreeNode<Integer> root) {
		

		// Write your code here		
Queue<BinaryTreeNode<Integer>> q = new LinkedList<BinaryTreeNode<Integer>>();	
	
	 int count=-1;
	 int c=0;
	 Node<BinaryTreeNode<Integer>> head = null;
	 Node<BinaryTreeNode<Integer>> tail = null;
	 
	 BinaryTreeNode<Integer> nul = null;
	 q.add(root);
	 q.add(nul);
	 while(!q.isEmpty())
	 {
	  
	   BinaryTreeNode<Integer> current = q.remove();
	  
	   if(current!=null)
	   {
	       count=1;
	       if(current.right!=null)
	        q.add(current.right);
	       if(current.left!=null)
	        q.add(current.left);
	       Node<BinaryTreeNode<Integer>> newnode = new Node<BinaryTreeNode<Integer>>(current);
	       if(tail==null)
	       {
	           head=newnode;
	           tail=newnode;
	       }
	       else
	       {
	           tail.next=newnode;
	           tail=newnode;
	       }
	      
	      
	   }
	   else
	   {
		   if(count==0)
	       {
	           break;
	       }
	       count=0;
	       q.add(nul);
	       if(c%2==0)
	       {
	       head=reverse_R(head);
	       while(head!=null)
	       {
	           System.out.print(head.data.data+" ");
	           head=head.next;
	       }
	       System.out.println();
	       //System.out.println();
	       
	       }
	       else
	       {
	        while(head!=null)
	       {
	           System.out.print(head.data.data+" ");
	           head=head.next;
	       }
	       System.out.println();
	       
	       
	       }
	       head=null;
	       tail=null;
	       
	       c+=1;
	   }
	   
	  
}

	}


}
