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
	public static void printLevelWise(BinaryTreeNode<Integer> root) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Print output and don't return it.
		* Taking input is handled automatically.
		*/
	QueueUsingLL<BinaryTreeNode<Integer>> pendingNodes = new QueueUsingLL<>();
		pendingNodes.enqueue(root);
		
		while (!pendingNodes.isEmpty()) {
			BinaryTreeNode<Integer> frontNode = null;
			try {
				frontNode = pendingNodes.dequeue();
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
			System.out.print(frontNode.data + ":");
			if (frontNode.left != null) {
				pendingNodes.enqueue(frontNode.left);
				System.out.print("L:" + frontNode.left.data + ",");
			} else {
				System.out.print("L:" + "-1" + ",");
			}
			if (frontNode.right != null) {
				pendingNodes.enqueue(frontNode.right);
				System.out.print("R:" + frontNode.right.data);
				System.out.println();
			} else {
				System.out.print("R:" + "-1");
				System.out.println();
			}
		}
	}
}
