
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class solution {
	public static LinkedListNode<Integer> skipMdeleteN(LinkedListNode<Integer> head, int M, int N) {
       LinkedListNode<Integer> trav = head;

        while (trav != null) {
            for (int i = 0; i < M - 1; i++) {
                if (trav == null)
                    break;
                trav = trav.next;
            }
            LinkedListNode<Integer> prevM = trav;

            if (prevM == null)
                return head;

            for (int i = 0; i < N; i++) {
                if (trav == null)
                    break;
                trav = trav.next;
            }

            if (trav != null)
                prevM.next = trav.next;
            else
                prevM.next = null;

            if (prevM.next == null)
                return head;
            trav = trav.next;
        }

                return head;
	}
}
