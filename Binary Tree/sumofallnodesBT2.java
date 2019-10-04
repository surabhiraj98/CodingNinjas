
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
	
	public static int sum(BinaryTreeNode<Integer> root){
		
		// Write your code here
if(root==null){
            return 0;
        }
		// Write your code here
   int nodes = root.data;
       int leftSum = sum(root.left);
        int rightSum = sum(root.right);
        return nodes+leftSum+rightSum;
	}
	
}
