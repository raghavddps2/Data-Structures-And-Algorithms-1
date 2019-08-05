package DS.Stacks;
import DS.Stacks.*;
class Stack<T>{

    Node<T> top;
    
    public void push(T data){
        Node<T> new_node = new Node<T>(data);
        new_node.next = top;
        top = new_node;
        return;
    }

    public void pop(){
        if(top != null){
            top = top.next;
            return;
        }
    }
    
    public T peek(){
        
        return top.data;

    }

    public void print(){
        if(top == null){
            System.out.println("Stack is empty");
        }
        else{
            Node<T> temp = top;
            System.out.print("The elements of the stack are: ");
            while(temp != null){
                System.out.print(temp.data+" ");
                temp = temp.next;
            }
        }
        System.out.println();
    }
}