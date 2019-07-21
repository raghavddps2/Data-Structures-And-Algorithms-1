 package Lecture12;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 

public class  merge2LL{

	public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automwrmatically.
		*/
		
        //SImply, merge the two lists.
        LinkedListNode dummyNode = new LinkedListNode(0);
        LinkedListNode finalList = dummyNode;
        
        while(true){
            if(head1 == null){
                finalList.next = head2;
                break;
            }
            if(head2 == null){
                finalList.next = head1;
                break;
            }
            if(head1.data <= head2.data){
                finalList.next = head1;
                head1 = head1.next;
            }
            else{
                finalList.next = head2;
                head2 = head2.next;
            }
            finalList = finalList.next;
        }
        return dummyNode.next;
	}

}