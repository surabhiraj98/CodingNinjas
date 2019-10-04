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

	public static int lcaInBST(BinaryTreeNode<Integer> root , int a , int b){
		// Write your code here
if (root == null) {
			return -1;
		}
		if (root.data == a || root.data == b) {
			return root.data;
		} 
		int c = lcaInBST(root.left, a, b);
		int d = lcaInBST(root.right, a, b);
		if (c == -1 && d != -1) {
			return d;
		} else if (c != -1 && d == -1) {
			return c;
		} else if (c == -1 && d == -1) {
			return -1;
		} else {
return root.data;
	}
}
}
