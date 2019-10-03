import java.util.Queue;
import java.util.LinkedList;
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
	
	public static void printLevelWise(TreeNode<Integer> root){
		Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
		pendingNodes.add(root);
		while (!pendingNodes.isEmpty()) {
			TreeNode<Integer> frontNode = null;
			int counter = pendingNodes.size();
			for (int i = 0; i < counter; i++) {
				// try {
				// 	frontNode = pendingNodes.remove();
				// } catch (QueueEmptyException e) {
				// 	e.printStackTrace();
				// }
				System.out.print(frontNode.data + " ");
				for (int j = 0; j < frontNode.children.size(); j++) {
					pendingNodes.add(frontNode.children.get(j));
				}
			}
			System.out.println();
		}
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root) {
		replaceWithDepthValue(root, 0);
	}
	
	public static void replaceWithDepthValue(TreeNode<Integer> root, int depth) {
		if (depth == 0) {
			root.data = depth;
		} 
		root.data = depth;
		for (int i = 0; i < root.children.size(); i++) {
			replaceWithDepthValue(root.children.get(i), depth + 1);
		}
}
}
