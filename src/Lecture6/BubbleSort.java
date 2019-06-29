package Lecture6;
public class BubbleSort {	
	//arr is the input array you have to sort
	public static void bubbleSort(int[] arr){
		
        /*
            @Author: Raghav Maheshwari.
            Approach 1:
            In this approach, what we do is at every step we bring the smallest element in the array at the
            start.
        */
        int n = arr.length;
        // for(int i=0;i<n-1;i++){
        //     for(int j=i+1;j<n;j++){
        //         if(arr[i]>arr[j]){
        //             int temp = arr[i];
        //                 arr[i] = arr[j];
        //                 arr[j] = temp;
        //         }
        //     }
        // }
        
        /*
            @Author: Raghav Maheshwari
            Approach 2:
                In this approach, what we do at every step is to push the largest element at the end
                
        */
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1]){
                    int temp = arr[j];
                        arr[j] = arr[j+1];
                        arr[j+1] = temp;
                }
            }
        }
	}
    //In this, what we have to do is just use the usual main function and pass the array
    //to sort it.
}