import java.util.*;

public class Solution {
	public static void PairSum(int[] input, int size) {
		
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print the desired output and don't return anything.
	 	 * Taking input is handled automatically.
		 */
        HashMap<Integer, Integer> negMap = new HashMap<Integer, Integer>();
        HashMap<Integer, Integer> posMap = new HashMap<Integer, Integer>();
        int noOfZeros = 0;

        for (int e : input) {
            if (e == 0) {
                noOfZeros++;
            } else if (e < 0) {
                if (negMap.containsKey(e)) {
                    int temp = negMap.get(e);
                    negMap.put(e, temp + 1);
                } else {
                    negMap.put(e, 1);
                }
            } else if (e > 0) {
                if (posMap.containsKey(e)) {
                    int temp = posMap.get(e);
                    posMap.put(e, temp + 1);
                } else {
                    posMap.put(e, 1);
                }
            }
        }

        // Print (0, 0) pairs
        for (int i = 0; i < noOfZeros * noOfZeros; i++) {
            System.out.println("0 0");
        }

        for (int negK : negMap.keySet()) {
            int posK = -1 * negK;
            if (posMap.containsKey(posK)) {
                int negV = negMap.get(negK);
                int posV = posMap.get(posK);

                for (int i = 0; i < negV * posV; i++) {
                    System.out.println(negK + " " + posK);
                }
            }
}
	}
}
