package Lecture8;
import java.util.Scanner;


public class maxArray{

    public static int maxArray(int arr[],int si){
        int n = arr.length;
        if(si == (n-1)){
            return arr[si];
        }

        int ans = maxArray(arr,si+1);
        return Math.max(arr[si],ans);

    }
    public static void main(String[] args){

        int arr[] = new int[5];
        arr[0] = 10;
        arr[1] = 12;
        arr[2] = 34;
        arr[3] = 56;
        arr[4] = 43;

      int max =   maxArray(arr,1);
      System.out.print("The maximum is "+ max);
    }
}