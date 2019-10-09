import java.util.PriorityQueue;
public class Solution {

	public static int kthLargest(int arr[], int k) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		int i = 0;
		for (; i < k; i++) {
			pQueue.add(arr[i]);
		}
		for (; i < arr.length; i++) {
			if (pQueue.element() < arr[i]) {
				pQueue.remove();
				pQueue.add(arr[i]);
			}
		}
		return pQueue.element();
	}
}
