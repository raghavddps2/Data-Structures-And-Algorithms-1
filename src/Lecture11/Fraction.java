package Lecture11;

/**
 * Fraction
 */
public class Fraction {

    private int numerator;
    private int denominator;

    Fraction(int numerator,int denominator){
        this.numerator = numerator;
        this.denominator = denominator;
    }
    //This is recursive hcf...
    // public int hcf(int a,int b){
    //     if(a==0){
    //         return b;
    //     }
    //     return hcf(b%a,a);
    // }

    //Here is the iterative hcf.
    public int hcf(int a,int b){
        while(a!=b){
            if(a>b){
                a = a-b;
            }
            else{
                b = b-a;
            }
        }
        return a;
    }
    public int lcm(int a,int b){
        int hcfRes = hcf(a,b);
        int lcmRes = (a*b)/hcfRes;
        return lcmRes;
    }
    public Fraction add(Fraction f1,Fraction f2){
        Fraction f3 = new Fraction(0,0);
        f3.denominator = lcm(f1.denominator,f2.denominator);
        f3.numerator = (f1.numerator*f2.denominator)+(f2.numerator*f1.denominator);
        return f3;
    }

    public void print(){
        System.out.println(this.numerator+"/"+this.denominator);
    }
}