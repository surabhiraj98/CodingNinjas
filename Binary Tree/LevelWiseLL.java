import java.util.ArrayList;


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

	/* class Node<T> {
		T data;
		Node<T> next;
		Node(T data){
			this.data = data;
		}
	}
*/
	public static ArrayList<Node<BinaryTreeNode<Integer>>> LLForEachLevel(BinaryTreeNode<Integer> root) {
		
		// Write your code here
ArrayList<Node<BinaryTreeNode<Integer>>> output = new ArrayList<>();
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		pendingNodes.enqueue(null);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> currentNode = null;
			int counter = pendingNodes.size();
			Node<BinaryTreeNode<Integer>> head = null, tail = null;
			for (int i = 0; i < counter; i++) {
				try {
					currentNode = pendingNodes.dequeue();
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				if (currentNode != null) {
					if (head == null) {
						head = new Node(currentNode);
						tail = head;
					} else {
						tail.next = new Node(currentNode);
						tail = tail.next;
					}
					if (currentNode.left != null) {
						pendingNodes.enqueue(currentNode.left);
					}
					if (currentNode.right != null) {
						pendingNodes.enqueue(currentNode.right);
					}
				} else {
					output.add(head);
					head = null;
					tail = null;
					if (!pendingNodes.isEmpty()) {
						pendingNodes.enqueue(null);
					}
				}
			}
		}
		return output;
}
	}
