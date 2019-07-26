
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
    // 	public static void printReverseRecursive(LinkedListNode<Integer> root) {
             
    //         int count = 0;
    //         LinkedListNode head = root;
    //         while(head != null){
    //             head = head.next;
    //             count++;
    //         }
            
    //         while(count != 0){
    //             int res = 0;
    //             head = root;
    //             while((count-1) != res){
    //                 head = head.next;
    //                 res++;
    //             }
    //             System.out.print(head.getData()+" ");
    //             count--;
    //         }
            
    //     }
        public static void printReverseRecursive(LinkedListNode list){
    
            if(list == null){
                return;
            }
            printReverseRecursive(list.next);
            System.out.print(list.getData()+" ");
        } 
    }