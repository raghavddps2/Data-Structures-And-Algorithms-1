package Lecture18;
import java.util.*;
/**
 * uglyNumbersDP
 */
public class uglyNumbersDP {

    public static long uglyNumbersDP(int n){

        long arr[] = new long[n];
        arr[0] = 1;
        long a = 2;
        long b = 3;
        long c = 5;

        int Index2 = 0;
        int Index3 = 0;
        int Index5 = 0;
        for(int i=1;i<n;i++){
            arr[i] = Math.min(a,(Math.min(b,c)));
            if(arr[i] == a){
                Index2 = Index2 + 1;
                a = arr[Index2]*2;
            }
            if(arr[i] == b){
                Index3 = Index3 +1;
                b = arr[Index3]*3;
            }
            if(arr[i] == c){
                Index5 = Index5 +1;
                c = arr[Index5]*5;
            }
        }
        return arr[n-1];
        
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int T = sc.nextInt();
        for(int i=0;i<T;i++){
            int n = sc.nextInt();
            System.out.println(uglyNumbersDP(n));
        }
    }
}