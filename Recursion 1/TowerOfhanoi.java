import java.util.Scanner;
public class solution {

	public static void towerOfHanoi(int disks, char source, char auxiliary, char destination) {
		// Write your code here
if(disks == 0){
          return;`
        }
        towerOfHanoi(disks-1,source,destination,auxiliary); 
        System.out.println(source + " " + destination); 
        towerOfHanoi(disks-1,auxiliary,source,destination); 
	}

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		int disks = s.nextInt();
		char source = s.next().charAt(0);
		char auxiliary = s.next().charAt(0);
		char destination = s.next().charAt(0);
towerOfHanoi(disks, source, auxiliary, destination);
	}
}
