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
	
	
	
	public static TreeNode<Integer> maxDataNode(TreeNode<Integer> root){ 
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(root==null){
            return null;
        }
        TreeNode<Integer> maxnode = root ;
        int max=root.data;
        for (int i =0;i<root.children.size();i++){
            TreeNode<Integer> childmax = maxDataNode(root.children.get(i));
            if(childmax.data >= max){
                max= childmax.data;
                maxnode = childmax;
            }
            
        }
        return maxnode;
	}
		
}
