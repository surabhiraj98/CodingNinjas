import java.util.ArrayList;

/*****************
* Main function - 
*
	public static void main(String[] args) {
		PQ pq = new PQ();
		int choice = s.nextInt();
		while(choice != -1) {
			switch(choice) {
				case 1 : // insert
					int element = s.nextInt();
					pq.insert(element);
					break;
				case 2 : // getMin
				try {
					System.out.println(pq.getMin());
				} catch (PriorityQueueException e) {
					return;
				}
					break;
				case 3 : // removeMin
				try {
					System.out.println(pq.removeMin());
				} catch (PriorityQueueException e) {
					return;
				}
					break;
				case 4 : // size
					System.out.println(pq.size());
					break;
				case 5 : // isEmpty
					System.out.println(pq.isEmpty());
				default :
						return;
			}
			choice = s.nextInt();
		}
	}
*******************/

class PriorityQueueException extends Exception {

}

public class PQ {

	private ArrayList<Integer> heap;

	public PQ() {
		heap = new ArrayList<Integer>();
	}

	boolean isEmpty(){
		return heap.size() == 0;
	}

	int size(){
		return heap.size();
	}

	int getMin() throws PriorityQueueException{
		if(isEmpty()){
			// Throw an exception
			throw new PriorityQueueException();
		}
		return heap.get(0);
	}

	void insert(int element){
		heap.add(element);
		int childIndex = heap.size() - 1;
		int parentIndex = (childIndex - 1) / 2;

		while(childIndex > 0){
			if(heap.get(childIndex) < heap.get(parentIndex)){
				int temp = heap.get(childIndex);
				heap.set(childIndex, heap.get(parentIndex));
				heap.set(parentIndex, temp);
				childIndex = parentIndex;
				parentIndex = (childIndex - 1) / 2;
			}else{
				return;
			}
		}
	}

	int removeMin()  throws PriorityQueueException {
		if (isEmpty()) {
			throw new PriorityQueueException();
		}
		int temp = heap.get(0);
		heap.set(0, heap.get(heap.size() - 1));
		heap.remove(heap.size() - 1);
		int index = 0;
		int minIndex = index;
		int leftChildIndex = 1;
		int rightChildIndex = 2;
		while (leftChildIndex < heap.size()) {
			if (heap.get(leftChildIndex) < heap.get(minIndex)) {
				minIndex = leftChildIndex;
			}
			if (rightChildIndex < heap.size() && heap.get(rightChildIndex) < heap.get(minIndex)) {
				minIndex = rightChildIndex;
			}
			if (minIndex == index) {
				break;
			} else {
				int temp2 = heap.get(index);
				heap.set(index, heap.get(minIndex));
				heap.set(minIndex, temp2);
				index = minIndex;
				leftChildIndex = 2 * index + 1;
				rightChildIndex = 2 * index + 2;
			}
		}
		return temp;
	}
	
}


