package Lecture13;

/**
 * ArrayList1
 */
import java.util.*;
public class ArrayList1 {

    public static void main(String[] args) {
        
        ArrayList<Integer> a = new ArrayList<Integer>();
        a.add(10);
        a.add(11);
        a.add(12);
        System.out.println(a.capacity());
        System.out.println(a.size());
        a.add(1 ,99);
        System.out.println(a.size());  // This will give 4 instead. 
        for(int i: a){
            System.out.println(i);
        }
        a.remove(0);
        System.out.println(a.size());
    }
}