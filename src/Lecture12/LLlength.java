package Lecture12;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
public class LLlength {

	public static int length(LinkedListNode<Integer> head){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int count = 0;
        LinkedListNode refHead = head;
        while(refHead != null){
            count++;
            refHead = refHead.next;
        }
        return count;
		
	}
}