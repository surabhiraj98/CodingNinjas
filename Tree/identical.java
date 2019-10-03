public class Solution {

/*	TreeNode structure 
 * 
 * class TreeNode<T> {
		T data;
		ArrayList<TreeNode<T>> children;

		TreeNode(T data){
			this.data = data;
			children = new ArrayList<TreeNode<T>>();
		}
	}*/
	public static boolean isIdentical = true;
	public static boolean checkIdentical(TreeNode<Integer> root1, TreeNode<Integer> root2){

		// Write your code here
	if (root1.data != root2.data || root1.children.size() != root2.children.size()) {
			return false;
		} 
		QueueUsingLL<TreeNode<Integer>> pendingNodes1 = new QueueUsingLL<>();
		for (int i = 0; i < root1.children.size(); i++) {
			pendingNodes1.enqueue(root1.children.get(i));
		}
		QueueUsingLL<TreeNode<Integer>> pendingNodes2 = new QueueUsingLL<>();
		for (int i = 0; i < root2.children.size(); i++) {
			pendingNodes2.enqueue(root2.children.get(i));
		}
		if (!pendingNodes1.isEmpty() && !pendingNodes2.isEmpty()) {
			try {
				isIdentical = checkIdentical(pendingNodes1.front(), pendingNodes2.front());
			} catch (QueueEmptyException e) {
				e.printStackTrace();
			}
		}
		return isIdentical;
}
	
}
