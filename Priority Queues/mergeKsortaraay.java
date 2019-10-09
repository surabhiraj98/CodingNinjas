import java.util.ArrayList;
import java.util.PriorityQueue;

public class Solution {

	public static ArrayList<Integer> mergeKSortedArrays(ArrayList<ArrayList<Integer>> input) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
		PriorityQueue<Integer> pQueue = new PriorityQueue<>();
		ArrayList<Integer> output = new ArrayList<>();
		int maxSize = Integer.MIN_VALUE;
		for (ArrayList<Integer> list : input) {
			if (maxSize < list.size()) {
				maxSize = list.size();
			}
		}
		int i = 0, j = 0;
		while (i != maxSize) {
			j = 0;
			for (; j < input.size(); j++) {
				if (i >= input.get(j).size()) {
					continue;
				} else {
					pQueue.add(input.get(j).get(i));
				}
			}
			i++;
		}
		while (!pQueue.isEmpty()) {
			output.add(pQueue.remove());
		}
		return output;
	}
}
