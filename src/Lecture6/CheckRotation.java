
package Lecture6;
import java.util.Arrays;
public class CheckRotation {	

    public static void rotateClockwise(int[] arr,int d){
        
        //rotating in clockwise direction.
          int n = arr.length;
        
            int temp = arr[n-1];
            for(int j=n-2;j>=0;j--){
                arr[j+1] = arr[j];
            }
            arr[0] =temp;
    }
   
	public static int arrayRotateCheck(int[] arr){
		
            
        // int n = arr.length;
        // int arr2[] = new int[n];
        // //assigning values to the new array.
        // for(int i=0;i<n;i++){
        //     arr2[i] = arr[i];
        // }
        // //sorting the original array.
        // Arrays.sort(arr);
        
        // //starting the loop to check the rotation index(how many times rotation is done.)
        // for(int i=1;i<n;i++){
            
        //     //rotating
        //     rotateClockwise(arr,1);
        //     //comparing here.
        //     boolean cmp = Arrays.equals(arr2,arr);
            
        //     if(cmp){
        //         //if matches,return;
        //         return i;
        //     }
        // }
        // return 0;

        int n = arr.length;
        for(int i=0;i<n-1;i++){
            if(arr[i]>arr[i+1]){
                return (i+1);
            }
        }
        return 0;
        
    }
    
    public static void main(String[] args){
        //Just pass the array here in the function arrayRotateCheck.
    }
}