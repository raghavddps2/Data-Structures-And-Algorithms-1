package Lecture9;

/**
 * arraySubsets
 */
public class arraySubsets {
    public static void mySubsetFunc(int[] arr,int newArray[]){
        if(arr.length == 0){
            for(int i=0;i<newArray.length;i++){
                System.out.print(newArray[i]+" ");
            }
            System.out.println();
            return;
        }
        int arr2[] = new int[newArray.length];
        int arr1[] = new int[newArray.length+1];
        int i=0;
        for(i=0;i<newArray.length;i++){
            arr1[i] = newArray[i];
            arr2[i] = newArray[i];
        }
        arr1[i] = arr[0];
        int arr3[] = new int[arr.length-1];
        for(int j=1;j<arr.length;j++){
            arr3[j-1] = arr[j];
        }
        mySubsetFunc(arr3,arr1);
        mySubsetFunc(arr3,arr2);
        
        
    }
     // Return a 2D array that contains all the subsets
     public static void printSubsets(int input[]) {
         // Write your code here
         int arr[] = new int[0];
         mySubsetFunc(input,arr);
     }
 
    public static void main(String[] args) {
        
        int arr[] = {1,2,3};
        printSubsets(arr);;
    }
}