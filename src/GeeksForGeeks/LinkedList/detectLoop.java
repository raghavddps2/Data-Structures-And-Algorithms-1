package GeeksForGeeks.LinkedList;
import java.util.*;
class detectLoop{
    int detectLoop(Node head) {
        
        Node hare = head;
        Node turtle = head;
        int ans = 0;
        while(hare != null && turtle != null && turtle.next != null ){
            hare = hare.next;
            turtle = turtle.next.next;
            if(hare == turtle){
                ans = 1;
                break;
                
            }
        }
        return ans;
    }
}