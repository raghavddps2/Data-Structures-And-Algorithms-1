package Lecture14;

/**
 * quickSort
 */
import java.util.*;
public class quickSort {



    public static int partition(int arr[],int low,int high){

        // System.out.println(low+" "+high);
        int pivot = arr[high];
        int j=low;
        int i=low-1;

        while(j<high){
            // System.out.println(arr[j]+" "+pivot+" "+j+" "+high);
            if(arr[j]<=pivot){
                // System.out.println("hi");
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
            j++;
        }
        // System.out.println("pp");
        // System.out.println(i);
        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return (i+1);
    }

    public static void quickSort(int arr[],int low,int high){

        if(low<high){
            int partitionIndex = partition(arr,low,high);
            quickSort(arr,low,partitionIndex-1);
            quickSort(arr, partitionIndex+1, high);
        }

    }
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        // System.out.println("Enter the number of elements in the array:\t");
        int n = sc.nextInt();

        int arr[] = new int[n];
        // System.out.println("Enter the elements of the array:\t");
        for(int i=0;i<arr.length;i++){
            arr[i] = sc.nextInt();
        }
        int low = 0;
        int high = arr.length-1;
        quickSort(arr,low,high);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
        System.out.println();
    }
}