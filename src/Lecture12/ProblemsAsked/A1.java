

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
    
    public static void del(LinkedListNode<Integer> temp2,LinkedListNode<Integer> head){
        
        LinkedListNode prev = null;
        while(head != temp2){
            prev = head;
            head = head.next;
        }
        prev.next = head.next;
    }
    
	public static LinkedListNode<Integer> removeDuplicates(LinkedListNode<Integer> head) {
        
        LinkedListNode temp1 = head;
        while(temp1 != null){
            LinkedListNode temp2 = temp1.next;
            int count = 0;
            while(temp2 != null){
                count++;
                //System.out.println(temp1.data+" "+temp2.data);
                if(temp1.data.equals(temp2.data)){
                  //  System.out.println("HI!");
                    del(temp2,head);
                }
                temp2 = temp2.next;
            }
            temp1 = temp1.next;
        }
        return head;
    }
}