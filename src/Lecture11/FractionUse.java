package Lecture11;

/**
 * FractionUse
 */
public class FractionUse {

    public static void main(String[] args) {
        
        Fraction f1 = new Fraction(4,5);
        Fraction f2 = new Fraction(2,3);

        Fraction f3  = new Fraction(0,0);
        f3 = f1.add(f1,f2);
      //f3 = f3.add(f1,f2);  
        f3.print();

    }
}