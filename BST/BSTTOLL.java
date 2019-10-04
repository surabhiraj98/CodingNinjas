import java.util.Scanner;
public class Solution {
public static int counter = 0;
	public static LinkedListNode<Integer> head;
	public static LinkedListNode<Integer> temp;
	
	public static BinaryTreeNode<Integer> takeInputLevelWise() {
		Scanner scanner = new Scanner(System.in);
		QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		System.out.println("Enter root data: ");
		int rootData = scanner.nextInt();
		if (rootData == -1) {
			return null;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				return null;
			}
			System.out.println("Enter left child of " + frontNode.data + ": ");
			int leftCild = scanner.nextInt();
			if (leftCild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftCild);
				pendingNodes.enqueue(child);
				frontNode.left = child;
			}
			System.out.println("Enter right child of " + frontNode.data + ": ");
			int rightChild = scanner.nextInt();
			if (rightChild != -1) {
				BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightChild);
				pendingNodes.enqueue(child);
				frontNode.right = child;
			}
		}
		return root;
}
/*	Binary Tree Node class 
 * 
 * 	class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;
		
		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	*/

/* LinkedList Node Class
*
*	
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;
	
	public LinkedListNode(T data) {
		this.data = data;
	}
}
*/

	public static LinkedListNode<Integer> BSTToSortedLL(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		
	if (root == null) {
			return null;
		}
		LinkedListNode<Integer> newNode = new LinkedListNode(root.data);
		BSTToSortedLL(root.left);
		if (counter == 1) {
			temp.next = newNode;
			temp = temp.next;
		}
		if (head == null) {
			counter++;
			if (counter == 1) {
				head = newNode;
				temp = head;
			}
		}
		BSTToSortedLL(root.right);
		return head;
	}
	
	public static void print(LinkedListNode<Integer> head) {
		LinkedListNode<Integer> temp = head;
		while(temp != null) {
			System.out.print(temp.data +" ");
			temp = temp.next;
		} 
		System.out.println();
	} 
	
	public static void main(String[] args) {
		/*
		 Given a BST, convert it into a sorted linked list. Return the head of LL. 
		 
		 Input format : 
		 Elements in level order form (separated by space) 
		 (If any node does not have left or right child, take -1 in its place) 
		 
		 Output Format : 
		 Linked list elements (separated by space) 
		 
		 Sample Input : 
		 8 5 10 2 6 -1 -1 -1 -1 -1 7 -1 -1 
		 
		 Sample Output : 
		 2 5 6 7 8 10
		 */
		BinaryTreeNode<Integer> root = takeInputLevelWise();
		LinkedListNode<Integer> head = BSTToSortedLL(root);
		print(head);
	}

}	
