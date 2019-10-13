import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashMap;

public class Solution {

	  public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        int n = Integer.parseInt(reader.readLine());
        System.out.println(balancedTreesOfHeightH(n));
    }

    static int M = 1_000_000_000 + 7;

    public static int balancedTreesOfHeightH(int height) {

        // Recursive
        // int resREC = balancedTreesOfHeightHREC(height);
        // return resREC;

        // Memoization
        // HashMap<Integer, Integer> map = new HashMap<>();
        // int resMEM = balancedTreesOfHeightHMEM(height, map);
        // return resMEM;

        // Tabulation
        int resTAB = balancedTreesOfHeightHTAB(height);
        return resTAB;
    }

    public static int balancedTreesOfHeightHREC(int height) {
        if (height == 1 || height == 0)
            return 1;
        if (height < 0)
            return 0;
        int heightMinusOne = balancedTreesOfHeightHREC(height - 1) % M;
        int heightMinusTwo = balancedTreesOfHeightHREC(height - 2) % M;

        int result = mul(heightMinusOne, heightMinusOne);
        result = (result % M + mul(2, mul(heightMinusOne, heightMinusTwo))) % M;
        return result % M;
    }

    public static int balancedTreesOfHeightHMEM(int height, HashMap<Integer, Integer> map) {
        if (height == 1 || height == 0) {
            map.put(height, 1);
            return 1;
        }
        if (height < 0) {
            map.put(height, 0);
            return 0;
        }
        int heightMinusOne;
        if (map.containsKey(height - 1))
            heightMinusOne = map.get(height - 1);
        else
            heightMinusOne = balancedTreesOfHeightHMEM(height - 1, map) % M;
        int heightMinusTwo;
        if (map.containsKey(height - 2))
            heightMinusTwo = map.get(height - 2);
        else
            heightMinusTwo = balancedTreesOfHeightHMEM(height - 2, map) % M;

        int result = mul(heightMinusOne, heightMinusOne);
        result = (result % M + mul(2, mul(heightMinusOne, heightMinusTwo))) % M;
        map.put(height, result % M);
        return result % M;
    }

    public static int balancedTreesOfHeightHTAB(int height) {
        HashMap<Integer, Integer> map = new HashMap<>();
        map.put(0, 1);
        map.put(1, 1);
        for (int i = 2; i <= height; i++) {
            int heightMinusOne = map.get(i - 1);
            int heightMinusTwo = map.get(i - 2);
            // int result = mul(heightMinusOne, heightMinusOne);
            // result = (result % M + mul(mul(heightMinusOne, heightMinusTwo), 2)) % M;
            int result = mul(heightMinusOne, heightMinusOne);
            int tempResult = mul(heightMinusOne, heightMinusTwo);
            tempResult = (tempResult % M + tempResult % M) % M;
            result = (result % M + tempResult % M) % M;
            map.put(i, result % M);
        }
        return map.get(height);
    }

    public static int mul(int a, int b) {
        int res = 0;
        a = a % M;
        while (b > 0) {
            if (b % 2 == 1)
                res = (res % M + a % M) % M;
            a = (2 * a) % M;
            b /= 2;
        }
        return res % M;
    }
}
