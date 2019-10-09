public class Solution {
public static boolean maxHeapProperty = true;
	public static boolean checkMaxHeap(int arr[]) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        int parentIndex, leftChildIndex, rightChildIndex;
		for (int i = 0; i < arr.length; i++) {
			parentIndex = i;
			leftChildIndex = 2 * parentIndex + 1;
			rightChildIndex = 2 * parentIndex + 2;
			if (leftChildIndex < arr.length) {
				if (arr[parentIndex] < arr[leftChildIndex]) {
					maxHeapProperty = false;
					break;
				}
				if (rightChildIndex < arr.length && arr[parentIndex] < arr[rightChildIndex]) {
					maxHeapProperty = false;
				}
			}
		}
		return maxHeapProperty;
	}
}
