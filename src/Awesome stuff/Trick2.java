import java.util.Scanner;
import java.math.*;
public class Trick2{

    public static void main(String[] args){

        //Suppose, we want to calculate the factorial of vary large integers, 
        //Long and int won't work, so we have to use something called as BigInteger class.
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        BigInteger fact = new BigInteger("1");
        //This basicallly creates a Bigint named fact and initializes it with 1.

        for(int i=1;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i)); 
            //We just use the multiiply functiion to multiply.
            //We have the valueof function to get the value.
            
        }   
        System.out.println(fact);
    }
}