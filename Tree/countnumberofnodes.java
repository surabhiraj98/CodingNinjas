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
	
	
	
	public static int countNodes(TreeNode<Integer> root){
		if(root == null){
            return 0;
        }
        
        int ans=1;
        for(int i = 0;i<root.children.size();i++){
            ans = ans+countNodes(root.children.get(i));
        }
        return ans;
	}
		
}
