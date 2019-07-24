package Exceptions;

import Exceptions.ZeroDenominatorException;

/**
 * FractionUse
 */
public class FractionUse1 {

    public static void temp() throws ZeroDenominatorException{

        Fraction f1 = new Fraction();
       
        //The denominator function won't throw an exception here as the 
        f1.setDenominator(12);
        f1.setNumerator(6);
        f1.simplify();
        f1.printFraction();

        Fraction f2 = new Fraction();
        f2.setDenominator(0);
        f2.setNumerator(13);
        f2.simplify();
        f2.printFraction();
    }
    public static void main(String[] args) {
        temp(); //This is the last chance inside the main, it has to handle the exception at least here,
                //else it will be shown to the user.
        //Can't compile it as the exception is not catched here.

    }
}