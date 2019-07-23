package Lecture12;

/**
 * reverseLL
 */
public class reverseLL {

    public static void main(String[] args) {
        
        LinkedList1 list = new LinkedList1();
        list = list.insertElement(list,1);
        list = list.insertElement(list,2);
        list = list.insertElement(list,3);
        list = list.insertElement(list,4);
        list = list.insertElement(list,5);
        list = list.insertElement(list,6);
        list = list.insertElement(list,7);
        list = list.insertElement(list,8);
        list.printElements(list);
        LinkedList1 list1 = new LinkedList1();
        list1 = list.reverseElements(list);
        list1.printElements(list1);

        
    }
}