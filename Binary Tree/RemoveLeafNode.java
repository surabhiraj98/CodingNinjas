import java.util.ArrayList;


public class Solution {

	/*	Binary Tree Node class
	 * 
	 * class BinaryTreeNode<T> {
		T data;
		BinaryTreeNode<T> left;
		BinaryTreeNode<T> right;

		public BinaryTreeNode(T data) {
			this.data = data;
		}
	}
	 */

	public static BinaryTreeNode<Integer> removeAllLeaves(BinaryTreeNode<Integer> root){
		
		// Write your code here
   if(root==null){
            //if its null then we need to return some new node but not null
            //to identify the actual nodes where both left and right pointers are null
            return new BinaryTreeNode<Integer>(-1);
        }else if(root.left==null&&root.right==null){//checking both pointers
            return null;
        }
        BinaryTreeNode<Integer> value1;
        BinaryTreeNode<Integer> value2;
        
        value1=removeAllLeaves(root.left);
        value2=removeAllLeaves(root.right);
        if(value1==null){//if value1 null then it means both its pointers are null but not a new node(not null values)
            root.left=null;
        }
        if(value2==null){//same as above
            root.right=null;
        }
        return root;//updated root 
}



}
