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
	public static int replaceSum(BinaryTreeNode<Integer> root,int sum) {
	if(root==null){
        return sum;
    }
        int rs = replaceSum(root.right,sum);
        root.data = root.data+rs;
        int ls = replaceSum(root.left,root.data);
    return ls;
        }
	public static void replaceWithLargerNodesSum(BinaryTreeNode<Integer> root) {
		// Write your code here
		int sum = replaceSum(root,0);
	}
}

