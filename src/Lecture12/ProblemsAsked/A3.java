
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
	public static int printMiddel(LinkedListNode<Integer> head) {
        
//         LinkedListNode list1 = head;
//         int count = 0;
//         //Dude, just the count first to figure out the position.
//         while(list1 != null){
//             count++;
//             list1 = list1.next;
//         }
//         int val = (count%2 == 0) ? count/2 : (count/2)+1;
//         int track = 1;
//         LinkedListNode list2 =head;
//         //go till the mid point.
//         while(track != val){
//             list2 = list2.next;
//             track++;
//         }
//         //System.out.println(list2.getData());
//         Integer a = (Integer)list2.getData();
//         return a;
        
        LinkedListNode s = head;
        LinkedListNode f = head.next;
        
        while(f.next != null){
            s  = s.next;
            f =  f.next.next;
        }
        
        return (int)s.getData();
        
        
    }
}