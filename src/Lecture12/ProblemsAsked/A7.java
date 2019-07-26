


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
	public static  LinkedListNode<Integer> swap_nodes(LinkedListNode<Integer> head,int i,int j){
		
        if(i>j){
            int temp = i;
                i = j;
                j = temp;
        }
        
        
        int track1 = 0;
        LinkedListNode c1 = head;
        LinkedListNode p1 = null;
        
        while(track1 != i){
            p1 = c1;
            c1 = c1.next;
            track1++;
        }
        
        
        int track2 = 0;
        LinkedListNode c2 = head;
        LinkedListNode p2 = null;
        
        while(track2 != j){
            p2 = c2;
            c2 = c2.next;
            track2++;
        }
       // System.out.println(c1.data);
        //System.out.println(c2.data);
      //  System.out.println(p1.data);
        //System.out.println(p2.data);
        //swapping logic.
        if(i == 0 || j == 0){
            if(Math.abs(i-j) == 1 ){
                c1.next = c2.next;
                c2.next = c1;
                return c2;
            }
            else{
                LinkedListNode temp = c1.next;
                p2.next = c1;
                c1.next = c2.next;
                c2.next = temp;
                return c2;
            }
        }
        else if(Math.abs(i-j) == 1){
            p1.next = c2;
            c1.next = c2.next;
            c2.next = c1;
        }
        else{
            LinkedListNode temp = c1.next;
            c1.next = c2.next;
            c2.next = temp;
            p1.next = c2;
            p2.next = c1;
        }
         return head;   
	}
}