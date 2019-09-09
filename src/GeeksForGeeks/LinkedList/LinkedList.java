package GeeksForGeeks.LinkedList;
/**
 * LinkedList
 */
public class LinkedList {

    class Node{
        int data; //This is the data part.
        Node next; //This will have reference of the next node.
    
        //We need a constructor tthat initializes the node whenever we create a node.
        Node(int d){
            data = d;
            next = null;
        }
    }

    //When we implement the LinkedList, the first thing
    //that we do is, we create a head node.
    Node head;

    //The insert method will need tthe data.
    public void insert(int data){   
        //We will be creating a new node here.
        Node node = new Node(data); //Data will be done there only.
        
        //If the insert is basically is our first node.
        if(head == null){
            head = node;
        }
        else{
            Node temp = head;
            //We stop when the next stores null.
            while(temp.next != null){
                temp = temp.next;
            }
            //We set the new Node to the temp.next.
            temp.next = node;
        }        
    }

    public int size(){
        Node temp = head;
        //If null, we simply return the size as 0.
        if(head == null){
            return 0;
        }
        //We get the first node and then, we get the loop occurs and we get the answer.
        int count = 1;
        while(temp.next != null){
            count++;
        }
        return count;
    }

    public void show(){
        Node temp = head;

        //If null, we just print the empty reason.
        if(temp == null){
            System.out.println("The LInked List is empty");
        }
        //Here, we will go till the pointer only becomes null.
        else{
            while(temp != null){
                System.out.print(temp.data+"-->");
                temp = temp.next;
                
            }
        }
    }
    public void insertAtStart(int data){
        Node temp = head;
        Node node = new Node(data);
        //check if null;
        if(temp == null){
            head = node;
        }
        else{
            //We will put the head in the node's next.
            node.next = head;
            head = node; //Now the head will becoome the current node.
        }
    }

    //Here, index tells at which position we wanna add.
    public void insertAt(int index,int data){

        Node node = new Node(data);

        //In case if we insert at index 0, just call the start method.
        if(index == 0){
            insertAtStart(data);
            return;
        }

        Node temp = head;
        //Later temp will give me the node after which we wanna insert.
        int i = 0;
        while(i<index){
            temp = temp.next;
            i++;
        }
        //We connect the new and the next one.
        node.next = temp.next;
        temp.next = node; 
    }

    public void delete(int index){

        //If first element is something you wanna delete,
        //what we do is just point the next to next
        if(index == 0){
            head = head.next;
        }
        else{
            int i=0;
            Node temp = head;
            while(i<index){
                temp = temp.next;
                i++;
            }
            Node actualIndex = temp.next;
            //Now, actualIndex.next is to be places in temp.next;
            temp.next = actualIndex.next;
            System.out.println("The deleted element is "+actualIndex.data);
            actualIndex = null; //We can put that to null.
        }
    }

    public static void main(String[] args){

        LinkedList ll = new LinkedList();
        ll.insert(10);
        ll.insert(11);
        ll.insert(12);
        ll.insertAtStart(9);
        ll.insertAt(2,13);
        ll.delete(2);
        ll.show();
    }

}