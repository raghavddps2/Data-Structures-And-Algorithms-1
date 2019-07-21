package Lecture12;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 

public class deleteNode {

	public static LinkedListNode<Integer> deleteIthNode(LinkedListNode<Integer> head, int i){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
         if(head == null){
             return head;
         }   
        else if(i == 0){
            head = head.next;
            return head;
        }
        else{
            LinkedListNode temp = head;
            for(int k=0;temp!=null && k<i-1;k++){
                 temp = temp.next;   
            }
            if(temp == null || temp.next == null){
                return head;
            }
            temp.next = temp.next.next;
            
        }
        return head;
		
	}
}