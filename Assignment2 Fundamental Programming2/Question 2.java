Terms of AP
Write a program to print first x terms of the series 3N + 2 which are not multiples of 4.
N varies from 1 to 1000.
Input format :
Integer x
Output format :
Terms of series (separated by space)
Sample Input 1 :
10
Sample Output 1 :
5 11 14 17 23 26 29 35 38 41
Sample Input 2 :
4
Sample Output 2 :
5 11 14 17


import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
		int n=s.nextInt();
		int i=1;int count=0;
		while(count<n) {
			int ap_term=(3*i)+2;
			if(ap_term%4==0) {
				i=i+1;
				continue;
			}else {
			
			System.out.print(((3*i)+2)+" ");
			count=count+1;
			}
			i=i+1;
		}
	}
}



