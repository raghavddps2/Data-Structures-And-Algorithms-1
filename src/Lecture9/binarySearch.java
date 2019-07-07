package Lecture9;

/**
 * binarySearch
 */
public class binarySearch {

    public static int binarySearch(int arr[],int key) {
        
        int low = 0;
        int high = arr.length-1;

        while(low<high){
            int mid = (low+high)/2;
            if(arr[mid] == key){
                return mid;
            }
            else if(arr[mid]>key){
                high = mid-1;
            }
            else{
                low = low+1;
            }
        }
        return -1;
    }
    public static void main(String[] args) {
        
        int arr[] =  {1,2,3,4,5};
        int key = 7;
        int pos = binarySearch(arr,key);
        if(pos != -1){
            System.out.println("Element found at index: "+pos);
        }
        else{
            System.out.println("Element not found!");
        }
    }
}