import java.util.Queue;
import java.util.LinkedList;
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

	public static void printLevelWise(TreeNode<Integer> root){
		/* Your class should be named Solution.
		 * Don't write main() function.
		 * Don't read input, it is passed as function argument.
		 * Print output as specified in the question
		 */
        Queue<TreeNode<Integer>> q = new LinkedList<>();
        q.add(root);
        while(!q.isEmpty()){
            TreeNode<Integer>front=q.remove();
            if(front!=null){
                System.out.print(front.data+":");
                for(int i=0;i<front.children.size();i++){
                    q.add(front.children.get(i));
                    System.out.print(front.children.get(i).data);
                    if(i==front.children.size()-1){
                        break;
                    } else {
                        System.out.print(",");
                    }
                }
                System.out.println();
            }
        }
	}

}
