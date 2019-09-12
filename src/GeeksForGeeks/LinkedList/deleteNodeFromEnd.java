package GeeksForGeeks.LinkedList;

/**
 * deleteNodeFromEnd
 */
public class deleteNodeFromEnd {

 
    // Function to find the nth node from end in the linked list
    // head: head of the linked list
    // n: nth node from end to find
    int getNthFromLast(Node head, int n)
    {
    	int k = 0;
    	Node head1 = head;
    	Node head2 = head;
    	Node temp = head;
    	int count = 0;
    	while(temp != null){
    	    temp = temp.next;
    	    count++;
    	}
    	if(n > count){
    	    return -1;
    	}
    	if(n == count){
    	    return head.data;
    	}
    	while(k < n){
    	    head1 = head1.next;
    	    k++;
    	}
    // 	System.out.println(head1.data);
    	while(head1 != null){
    	    head1 = head1.next;
    	    head2 = head2.next;
    	}
    	return head2.data;
    }

}