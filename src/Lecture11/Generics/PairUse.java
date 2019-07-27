package Lecture11.Generics;

/**
 * PairUse
 */
public class PairUse {

    public static void main(String[] args) {
        
        Pair<Pair<Integer>> p1 = new Pair<Pair<Integer>>();
        //The above creates something of the following type.
        // ------------------------          ---------------------
        // |                       |        | Data1    |  Data2   |
        // |          Pair         |    ==>  ---------------------
        // |------------------------         ----------------------
        // |            Pair       |        | Data1     |  Data2   |
        // |                       |         ----------------------
        // -------------------------
        //p1.Pair.data1 = 10;
        //p1.Pair.data2 = 11;
       // System.out.println(p1.Pair);
      //  System.out.println(p2.Pair);
        System.out.println(p1.data1.data1);
        System.out.println(p1.data1.data2);
        System.out.println(p1.data2.data1);
        System.out.println(p1.data2.data2);

    }
}