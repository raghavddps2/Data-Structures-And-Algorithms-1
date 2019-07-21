package Lecture12;
class LinkedListNode<T> {
	T data;
	LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.data = data;
	}
}
 

public class insertLL {
	
	public static Node<Integer> insert(Node<Integer> head, int data, int pos){
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        Node new_node = new Node(data);
        if(head == null){
            head = new_node;
        }
        else if(pos == 0){
            new_node.next = head;
            head = new_node;
        }
        else{
            int i=0;
            Node currentNode = head;
            Node prevNode = null;
            while(currentNode != null){
                if(i == pos){
                    break;
                }
                prevNode = currentNode;
                currentNode = currentNode.next;
                i = i+1;
            }
            if(i == pos){
                new_node.next = currentNode;
                prevNode.next = new_node;
            }
        }
        return head;
		
        
	}
}