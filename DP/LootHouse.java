import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.HashMap;
public class Solution {
	 public static void main(String[] args) throws IOException {
        InputStreamReader in = new InputStreamReader(System.in);
        BufferedReader reader = new BufferedReader(in);

        int n = Integer.parseInt(reader.readLine());
        int[] arr = Arrays.stream(reader.readLine().split("\\s")).mapToInt(Integer::parseInt).toArray();
        System.out.println(getMaxMoney(arr, n));
    }

    public static int getMaxMoney(int arr[], int n) {
        
        int resTAB = getMaxMoneyTAB(arr, n);
        return resTAB;
    }

    public static int getMaxMoneyREC(int arr[], int n, int s) {
        if (s >= n)
            return 0;
        int res = arr[s];
        int resOne = getMaxMoneyREC(arr, n, s + 2);
        int resTwo = getMaxMoneyREC(arr, n, s + 3);
        res += resOne > resTwo ? resOne : resTwo;
        return res;
    }

    public static int getMaxMoneyMEM(int arr[], int n, int s, HashMap<Integer, Integer> map) {
        if (s >= n)
            return 0;
        int res = arr[s];
        int resOne = map.containsKey(s + 2) ? map.get(s + 2) : getMaxMoneyMEM(arr, n, s + 2, map);
        int resTwo = map.containsKey(s + 3) ? map.get(s + 3) : getMaxMoneyMEM(arr, n, s + 3, map);
        res += resOne > resTwo ? resOne : resTwo;
        map.put(s, res);
        return res;
    }

    public static int getMaxMoneyTAB(int arr[], int n) {
        if (n == 1)
            return arr[0];
        if (n == 2)
            return arr[0] > arr[1] ? arr[0] : arr[1];
        arr[n - 3] = arr[n - 3] + arr[n - 1];
        for (int i = n - 4; i >= 0; i--) {
            arr[i] += arr[i + 2] > arr[i + 3] ? arr[i + 2] : arr[i + 3];
        }
        return arr[0] > arr[1] ? arr[0] : arr[1];
    }
}
