/*************** 
 * Following is the Node class already written 
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public Node(T data) {
		this.data = data;
	}
}
 ***************/

public class Solution {

	public static LinkedListNode<Integer> nthNodeFromLastIter(LinkedListNode<Integer> head, int n){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        
        
        /*
            Approach is very interesting.
            1. We initialize a variable called as p1 and p2, and p2 goes till where it dhould go from the
                front side.
            2. once it reaches the position from the start, we then go till the end one by one 
            3. Meanwhile we do so, our p1.data() will point in the correct element.
        
        
        
        */
	    LinkedListNode p1 = head;
        LinkedListNode p2 = head;
        int count = 0;
        while(count != n){
            p2 = p2.next;
            count++;
        }
        if(p2 == null){
            return null;
        }
        while(p2.next!=null){
            p2 = p2.next;
            p1 = p1.next;
        }
        return p1;
	}
}