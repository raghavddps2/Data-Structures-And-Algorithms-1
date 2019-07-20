package Lecture12;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}

public class LLElement {

	public static void printIth(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		*/
        int k = 0;
        LinkedListNode refHead = head;
        while(refHead != null){
            if(k == i){
                System.out.println(refHead.data);
                break;
            }
            refHead = refHead.next;
            k++;
        }
		
	}
}