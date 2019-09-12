//This is an awesome question.
/*

    In this what we are supposed to do is,
        -- We have to delete a node and the conditions are that the head node is not given
        Algorithm:
            1. What we do is we take the node and then swap the value of that node and the next node.
            2. We do this till we reach the last node.
            3. We then substitute the nodes next to null, so that we don't have that element till now.
*/

package GeeksForGeeks.LinkedList;

/**
 * deleteNode
 */
public class deleteNode {

    {
        void deleteNode(Node node)
        {
            Node temp = node.next;
             while(true){
                 int data = node.data;
                    node.data = temp.data;
                    temp.data = data;
                if(temp.next == null){
                    node.next = null;
                    return;
                }
                node = node.next;
                temp = temp.next;
             }
        }
    }
}