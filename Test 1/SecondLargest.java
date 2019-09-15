import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		// Write your code here
Scanner s = new Scanner(System.in);
        int max,max1,t;
        int j =0;
        int n = s.nextInt();
        if(n==0){
            System.out.println(Integer.MIN_VALUE);
            return;
        }
        int a = s.nextInt();
        if(n==1){
            System.out.println(Integer.MIN_VALUE);
            return;
        }
      int b = s.nextInt();
        if(a<b){
            t=a;
            a=b;
            b=t;
        }
        max = a;
        max1 = b;
        while(j < n-2){
            int i = s.nextInt();
            if(i > max)
            {
                max1 = max;
                max = i;
            }
            else if(i > max1 && i != max)
            {
                max1 = i;
            }
            else;
            j++;
        }
        if(max1 == max)
            System.out.print(Integer.MIN_VALUE);
        else
        System.out.print(max1);

}
}
	
