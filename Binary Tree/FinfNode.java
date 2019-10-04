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
	
	public static boolean isNodePresent(BinaryTreeNode<Integer> root,int x){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
 boolean val=false;
        
        if(root.data==x){
            return true;
        }
        //checking left side of tree is null or not
        if(root.left!=null){
            val=isNodePresent(root.left,x);
        }
        //we need to only check if and only if we didn't found 
        //in left side of tree otherwise value will be overridden
        if(val==false){
            if(root.right!=null){
                val=isNodePresent(root.right,x);
            }   
        }
        return val;
	}
    
}
