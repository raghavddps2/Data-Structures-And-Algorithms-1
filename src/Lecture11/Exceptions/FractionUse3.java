package Exceptions;

import Exceptions.ZeroDenominatorException;

/**
 * FractionUse
 */
public class FractionUse3 {

    public static void temp(){

        Fraction f1 = new Fraction();
       
        //The denominator function won't throw an exception here as the 
        try{
            f1.setDenominator(12);
            f1.setNumerator(6);
            f1.simplify();
            f1.printFraction();
        }
        catch(ZeroDenominatorException e){
            System.out.println("Exception thrown, Zero denominator: "+e);
        }

        Fraction f2 = new Fraction();
        try{
            f2.setDenominator(0); //After this directly goes to catch, no other line is executed.
            f2.setNumerator(13);
            f2.simplify();
            f2.printFraction();
        }

        //Here it catches the proper exception and as it is caught properly,
        //the next fraction, i.e. f3 is calculated.
        catch(ZeroDenominatorException e){
            System.out.println("Exception thrown, Zero denominator: "+e);
        }
        //This is executed for sure!
        finally{
            System.out.println("Finally block is executed. We use it to close the resources we have left open as after that we are exitting the program and might not be able to change it later");
        }

        //We now have something called as finally, that executes, doesn't matter,
        //it is try or catch, this is beacuse if we have something as a file, we need to close,
        //it, whatever might the error be. So, file.close() kind of statements are written inside
        //finally.
        Fraction f3 = new Fraction();
        try{
            f3.setDenominator(51);
            f3.setNumerator(17);
            f3.simplify();
            f3.printFraction();
        }
        catch(ZeroDenominatorException e){
            System.out.println("Exception thrown,Zero denominator: "+e);
        }
    }
    public static void main(String[] args){
        //We already catched it in the temp() fumction, exception catched.
        temp(); 


        //In short, one thing is to be remembered, either catch the exception,
        //the and there itself or throw an exception in the functions signature using the throws 
        //keyword.

        
    }
}