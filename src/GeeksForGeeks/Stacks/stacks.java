package GeeksForGeeks.Stacks;
import java.util.Stack;;
/**
 * stacks
 */
public class stacks {

    public static void main(String[] args) {
        
        /**
         * 1. Push
         * 2. Pop
         * 3. peek
         */

        Stack<Integer> s1 = new Stack<Integer>();
        s1.push(10);
        s1.push(20);
        s1.push(30);
        s1.push(40);
        System.out.println(s1.peek());
        int a = s1.pop();
        for(int x: s1){
            System.out.println(x);
        }

    }
}