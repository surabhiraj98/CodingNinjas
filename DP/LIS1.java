
public class Solution {

	public static int lis(int arr[]) {
		
		/*Your class should be named Solution. 
		*Don't write main().
	 	*Don't take input, it is passed as function argument.
	 	*Don't print output.
	 	*Taking input and printing output is handled automatically.
		*/ 		

	 int[] output = new int[arr.length];
        output[0] = 1;

        for (int i = 1; i < arr.length; i++) {
            int res = 1;
            for (int j = i - 1; j >= 0; j--) {
                if (arr[i] > arr[j]) {
                    int tempRes = output[j] + 1;
                    if (tempRes > res)
                        res = tempRes;
                }
            }
            output[i] = res;
        }
        int max = 0;
        for (int v : output) {
            if (max < v)
                max = v;
        }
        return max;
    }
}
