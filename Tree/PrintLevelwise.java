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
		/* Your class should be named Solution 
 		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
if(root==null){
    return;
}
        QueueUsingLL<TreeNode<Integer>> q = new QueueUsingLL<TreeNode<Integer>>();
        TreeNode<Integer> nullNode = new TreeNode<Integer>(Integer.MIN_VALUE);
        q.enqueue(root);
        q.enqueue(nullNode);
        System.out.println(root.data);
        while(q.size()!=1){
            TreeNode<Integer> temp = null;
            try{
                temp = q.dequeue();
                
            } catch (QueueEmptyException e){
                
            }
            if(temp==nullNode){
                q.enqueue(nullNode);
                System.out.println();
                continue;
            }
            for(int i = 0; i<temp.children.size();++i){
                System.out.print(temp.children.get(i).data+" ");
                q.enqueue(temp.children.get(i));
            }
        }
	}
		
}
