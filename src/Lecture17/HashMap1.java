package Lecture17;
import java.util.HashMap;
/**
 * HashMap1
 */
public class HashMap1 {

    public static void main(String[] args) {
        HashMap<String,Integer> count = new HashMap<String,Integer>();
        System.out.println(count.size());
        System.out.println(count);
        count.put("Raghav",20);
        count.put("Rohit",1);
        count.put("Pooja",3);
        System.out.println(count.get("Raghav"));
        count.remove("Pooja");
        System.out.println(count.get("Raghavi"));
        System.out.println(count.get("Pooja"));

        //Incease value by 1.
        count.put("Raghav",count.get("Raghav")+1);
        System.out.println(count.get("Raghav"));
    }
}