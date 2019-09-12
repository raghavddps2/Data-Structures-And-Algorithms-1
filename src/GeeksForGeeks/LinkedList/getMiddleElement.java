class getMiddleElement
{
    // Function to find middle element a linked list
    int getMiddle(Node head)
   {
             Node head1 = head;
       Node head2 = head;
       
       while(head1 != null && head1.next != null){
            head1 = head1.next.next;
            head2 = head2.next;
       }
   
       return head2.data;
   }
   
}
