import java.util.ArrayList;
import java.util.Collections;
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
public static void convertToArray(BinaryTreeNode<Integer> root, ArrayList<Integer> output){
    if(root==null){
        return ;
    }
    output.add(root.data);
    convertToArray(root.left,output);
    convertToArray(root.right,output);
}
	public static void nodesSumToS(BinaryTreeNode<Integer> root, int sum) {
		// Write your code here
            ArrayList<Integer> output= new ArrayList<Integer>();
        convertToArray(root,output);
        Collections.sort(output);
        int i =0, j=output.size()-1;
        while(i<j){
            if(output.get(i)+output.get(j)== sum){
                int countI = 1, countJ=1;
                int k = i+1;
                while(output.get(k)==output.get(i)){
                    countI++;
                    k++;
                }
                k=j-1;
                while(output.get(k)==output.get(j)){
                    countJ++;
                    k--;
                }
                int count = countI*countJ;
                while(count>0){
                    System.out.println(output.get(i)+" " +output.get(j));
                    count--;
                }
                i+= countI;
                j-=countJ;
                
                    
                }
            else if(output.get(i)+output.get(j)>sum){
                j--;
            } else {
                i++;
            }
        }
	}
}

