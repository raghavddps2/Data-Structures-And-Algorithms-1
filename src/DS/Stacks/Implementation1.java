package DS.Stacks;
import DS.Stacks.Stack;
/**
 * Implementation1
 */
public class Implementation1 {

    public static void main(String[] args) {
        
        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.pop();
        s1.pop();
        s1.push(30);
        s1.push(20);
        // s1.pop();
        // int k = s1.peek();
        // System.out.println(k);
        
        s1.print();
    }
}