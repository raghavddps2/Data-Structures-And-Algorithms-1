 package Lecture12;
class LinkedList<T> {
	T data;
	LinkedList<T> next;

	public LinkedList(T data) {
		this.data = data;
	}
}
 

public class  merge2LL{

	public static LinkedList<Integer> mergeTwoList(LinkedList<Integer> head1, LinkedList<Integer> head2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automwrmatically.
		*/
		
        //SImply, merge the two lists.
        LinkedList dummyNode = new LinkedList(0);
        LinkedList finalList = dummyNode;
        
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