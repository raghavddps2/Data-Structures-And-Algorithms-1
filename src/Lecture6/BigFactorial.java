import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.regex.*;

public class BigFactorial {

    // Complete the extraLongFactorials function below.
    static void extraLongFactorials(int n) {
        //We have the BigIntger class in java.
        BigInteger fact = new BigInteger("1"); 
        //What this basically does is creates a bigint 
        //and iniitializes it with 1.
        for(int i=1;i<=n;i++){
            fact = fact.multiply(BigInteger.valueOf(i));
            //This basically uses the multiply function
            //and takes the bigInt to be multiplied as the argument.

        }
        System.out.println(fact);
    }

    private static final Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.skip("(\r\n|[\n\r\u2028\u2029\u0085])?");

        extraLongFactorials(n);

        scanner.close();
    }
}
