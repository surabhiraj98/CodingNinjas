public class Solution {

/*	TreeNode class 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static boolean isPresent = false;

	public static boolean checkIfContainsX(TreeNode<Integer> root, int x){

		// Write your code here
if (root == null) {
			isPresent = false;
		} else if (root.data  == x) {
			return true;
		}
		for (int i = 0; i < root.children.size(); i++) {
			isPresent = checkIfContainsX(root.children.get(i), x);
		}
return isPresent;
	}
	
}

