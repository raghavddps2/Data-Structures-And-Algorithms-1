import java.util.Scanner;
public class Trick1{
    public static void main(String[] args){

        /*

        1.Suppose we have three numbers a,b,c. We have to arrange these numbers
         in an order.
        2. So, best approach will be to find the maximum and then the minimum
         and then the middle of then,
        3. We will then add all the three and subtract the maximum and minimum.

        */

        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int max = Math.max(a,Math.max(b,c));
        int min = Math.min(a,Math.min(b,c));
        int mid = a+b+c-max-min;

        System.out.print(max);
        System.out.print(mid);
        System.out.print(min);

    }
}