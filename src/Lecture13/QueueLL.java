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
    //We will do something here to make the message proper or anything like that.
}
public class Queue<T> {

    private Node<T> head = null;
    private Node<T> tail = null;
    private int length =0;
	public Queue() {

	}

	public void enqueue(T data) {
       Node<T> new_node = new Node<T>(data);
        length++;
        if(head == null){
            head = new_node;
            tail = head;
            return;
        }
        tail.next = new_node;
        tail = new_node;
        return;
	}    

	public int size() {
        return length;
	}

	public boolean isEmpty() {
        if(head == null){
            return true;
        }
        return false;
	}

	public T dequeue() throws QueueEmptyException {
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        length--;
        T myVal = head.data;
        head = head.next;
        return myVal;
	}

	public T front() throws QueueEmptyException {
        if(head == null){
            QueueEmptyException e = new QueueEmptyException();
            throw e;
        }
        return head.data;
	}
}
