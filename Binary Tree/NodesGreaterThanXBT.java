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
	
	public static int numNodesGreaterX(BinaryTreeNode<Integer> root,int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        if(root==null){
            return 0;
        }
        int val=0;
        
        if(root.data>x){
            val = 1;
        }
        int left = numNodesGreaterX(root.left,x);
        int right = numNodesGreaterX(root.right,x);
        val = val+left+right;
            return val;
	}
	
}
