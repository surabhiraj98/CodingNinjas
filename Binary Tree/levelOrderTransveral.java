import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Queue;

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

	public static void printLevelWise(BinaryTreeNode<Integer> root){
		
		// Write your code here

Queue<BinaryTreeNode<Integer>>pendingNodes=new LinkedList<>();
        pendingNodes.add(root);
        pendingNodes.add(null);
        while(true){
            BinaryTreeNode<Integer> front=pendingNodes.remove();
            if(front==null){
                System.out.println();
                if(pendingNodes.isEmpty()){
                    break;
                }
                pendingNodes.add(null);
                continue;
            }
            System.out.print(front.data+" ");
            if(front.left!=null){
                pendingNodes.add(front.left);
            }
            if(front.right!= null){
                pendingNodes.add(front.right);
            }
        }
	}



}
