import java.util.Scanner;
public class solution {
    public static int[] temp;
	public static int i = 0;
	public static int j = 0;
	
	public static int[] takeInput() {
		Scanner scanner = new Scanner(System.in);
		System.out.print("Please enter the size of the array: ");
		int size = scanner.nextInt();
		int[] arr = new int[size];
		System.out.print("Please enter the elements of the array separated by space or return: ");
		for (int i = 0; i < size; i++) {
			arr[i] = scanner.nextInt();
		}
		return arr;
}
	public static void printSubsets(int input[]) {
		// Write your code here
temp = new int[input.length];
		printSubsets(input, temp, 0);
	}
	
	public static void printSubsets(int[] input, int[] subset, int a) {
		if (a == input.length) {
			for (j = 0; j < a; j++) {
				if (i == (int)Math.pow(2, input.length) - 1) {
					System.out.print(input[j] + " ");
				}
			}
			return;
		} else {
			int count = 0;
			temp[a] = 0;
			printSubsets(input, subset, a + 1);
			for (j = 0; j < subset.length; j++) {
				if (subset[j] == 0) {
					count++;
					if (count == 3) {
						System.out.print("");
					}
					continue;
				} else {
					System.out.print(subset[j] + " ");
				}
			}
			System.out.println();
			i++;
			subset[a] = input[a];
			printSubsets(input, subset, a + 1);
		}
	}
	
	public static void main(String[] args) {
		int[] arr = takeInput();
printSubsets(arr); 
	}
}
