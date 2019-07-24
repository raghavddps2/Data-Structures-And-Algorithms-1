package Exceptions;
/**
 * Fraction
 */
public class Fraction {

    int numerator;
    int denominator;

    Fraction(){
        System.out.println("Default constructor made!");
    }
    public int gcd(int numerator,int denominator){
        while(numerator != denominator){
            if(numerator>denominator){
                numerator -=denominator;
            }
            else{
                denominator -=numerator;
            }
        }
        return denominator;
    }

    public void setNumerator(int numerator){
        this.numerator = numerator;
    }

    //We have a generic class called as exception.

    // public void setDenominator(int denominator) throws Exception{
    //     if(denominator == 0){
    //         Exception e = new Exception("Denominator can't be zero");
    //         throw e; //This will throw the exceptiion.
    //     }
    //     else{
    //         this.denominator = denominator;
    //     }
    // }
    //Now, instead of a class as general as the exception calass, lets
    //tthrow our own exception, that's called as the zeroDenominatorException.
        //this will make it more clear, ki zeroDenominator exception hai.
        

        //If you are throwing more exceptions, you can specify them separated by a comma.
    public void setDenominator(int denominator) throws ZeroDenominatorException{
            if(denominator == 0){
              //  Exception e1 = new Exception("Denominator can't be zero");
                //No need of message here as the exception name itself tells.
                ZeroDenominatorException e2 = new ZeroDenominatorException();
                throw e2; //This will throw the exceptiion.
            }
            else{
                this.denominator = denominator;
            }
        }
    public void simplify(){
        int gcd1 = gcd(numerator, denominator);
        numerator = numerator/gcd1;
        denominator = denominator/gcd1;
    }

    public void printFraction(){
        if(denominator == 1){
            System.out.println(numerator);
        }
        else{
            System.out.println(numerator+"/"+denominator);
        }
    }
}