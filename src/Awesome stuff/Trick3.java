/*

    This tells us how to multiply a number with other number.
    And stores the result in the array.

*/

import java.util.Scanner;
public class Trick3{

    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int arr[] = new int[100];
        int k =0;
        int rem =0;
        while(n!=0){
            rem = n%10;
            arr[k] = rem;
            n = n/10;
            k++;
        }
        int p = k-1;
        /*
            carry = 0;
            consider we enter 234
            a[2] = 2;
            a[1] = 3;
            a[0] = 4;

            suppose we want to multiply by 5
            a[0] = a[0]*5 + carry//20;
            carry = a[0]/10;
            a[0] = a[0]%10;

            a[p+1] = carry;
        */
        System.out.println("ENter the number you wanna multiply with");
        int num = sc.nextInt();
        int carry = 0;
        for(int j = 0;j<=p;j++){
          arr[j] = arr[j]*num + carry;
          carry = arr[j]/10;
          arr[j] = arr[j]%10;  
        }
        arr[p+1] = carry;
        int m = p+1;
        for(int s = m;s>=0;s--){
            System.out.print(arr[s]);
        }
    }
}