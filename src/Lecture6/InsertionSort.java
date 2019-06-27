public class InsertionSort {	
    
    	public static void insertionSort(int[] arr){

     /*
        @Algorithm: Insertion sort.
        1. 1st step is to take the ith element.
        2. Compare it with all tthe elements to the left side of that element.
        3. Compare till, we get the correct position as to where the element will be inserted.
        4. Once we find the correct position, next step is to shift the elements to the right,
            So, that correct place is created for the element to be inserted.
        5. Finally, we just have to insert the ith element at the correct intended 
            position. 
    
        Coded an algo ACTUALLY xD, feeling happy!! xD
     */   

        int n = arr.length;
        for(int i=1;i<n;i++){
            int j = i-1;
            int iThElement = arr[i];
            while(j>=0){
                if(arr[i]<arr[j]){
                    j--;
                }
                else{
                    break;
                }
            }
            for(int k=i-1;k>=j+1;k--){
                arr[k+1] = arr[k];
            }
            arr[j+1] = iThElement;
        }
	}
}