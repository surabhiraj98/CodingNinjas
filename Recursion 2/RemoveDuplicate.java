public class Solution {

	public static String removeConsecutiveDuplicates(String s) {
		// Write your code here
if(s.length()==1)
		{
			return s ;
		}
		String myans = removeConsecutiveDuplicates(s.substring(1)) ;
		if(!(s.charAt(0)==myans.charAt(0)))
		{
			String temp = s.charAt(0) + myans ;
			myans = temp ;
		}
		return myans ;
	}

	public static void main(String[] args) {
		
		System.out.println(removeConsecutiveDuplicates("aaabbc"));

	}

}
