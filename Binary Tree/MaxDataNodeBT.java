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
	
	public static BinaryTreeNode<Integer> maxDataNode(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
if(root==null){
    return null;
}
                int max= root.data;
        BinaryTreeNode<Integer> maxNode = root;
        BinaryTreeNode<Integer> leftMax = maxDataNode(root.left);
        if(leftMax != null){
            if(leftMax.data>max){
                max=leftMax.data;
                maxNode=leftMax;
            }
        }
        BinaryTreeNode<Integer> rightMax = maxDataNode(root.right);
        if(rightMax != null){
            if(rightMax.data>max){
                max=rightMax.data;
                maxNode=rightMax;
	}
	
}
        return maxNode;
    }
}

