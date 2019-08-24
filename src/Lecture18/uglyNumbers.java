package Lecture18;

/**
 * uglyNumbers
 */
public class uglyNumbers {

    public static int maxDivide(int a,int b){

        while(a%b == 0){
            a = a/b;
        }
        return a;
    }

    public static boolean isUgly(int n){

        n = maxDivide(n,2);
        n = maxDivide(n,3);
        n = maxDivide(n,5);

        return (n == 1)? true : false;
    }

    public static int uglyNumber(int n){
        int i = 2;
        int p = 2;
        while(p <= n){
            boolean check = isUgly(i);
            if(check){
                p++;
            }
            i++;
        }
        return i-1;
    }
    public static void main(String[] args) {
        int n = 10;
        System.out.println(uglyNumber(n));
    }
}