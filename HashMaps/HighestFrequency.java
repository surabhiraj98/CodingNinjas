import java.util.*;
public class Solution {

	public static int maxFrequencyNumber(int[] arr){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
		 HashMap<Integer, Integer> map = new LinkedHashMap<>();
        for (int e : arr) {
            if (map.containsKey(e)) {
                int tempCount = map.get(e);
                map.put(e, tempCount + 1);
            } else {
                map.put(e, 1);
            }
        }
        int max = -1;
        int maxInt = arr[0];
        for (int k : map.keySet()) {
            int c = map.get(k);
            if (c > max) {
                max = c;
                maxInt = k;
            }
        }
return maxInt;
	}
}
