/***********

public static void main(String[] args) throws StackEmptyException {
      		Scanner s = new Scanner(System.in);

		Stack<Integer> st = new Stack<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.push(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.pop());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.top());
				} catch (StackEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 4) {
				System.out.println(st.size());
			}
			else if(choice == 5) {
				System.out.println(st.isEmpty());
			}
			choice = s.nextInt();
		}
    }


class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}

************/

class StackEmptyException extends Exception{
    StackEmptyException(){
        super();
    }
}

public class Stack<T> {
	
    private Node<T> top;
    private int size;    
	public Stack() {
      top=null;
      size=0;          
	}
	
	public int size() {
        return size;
	}
	
	public void push(T data) {
        Node<T> newNode=new Node<>(data);
        if(top==null){
            top=newNode;
            newNode.next=null;
            size++;//this has to be present man:)
            return;
        }
        newNode.next=top;
        top=newNode;
        size++;
	}
	
	public boolean isEmpty() {
        
        if(size<=0){
            return true;
        }
        return false;
	}
	
	public T pop() throws StackEmptyException{
    
        if(top==null){
            throw new StackEmptyException();
        }
        T data=top.data;
        top=top.next;
        size--;
        return data;
	}
	
	public T top() throws StackEmptyException{
        
        if(top==null){
            throw new StackEmptyException();
        }
        return top.data;
	}
}
