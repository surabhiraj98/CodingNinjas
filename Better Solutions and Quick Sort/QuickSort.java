import java.util.Arrays;
public class Solution {
	
	public static void quickSort(int[] input) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * No need to print or return the output.
		 * Taking input and printing output is handled automatically.
		 */
		quickSort(input, 0, input.length - 1);
    }

    public static void quickSort(int[] input, int start, int end) {
        if (start >= end)
            return;
        int c = partition(input, start, end);
        quickSort(input, start, c - 1);
        quickSort(input, c + 1, end);
    }

    public static int partition(int[] input, int start, int end) {
        int i = start, j = end;

        int count = 0;
        for (int x = start; x <= end; x++) {
            if (input[start] > input[x])
                count++;
        }
        int pivot = start + count;
        swap(input, start, pivot);

        while (i <= pivot - 1 && j >= pivot + 1) {
            while (input[i] < input[pivot])
                i++;
            while (input[j] >= input[pivot])
                j--;
            if (i >= pivot || j <= pivot)
                break;
            else
                swap(input, i, j);
        }

        return pivot;
    }
    
    public static void swap(int[] input, int i, int j) {
        
        int temp = input[i];
        input[i] = input[j];
input[j] = temp;
	}
	
}
