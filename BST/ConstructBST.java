public class Solution {

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

	public static BinaryTreeNode<Integer> SortedArrayToBST(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
return sortedArrayToBST(arr, 0, arr.length);
	}
    public static BinaryTreeNode<Integer> sortedArrayToBST(int[] arr, int startIndex, int endIndex) {
		if (startIndex >= endIndex) {
			 return null;
		}
		int middle;
		if ((startIndex + endIndex) % 2 == 0) {
			middle = ((startIndex + endIndex) / 2) - 1;
		} else {
		    middle = (startIndex + endIndex) / 2;
		}
		BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(arr[middle]);
		root.left = sortedArrayToBST(arr, startIndex, middle);
		root.right = sortedArrayToBST(arr, middle + 1, endIndex);
		return root;
	}
	
	public static void preOrder(BinaryTreeNode<Integer> root) {
		if (root == null) {
			return;
		}
		System.out.print(root.data + " ");
		preOrder(root.left);
preOrder(root.right);
}	
}
