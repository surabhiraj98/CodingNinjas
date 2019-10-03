


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
	
		static class Pair<T>{
            T first;
            T second;
            Pair(T first,T second){
                this.first = first;
                this.second = second;
            }
        }
	
	public static TreeNode<Integer> findSecondLargest(TreeNode<Integer> root){


		// Write your code here
        return findSecondLargestT(root).second;
	}
	public static Pair<TreeNode<Integer>> findSecondLargestT(TreeNode<Integer> root){
        Pair<TreeNode<Integer>> output;
        if(root == null){
            output = new Pair<TreeNode<Integer>>(null,null);
            return output;
        }
        output = new Pair<TreeNode<Integer>>(root,null);
        for(TreeNode<Integer> child : root.children){
            Pair<TreeNode<Integer>> childPair = findSecondLargestT(child);
            if(childPair.first.data > output.first.data){
                if(childPair.second==null||childPair.second.data < output.first.data){
                    output.second = output.first;
                    output.first = childPair.first;
                } else {
                    output.first = childPair.first;
                    output.second = childPair.second;
                }
                } else if(childPair.first.data.equals(output.first.data) && childPair.second != null){
                    output.second = childPair.second;
                } else if(output.first.data != childPair.first.data && (output.second == null || childPair.first.data>output.second.data)){
                    output.second = childPair.first;
                }
            }
            return output;
        }
    }
