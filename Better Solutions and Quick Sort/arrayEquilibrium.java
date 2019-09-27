public class ArrayEquilibrium{	
    public static void main(String[] args) {
       int[] arr = { -7, 1, 5, 2, -4, 3, 0 };
        System.out.println(arrayEquilibrium(arr));
    }

	//arr is the given array in which you need to find the equilibrium index
	public static int arrayEquilibrium(int[] arr){  
		//write your code here
        int[] countArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            countArr[i] = arr[i];
        }
        for (int i = 1; i < arr.length; i++) {
            countArr[i] += countArr[i - 1];
        }
        int fullSum = countArr[countArr.length - 1];
        for (int i = 1; i < arr.length - 1; i++) {
            int leftSum = countArr[i - 1];
            int rightSum = fullSum - countArr[i];
            if (leftSum == rightSum) return i;
        }
return -1;
	}
}
//time complexity n^2
//space complaexity no extra space so n
