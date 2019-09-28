import java.util.Scanner;
public class solution {
    public static void printStringArray(String[] input){
		for(int i=0;i<input.length;i++){
			System.out.println(input[i]);
		}
	}
	
	public static char[] findchars(int r){
		if(r==2){
			char ans[]={'a','b','c'};
			return ans;
		}
		if(r==3){
			char ans[]={'d','e','f'};
			return ans;
		}
		if(r==4){
			char ans[]={'g','h','i'};
			return ans;
		}
		if(r==5){
			char ans[]={'j','k','l'};
			return ans;
		}
		if(r==6){
			char ans[]={'m','n','o'};
			return ans;
		}
		if(r==7){
			char ans[]={'p','q','r','s'};
			return ans;
		}
		if(r==8){
			char ans[]={'t','u','v'};
			return ans;
		}
		if(r==9){
			char ans[]={'w','x','y','z'};
			return ans;
		}
		char ans[]={'*'};
		return ans;
	}


	// Return a string array that contains all the possible strings
	public static String[] keypad(int n){
		// Write your code here
    if(n/10==0){
			char zero[]=findchars(n);
			String ans[]=new String[zero.length];
			for(int i=0;i<zero.length;i++){
				ans[i]=zero[i]+"";
			}
			return ans;
		}
		
		String temp[]=keypad(n/10);
		
		int r=n%10;
		char c[] = findchars(r);
		
		String ans[]=new String[c.length*temp.length];
		int count=0;
		for(int i=0;i<temp.length;i++){
			for(int j=0;j<c.length;j++){
				ans[count]=temp[i]+c[j];
				count++;
			}
		}
		
		return ans;
	}
	
	
}
