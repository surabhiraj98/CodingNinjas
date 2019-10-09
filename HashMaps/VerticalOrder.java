import java.util.ArrayList;
import java.util.*;

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

	public static void printBinaryTreeVerticalOrder(BinaryTreeNode<Integer> root){
		/* Your class should be named Solution 
		 * Don't write main(). 
		 * Don't read input, it is passed as function argument. 
		 * Print output and don't return it. 
		 * Taking input is handled automatically. 
		 */
		HashMap<Integer, ArrayList<Integer>> map = new HashMap<>();
        HashMap<BinaryTreeNode<Integer>, BinaryTreeNode<Integer>> visited = new HashMap<>();
        int leftMost = 0, rightMost = 0, mid = 0;
        BinaryTreeNode<Integer> curr = root;
        BinaryTreeNode<Integer> par = null;
        BinaryTreeNode<Integer> tempChild = null;

        while (curr != null) {

            if (visited.containsKey(curr)) {
                if ((curr.left != null && visited.containsKey(curr.left)) || curr.left == null) {
                    // Left Already Visited or not present. Go to right.
                    if ((curr.right != null && visited.containsKey(curr.right)) || curr.right == null) {
                        // Right Already Visited or not present. Go to parent.
                        tempChild = curr;
                        curr = visited.get(curr);
                        if (curr != null) {
                            if (curr.left == tempChild) {
                                mid++;
                            } else if (curr.right == tempChild) {
                                mid--;
                            }
                            par = visited.get(curr);
                        }
                    } else {
                        par = curr;
                        curr = curr.right;
                        mid++;
                        continue;
                    }
                } else {
                    par = curr;
                    curr = curr.left;
                    mid--;
                    continue;
                }
            } else {
                if (map.containsKey(mid)) {
                    map.get(mid).add(curr.data);
                } else {
                    ArrayList<Integer> temp = new ArrayList<>();
                    temp.add(curr.data);
                    map.put(mid, temp);
                }
                if (leftMost > mid) {
                    leftMost = mid;
                }
                if (rightMost < mid) {
                    rightMost = mid;
                }
                visited.put(curr, par);
            }

        }

        for (int i = leftMost; i <= rightMost; i++) {
            for (int v : map.get(i)) {
                System.out.print(v + " ");
            }
            System.out.println();
        }
    }

    public static BinaryTreeNode<Integer> formTree(int[] arr, int i) {
        if (i >= arr.length)
            return null;
        if (arr[i] < 0)
            return null;
        BinaryTreeNode<Integer> node = new BinaryTreeNode(arr[i]);
        node.left = formTree(arr, 2 * i + 1);
        node.right = formTree(arr, 2 * i + 2);
        // System.out.println(node);
        return node;
    }

    public static int[] processInput(int[] arr) {
        List<Integer> arrayList = new ArrayList<Integer>();
        for (int v : arr) {
            arrayList.add(v);
        }
        for (int i = 0; i < arrayList.size(); i++) {
            if (arrayList.get(i) < 0) {
                if (2 * i + 1 < arrayList.size()) {
                    arrayList.add(2 * i + 1, -2);
                }
                if (2 * i + 2 < arrayList.size()) {
                    arrayList.add(2 * i + 2, -2);
                }
            }
        }
        int[] newArr = new int[arrayList.size()];
        return arrayList.stream().filter(i -> i != null).mapToInt(i -> i).toArray();
    }

    public static void levelOrderTraversal(BinaryTreeNode<Integer> root) {
        Queue<BinaryTreeNode<Integer>> queue = new LinkedList<BinaryTreeNode<Integer>>();
        queue.add(root);
        while (!queue.isEmpty()) {
            BinaryTreeNode<Integer> tempNode = queue.poll();
            System.out.print(tempNode.data + " ");

            /* Enqueue left child */
            if (tempNode.left != null) {
                queue.add(tempNode.left);
            }

            /* Enqueue right child */
            if (tempNode.right != null) {
                queue.add(tempNode.right);
            }
        }
    }

}

