package Lecture15;

/**
 * QueueLL
 */
class QueueLL {

    class Node<T>{
        T data;
        Node<T> next;

        Node(T data){
            this.data = data;
        }
    }
    
    Node<T> head;
     Node<T> tail;

    private int size = 0;

    private int size(){

        return size;
    }
    public boolean isEmpty(){
        if(size == 0){
            return true;
        }
        else{
            return false;
        }
    }
    public int front(){
        if(size != 0){
            return head.data;
        }
    }

    public void enqueue(T element){
       Node<T> new_node = new Node<T>(element);
        if(head == null){
            head  = new_node;
            tail = new_node;
        }
        else{
            tail.next = new_node;
            tail = new_node; 
        }
        size++;
    }

    public int dequeue(){
        
		if(head == tail){
			tail = null;
		}
		T temp = head.data;
		head = head.next;
		size--;
        return temp;
        
    }
}