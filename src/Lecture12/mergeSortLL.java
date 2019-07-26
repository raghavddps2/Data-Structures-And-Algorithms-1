
public class Solution {



    public static LinkedListNode<Integer> mergeTwoList(LinkedListNode<Integer> head1, LinkedListNode<Integer> head2) {
        LinkedListNode<Integer> dummyNode = new LinkedListNode<Integer>(0);
        LinkedListNode<Integer> finalList = dummyNode;

        while(true){
            if(head1 == null){
                finalList.next = head2;
                break;
            }
            if(head2 == null){
                finalList.next = head1;
                break;
            }
            if(head1.data <= head2.data){
                finalList.next = head1;
                head1 = head1.next;
            }
            else{
                finalList.next = head2;
                head2 = head2.next;
            }
            finalList = finalList.next;
        }
        return dummyNode.next;
    }

    public static void print(LinkedListNode head){
        while(head!=null){
            System.out.println(head.data+" ");
            head=  head.next;
        }
    }
    public static LinkedListNode<Integer> mergeSort(LinkedListNode<Integer> head) {


        if(head == null || head.next == null){
            return head;
        }
        int count = 0;
        LinkedListNode<Integer> ref_head = head;
        while(ref_head != null){
            count++;
            ref_head = ref_head.next;
        }
        int mid = count/2;
        int track = 1;
        ref_head = head;
        while(track != mid){
            ref_head = ref_head.next;
            track++;
        }
        LinkedListNode<Integer> temp = ref_head.next;
        ref_head.next = null;
        LinkedListNode<Integer> h1 = mergeSort(head);
        LinkedListNode h2 = mergeSort(temp);
        head = mergeTwoList(h1,h2);        
        // print(h1);
        // print(h2);
        // print(head);
        return head;

    }

}
