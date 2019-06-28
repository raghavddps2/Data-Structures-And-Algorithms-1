import java.util.Scanner;
public class ArrayRotation {	
    
    
    public static void reverseArray(int[] arr){

        int n = arr.length;
        for(int i=0;i<n/2;i++){
            int temp = arr[i];
                arr[i] = arr[n-i-1];
                arr[n-i-1] = temp;
        }
    }


	public static void rotateApproach1(int[] arr, int d) {
		
        
        /* Approach1 */
//         int n = arr.length;
//         for(int i=0;i<d;i++){
//             int temp = arr[0];
//             for(int j=1;j<n;j++){
//                 arr[j-1] = arr[j];
//             }
//             arr[n-1] = temp;
//         }
        /* Approach 2*/
        // int p = 0;
        // int n = arr.length;
        // int tempArr[] = new int[d];
        // //Store the first d elements into an Array
        // for(int i=0;i<d;i++){
        //     tempArr[i] = arr[i];
        // }
        // int i=0;
        // //Shift elements other than the last d elemnets.
        // for(;i<n-d;i++){
        //     arr[i] = arr[i+d];
        // }
        // //Shift the elements you stored in the arrray to the end.
        // for(;i<n;i++){
        //     arr[i] = tempArr[p];
        //     p++;
        // }
        /*Approach 3 */
        int i=0;
        int n = arr.length;
        reverseArray(arr);
        int arr1[] = new int[n-d];
        for(;i<arr1.length;i++){
            arr1[i] = arr[i];
        }
        reverseArray(arr1);
        
        int k=0;
        int arr2[] = new int[d];
        for(;i<n;i++){
            arr2[k] = arr[i];
            k++;
        }
        reverseArray(arr2);
        int p = 0;
        for(;p<n-d;p++){
            arr[p] = arr1[p];
        }
        int m=0;
        for(;p<n;p++){
            arr[p] = arr2[m];
            m++;
         }
        
        
    }
    public static void main(String[] args){
        /*
            We have 3 methods for the same, 
            1. Just copy the array and so on...one by one.
            2. Copy the remaining d elements in an array and put them back later.
            3. reverse the array and then revese the two parts one by one./


        */
    }
}