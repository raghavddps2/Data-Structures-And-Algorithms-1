import java.util.Scanner;
public class ReverseArray{

    public static void reverseArray(int[] arr){

        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
        }
    }

    public static void main(String[] args){

        int arr[] = new int[5];
        arr[0] = 5;
        arr[1] = 4;
        arr[2] = 3;
        arr[3] = 2;
        arr[4] = 1;
        reverseArray(arr);
        int n = arr.length;
        for(int i=0;i<n;i++){
            System.out.print(arr[i]+" ");
        }
    }
}