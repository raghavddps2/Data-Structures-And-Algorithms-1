import java.util.*;
public class BinarySearch{
    public static int binarySearch(int[] arr, int num){
        
        int start =0;
        int end = arr.length-1;
        int mid =0;
        while(start<=end){
            mid = (start+end)/2;
            if(arr[mid] == num){
                return mid;
            }
            else if(arr[mid]>num){
               end = mid-1;
            }
            else{
                start = mid+1;
            }
        }
        return -1;
	}
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the size of the array");
        int n = sc.nextInt();
        System.out.println("Enter the array elements");
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        System.out.println("Enter the element you want to search");
        int key = sc.nextInt();
        int index = binarySearch(arr,key);
        System.out.println("Element found at index: "+index);
    }
}