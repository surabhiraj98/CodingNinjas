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

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre,
			int[] in){
		
			// Write your code here
		return getTreeFromPreorderAndInorder(pre, in, 0, pre.length - 1, 0, in.length - 1);
	}

	public static BinaryTreeNode<Integer> getTreeFromPreorderAndInorder(int[] pre, int[] in, int startIndexPre, 
			int endIndexPre, int startIndexIn, int endIndexIn) {
		if (startIndexPre > endIndexPre || startIndexIn > endIndexIn) {
			return null;
		}
		int temp = pre[startIndexPre];
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(temp);
		
		// Find parent element from inorder
		int i = 0;
		for (int j = 0; j < in.length; j++) {
			if (temp == in[j]) {
				i = j;
				break;
			}
		}
		root.left = getTreeFromPreorderAndInorder(pre, in, startIndexPre + 1, startIndexPre + (i - startIndexIn), startIndexIn, i - 1);
		root.right = getTreeFromPreorderAndInorder(pre, in, startIndexPre + (i - startIndexIn) + 1, endIndexPre, i + 1, endIndexIn);
return root;
    }
    public static void printLevelWise(BinaryTreeNode<Integer> root) {
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
				System.out.print(frontNode.data + " ");
				if (frontNode.left != null) {
					pendingNodes.enqueue(frontNode.left);
				}
				if (frontNode.right != null) {
					pendingNodes.enqueue(frontNode.right);
				}
			}
System.out.println();
        }
    }
}

