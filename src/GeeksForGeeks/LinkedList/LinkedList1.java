package GeeksForGeeks.LinkedList;
import java.util.LinkedList;
/**
 * LinkedList1
 */
public class LinkedList1 {

    //We have the LInkedList in the collections framework.
    public static void main(String[] args) {
        LinkedList<String> name = new LinkedList<String>();
        name.add("Raghav");
        name.add("Rohit");
        name.add("Pooja");
        name.add("Nidhi");
        name.addFirst("Rahul");
        name.addLast("Reshma");
        name.remove("Reshma");
        name.remove("Raghav");
        name.add(1,"Roo");
        name.remove(1);
        name.set(1,"poo"); //This adds at the index.
        System.out.println(name.size());
        for(String x: name){
            System.out.println(x);
        }
    }
    
}