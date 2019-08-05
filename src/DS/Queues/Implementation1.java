package DS.Queues;
import DS.Queues.Queues;
/**
 * Implementation1
 */
public class Implementation1 {

    public static void main(String[] args) {
        
        Queues<Integer> myQ = new Queues<Integer>();

        myQ.insert(10);
        myQ.insert(20);
        myQ.insert(30);

        myQ.delete();

        myQ.delete();
        myQ.delete();
        // myQ.delete();
        myQ.insert(100);
        myQ.print();
    }
}