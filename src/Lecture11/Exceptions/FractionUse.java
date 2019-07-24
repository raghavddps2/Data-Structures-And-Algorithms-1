package Exceptions;

/**
 * FractionUse
 */
public class FractionUse {

    public static void main(String[] args) {
        

        Fraction f1 = new Fraction();
        //f1.setDenominator(12); # ===> You cant just write this, this is an error as the exception is 
        //                            thrown and not handled here.
        //We have to handle the exception here, else it will go on to main..
        f1.setNumerator(6);
        f1.simplify();
        f1.printFraction();

        Fraction f2 = new Fraction();
      //  f2.setDenominator(0); # ==> This is the same case, exception is thrown but not handled.
        f2.setNumerator(13);
        f2.simplify();
        f2.printFraction();
    }
}