import java.util.ArrayList;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.PriorityQueue;
import java.util.Scanner;

class MaxPQComparator implements Comparator<Integer> {

	@Override
	public int compare(Integer o1, Integer o2) {
		if (o1 < o2) {
			return -1;
		} else if (o1 > o2) {
			return 1;
		} else {
			return 0;
		}
	}
}

public class Solution {

	public static ArrayList<Integer> kLargest(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
	MaxPQComparator maxPQComparator = new MaxPQComparator();
		PriorityQueue<Integer> pQueue = new PriorityQueue<>(maxPQComparator);
		ArrayList<Integer> output = new ArrayList<>();
		for (int i = 0; i < input.length; i++) {
			pQueue.add(input[i]);
		}
		while (pQueue.size() != k) {
			pQueue.remove();
		}
		while (!pQueue.isEmpty()) {
			output.add(pQueue.remove());
		}
		return output;	
	}
}
