import java.util.*;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		/* Your class should be named Intersection
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
  		 */
 HashMap<Integer, Integer> map1 = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> map2 = new HashMap<Integer, Integer>();

        for (int e : arr1) {
            if (map1.containsKey(e)) {
                int temp = map1.get(e);
                map1.put(e, temp + 1);
            } else {
                map1.put(e, 1);
            }
        }

        for (int e : arr2) {
            if (map2.containsKey(e)) {
                int temp = map2.get(e);
                map2.put(e, temp + 1);
            } else {
                map2.put(e, 1);
            }
        }

        for (int k : map1.keySet()) {
            if (map2.containsKey(k)) {
                int v1 = map1.get(k);
                int v2 = map2.get(k);
                int counter = v1 <= v2 ? v1 : v2;
                for (int i = 0; i < counter; i++) {
                    System.out.println(k);
                }
            }
}
	}
}
