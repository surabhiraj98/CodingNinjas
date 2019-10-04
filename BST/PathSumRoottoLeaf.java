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
	
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root,ArrayList<Integer> path, int k) {
		// Write your code here
		if(root==null){
            return;
        }
        k-=root.data;
        path.add(root.data);
        
        if(root.left==null && root.right== null){
            if(k==0){
                for(int i : path){
                    System.out.print(i+" ");
                }
                System.out.println();
            }
            path.remove(path.size()-1);
            return;
        }
        rootToLeafPathsSumToK(root.left,path,k);
        rootToLeafPathsSumToK(root.right,path,k);
        path.remove(path.size()-1);
	}
	public static void rootToLeafPathsSumToK(BinaryTreeNode<Integer> root, int k) {
    ArrayList<Integer> path = new ArrayList<Integer>();
        rootToLeafPathsSumToK(root,path,k);
    }
}

