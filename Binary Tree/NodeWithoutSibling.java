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

	public static void printNodesWithoutSibling(BinaryTreeNode<Integer> root) {
		
		// Write your code here
        QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			int counter = pendingNodes.size();
			for (int i = 0; i < counter; i++) {
				try {
					frontNode = pendingNodes.dequeue();
				} catch (QueueEmptyException e) {
					e.printStackTrace();
				}
				if (frontNode.left == null && frontNode.right != null) {
					System.out.println(frontNode.right.data + " ");
				} else if (frontNode.left != null && frontNode.right == null) {
					System.out.println(frontNode.left.data + " ");
				}
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
			}
		}
	}
}
