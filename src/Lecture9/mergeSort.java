package Lecture9;

/**
 * mergeSort
 */
public class mergeSort {

    public static void Merge(int[] arr1,int[] arr2, int[] arr3) {
        int i=0,j=0,k=0;
        // int[] arr3 = new int[arr1.length + arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                arr3[k] = arr1[i];
                i++;
                k++;
            }
            else{
                arr3[k] = arr2[j];
                j++;
                k++;
            }
        }

        while(i < arr1.length){
            arr3[k] = arr1[i];
            i++;
            k++;
        }
        while(j<arr2.length){
            arr3[k] = arr2[j];
            j++;
            k++;
        }

    }
    public static void MergeSort(int[] arr) {
        
        //Defining the base case. If the array length becomes 1 or 0, just return
        if(arr.length == 1 || arr.length == 0){
            return;
        }
        //Recursive case: Divie it into equal parts and keep on dividing.
        else{
            
            int k = 0;
            int[] arr1 = new int[arr.length/2];
            int[] arr2 = new int[arr.length-arr1.length];
            for(int i=0;i<arr1.length;i++){
                arr1[i] = arr[k];
                k++;
            }
            for(int j=0;j<arr2.length;j++){
                arr2[j] = arr[k];
                k++;
            }
            MergeSort(arr1);
            MergeSort(arr2);
            Merge(arr1,arr2,arr);
            
        }
        
    }
    public static void main(String[] args) {
        
        int arr[] = {6,5,4,3,2,1};
        MergeSort(arr);
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+" ");
        }
    }
}