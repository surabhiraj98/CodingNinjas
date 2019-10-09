import java.util.ArrayList;
import java.util.*;
public class solution {

	public static ArrayList<Integer> longestSubsequence(int[] arr){
		// Write your code here
HashMap<Integer, Boolean> map = new LinkedHashMap<>();
        ArrayList<Integer> result = new ArrayList<>();
        for (int v : arr) {
            map.put(v, false);
        }
        for (int e : map.keySet()) {
            if (!map.get(e)) {
                ArrayList<Integer> tempList = new ArrayList<>();
                tempList.add(e);
                map.put(e, true);
                for (int i = 1; map.containsKey(e + i); i++) {
                    tempList.add(e + i);
                    map.put(e + i, true);
                }
                if (result.size() < tempList.size()) {
                    result = tempList;
                }
            }
        }
return result;
	}
}
