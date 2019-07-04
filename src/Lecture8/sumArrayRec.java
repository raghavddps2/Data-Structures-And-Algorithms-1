package Lecture8;
//import java.util.Scanner;

public class sumArrayRec{

    public static int sum(int arr[],int si){
        int n = arr.length;
        if(si == n){
            return 0;
        }
        int ans = sum(arr,si+1);
        return (ans+arr[si]);
    }
    public static void main(String[] args){

        int arr[] = new int[5];
        arr[0] = 1;
        arr[1] = 2;
        arr[2] = 3;
        arr[3] = 4;
        arr[4] = 5;
        int sumArray = sum(arr,0);
        System.out.println(sumArray);
    }
}