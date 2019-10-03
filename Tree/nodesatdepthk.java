
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
	
	
	
	public static void printNodesAtDepthK(TreeNode<Integer> root, int k){ 
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
if (k < 0) {
			return;
		} else if (k == 0) {
			System.out.print(root.data+" ");
			return;
		}
		for (int i = 0; i < root.children.size(); i++) {
			printNodesAtDepthK(root.children.get(i), k - 1);
		}
}
}
