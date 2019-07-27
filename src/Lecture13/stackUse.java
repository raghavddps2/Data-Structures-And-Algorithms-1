package Lecture13;

/**
 * stackUse
 */
public class stackUse {

    public static void main(String[] args) {
        

        stack s1 = new stack(10);
        stack s2 = new stack(5);

        s1.push(10);
        s1.push(20);
        s1.push(30);
        int k = s1.pop();
        s1.print();
    }
}