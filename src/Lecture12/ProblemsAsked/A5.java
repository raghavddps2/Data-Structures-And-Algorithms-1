
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
	public static LinkedListNode<Integer> reverse_I(LinkedListNode<Integer> head) {
		
        int count = 0;
        LinkedListNode head1 = head;
        while(head1 != null){
            head1 = head1.next;
            count++;
        }
        LinkedListNode head2 = null;
        while(count != 0){
            int res = 0;
            head1 = head;
            while((count-1) != res){
                head1 = head1.next;
                res++;
            }
            LinkedListNode new_node = new LinkedListNode(head1.getData());
            if(head2 == null){
                head2 = new_node;
            }
            else{
                LinkedListNode head3 = head2;
                while(head3.next != null){
                    head3 = head3.next;
                }
                head3.next = new_node;
            }
            count--;
        }
        return head2;
    }
}