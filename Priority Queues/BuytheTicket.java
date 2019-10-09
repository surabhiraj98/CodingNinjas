import java.util.*;
public class Solution {
	
	public static int buyTicket(int input[], int k) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, it is passed as function argument.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
Queue<Integer> q = new LinkedList<Integer>();
        PriorityQueue<Integer> pq = new PriorityQueue<Integer>(10,Collections.reverseOrder());
        for(int i: input){
            q.add(i);
            pq.add(i);
        }
        int count =0;
        while(!pq.isEmpty()){
            if(q.peek().equals(pq.peek())){
                if(k==0){
                    return count+1;
                }
                else 
                {
                    count++;
                    q.poll();
                    pq.poll();
                    k--;
                }
            }
            else {
                q.add(q.peek());
                q.poll();
                if(k==0){
                    k = q.size()-1;
                    
                }
                else {
                    k--;
                }
            }
        }
        return count;
	}
}
