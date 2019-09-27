public class Solution {

	public static int sum(int input[]) {
		return sumofArray(input,0) ;
		
	}
    
    public static int sumofArray(int[] arr,int startIndex) {
		
        if(startIndex == arr.length){
            return 0;
        }
        int smallSum = sumofArray(arr,startIndex+1);
        int mySum = smallSum+arr[startIndex];
        return mySum;
    }
}
