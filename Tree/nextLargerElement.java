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
	public static TreeNode<Integer> ans;
	public static TreeNode<Integer> temp = null;
    public static Queue<TreeNode<Integer>> pendingNodes = new LinkedList<>();
	public static TreeNode<Integer> findNextLargerNode(TreeNode<Integer> root, int n){
		
		// Write your code here
if (ans == null) {
			if (root.data > n) {
				ans = root;
			}
		} else {
			if (root.data < ans.data && root.data > n) {
				ans = root;
			}
		}
		for (int i = 0; i < root.children.size(); i++) {
			pendingNodes.add(root.children.get(i));
			try {
				temp = findNextLargerNode(pendingNodes.remove(), n);
				if (temp.data > n) {
					if (temp.data < ans.data) {
						ans = temp;
					}
				}
				
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
return ans;
	}
	
}

