import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.Collections;
public class Solution {

	
	 public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        System.out.println(mcm(arr));
    }

    public static int mcm(int[] p) {
        // String arr = "n = " + (p.length - 1) + "ARR: [ ";
        
        HashMap<String, Integer> map = new HashMap<>();
        int resMEM = mcmMEM(p, 0, p.length - 1, map);
        // System.out.println(map);
        return resMEM;
    }

    public static int mcmREC(int[] p, int s, int e) {
        if (s + 1 == e)
            return 0;

        ArrayList<Integer> resList = new ArrayList<>();
        int res = 0;

        for (int i = s + 1; i < e; i++) {
            int tempRes = mcmREC(p, s, i) + mcmREC(p, i, e) + p[s] * p[i] * p[e];
            resList.add(tempRes);
        }

        res = Collections.min(resList);
        return res;
    }

    public static int mcmMEM(int[] p, int s, int e, HashMap<String, Integer> map) {
        if (s + 1 == e)
            return 0;

        String str = s + "," + e;
        if (map.containsKey(str))
            return map.get(str);
        ArrayList<Integer> resList = new ArrayList<>();
        int res = 0;

        for (int i = s + 1; i < e; i++) {
            int tempRes = mcmMEM(p, s, i, map) + mcmMEM(p, i, e, map) + p[s] * p[i] * p[e];
            resList.add(tempRes);
        }

        res = Collections.min(resList);
        map.put(str, res);
        return res;
    }

}
