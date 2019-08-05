package DS.Queues;
import DS.Queues.Node;

//This is not a circular queue.
class Queues<T>{

    Node<T> head;
    Node<T> tail;

    public void insert(T data){
        Node<T> new_node = new Node<T>(data);

        if(head == null){
            head = new_node;
            tail = new_node;
            return;
        } 
        else{
            tail.next = new_node;
            tail = new_node;
        }
    }

    public void delete(){

        if(head == null){
            return;
        }
        if(head.next == null){
            head = null;
            tail = null;
            return;
        }
        head = head.next;
        return;
    }

    public T inFront(){
        //Not handling the edge case.
        return head.data;
    }

    public void print(){
        if(head == null){
            return;
        }
        else{
            Node<T> temp = head;
            while(temp != tail){
                System.out.print(head.data+" ");
                temp = head.next;
            }
            System.out.println(temp.data);
        }
    }
}

