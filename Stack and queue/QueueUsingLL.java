/***************
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);

		Queue<Integer> st = new Queue<Integer>();

		int choice = s.nextInt();
		int input;

		while (choice !=-1) {
			if(choice == 1) {
				input = s.nextInt();
				st.enqueue(input);
			}
			else if(choice == 2) {
				try {
					System.out.println(st.dequeue());
				} catch (QueueEmptyException e) {
					System.out.println(-1);
				}
			}
			else if(choice == 3) {
				try {
					System.out.println(st.front());
				} catch (QueueEmptyException e) {
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
}

class Node<T> {
	T data;
	Node<T> next;

	public Node(T data) {
		this.data = data;
	}
}


 ***********/
class QueueEmptyException extends Exception{
    QueueEmptyException(){
        super();
    }
}
public class Queue<T> {
    private Node<T> front;
    private Node<T> rear;
    private int size;
public Queue() {
     front=null;
        rear=null;
    size=0;
	}
    public void enqueue(T data) {
        Node<T> newNode=new Node<>(data);
        newNode.next=null;
        if(front==null){
            front=newNode;
            rear=newNode;
            size++;
            return;
        }
        rear.next=newNode;
        rear=newNode;
        size++;
	}

	public int size() {
        return size;
	}

	public boolean isEmpty() {
        if(size<=0){
            return true;
        }
        return false;
	}

	public T dequeue() throws QueueEmptyException {
        
        
        T x=front.data;
        front=front.next;
        size--;
        return x;        
	}
	public T front() throws QueueEmptyException {
        
        //front=front.next;
        return front.data;
	}
}

	
