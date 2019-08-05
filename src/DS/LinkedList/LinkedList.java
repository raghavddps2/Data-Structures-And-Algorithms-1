
package DS.LinkedList;
import DS.LinkedList.Node;

class LinkedList<T> {

    Node<T> head;
    
    
    public void insert(T data){
        
        Node<T> new_Node = new Node<T>(data);
        
        if(head == null){
            head = new_Node;
            return;
        }

        Node<T> temp = head;
        while(temp.next != null){
            temp = temp.next;
        }
        temp.next = new_Node;
    }

    public void delete( T data){

        if(head.data == data){
            head = head.next;
            return;
        }

        if(head == null){
            return;
        }
        Node<T> temp = head;
        while(temp.next != null){
            if(temp.data == data){
                temp.next = temp.next.next;
                return;
            }
            temp = temp.next;
        }
    }

    public int length(){

        int count = 0;
        Node<T> temp = head;
        while(temp != null){
            temp = temp.next;
            count++;
        }
        return count;
    }


    public void print(){
        if(head == null){
            System.out.print("LinkedList is empty");
        }
        else{
            System.out.print("Linked list is: ");
            Node<T> temp = head;
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
    
}
