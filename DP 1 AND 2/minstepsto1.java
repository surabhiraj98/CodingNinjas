import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;


public class Solution {
	
	 public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        int n = Integer.parseInt(reader.readLine());
        System.out.println(countStepsTo1(n));
    }

    public static int countStepsTo1(int n) {
        // Recursive
        // return countStepsTo1REC(n);

        // Memoized
        // HashMap<Integer, Integer> map = new HashMap<>();
        // return countStepsTo1MEM(n, map);

        // Tabulization
        return countStepsTo1TAB(n);
    }

    public static int countStepsTo1REC(int n) {
        if (n == 1)
            return 0;
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1 + countStepsTo1REC(n - 1));
        if (n % 2 == 0)
            list.add(1 + countStepsTo1REC(n / 2));
        if (n % 3 == 0)
            list.add(1 + countStepsTo1REC(n / 3));
        return Collections.min(list);
    }

    public static int countStepsTo1MEM(int n, HashMap<Integer, Integer> map) {
        if (n == 1)
            return 0;
        if (map.containsKey(n)) {
            return map.get(n);
        }
        ArrayList<Integer> list = new ArrayList<>();
        list.add(1 + countStepsTo1MEM(n - 1, map));
        if (n % 2 == 0)
            list.add(1 + countStepsTo1MEM(n / 2, map));
        if (n % 3 == 0)
            list.add(1 + countStepsTo1MEM(n / 3, map));
        map.put(n, Collections.min(list));
        return map.get(n);
    }

    public static int countStepsTo1TAB(int n) {
        int[] steps = new int[n + 1];
        for (int i = 2; i <= n; i++) {
            ArrayList<Integer> list = new ArrayList<>();
            list.add(1 + steps[i - 1]);
            if (i % 2 == 0)
                list.add(1 + steps[i / 2]);
            if (i % 3 == 0)
                list.add(1 + steps[i / 3]);
            steps[i] = Collections.min(list);
        }
        return steps[n];
    }
}
