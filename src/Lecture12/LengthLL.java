package Lecture12;

/**
 * LengthLL
 */
class Node{
    int data;
    Node next;
}

public class LengthLL {

    public static int LengthIterative(Node head){
        if(head == null){
            return 0;
        }
        else{
            int count = 0;
            while(head!= null){
                count++;
                head = head.next;
            }
            return count;
        }
    }

    public static int LengthRecursive(Node head){

        if(head == null){
            return 0;
        }
        return 1+LengthRecursive(head.next);
    }
    
}