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
	public static int height(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return 0;
		} else if (root.left == null && root.right == null) {
			return 1;
		}
		int levelCount = 0;
		levelCount = Math.max(height(root.left), height(root.right));
		return levelCount + 1;
	}
	
	public static boolean checkBalanced(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return true;
		}
		if (Math.abs(height(root.left) - height(root.right)) > 1) {
			return false;
		}
		boolean leftAnswer = checkBalanced(root.left);
		boolean rightAnswer = checkBalanced(root.right);
return leftAnswer && rightAnswer;
    }
}
