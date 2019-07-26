
/*
class LinkedListNode<T> {
	public T data;
	public LinkedListNode<T> next;

	public LinkedListNode(T data) {
		this.setData(data);
		this.next = null;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}

}
* */
public class Solution {
	
	public static LinkedListNode<Integer> reverse_R(LinkedListNode<Integer> node) {
		       LinkedListNode newHead;
     
       if((node.next == null)){
           return node;
       }
       newHead = reverse_R(node.next);
        
       node.next.next = node;
       node.next = null;    
       return newHead;

	}
}
