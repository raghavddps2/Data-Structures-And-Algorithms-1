package Lecture9;

/**
 * binarySearchRec
 */
public class binarySearchRec {

    public static int binarySearch(int arr[],int key,int low,int high){

        if(low<=high){

            int mid = low + (high-low)/2;
            if(arr[mid] == key){
                return mid;
            }
            if(arr[mid]>key){
                return binarySearch(arr, key, low, mid-1);
            }
            return binarySearch(arr, key, mid+1, high);
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int key = 2;
        int pos = binarySearch(arr,key,0,arr.length);
        if(pos != -1){
            System.out.println("Element found at index: "+pos);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}