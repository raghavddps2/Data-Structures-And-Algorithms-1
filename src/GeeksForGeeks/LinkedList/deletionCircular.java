package GeeksForGeeks.LinkedList;

/**
 * deletionCircular
 */
public class deletionCircular {

        class Node
        {
            int data;
            Node next;
            Node(int d)
            {
                data=d;next=null;
            }
        }

    public static Node deleteNode(Node head,int d)
    {
        Node temp = head;
        Node prev = head;
        while(temp.data != d){
            prev = temp;
            temp = temp.next;
        }
        prev.next = temp.next;
        return head;
    }
    //This method returns the head node of the reversed Linked list.
    public static Node reverse(Node head)
    {
        
        //We have the task to reverse the linked list.
        Node prev = null;
        Node curr = head;
        Node next = null;
        
        do{
            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
            
        }while(curr != head);
        
        head.next = prev;
        head = prev;
        return head;
     
    }
    
}