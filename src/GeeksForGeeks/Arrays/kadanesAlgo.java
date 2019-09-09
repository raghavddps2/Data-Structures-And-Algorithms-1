/*
    Kadane's Algorithm:

    1. We maintain two variables
        -- One is max_ending_here and the other is max_so_far.
        We initialize them with arr1[0] for both.
    2. Second for every iteration, we add the element to the max_ending_here
        -- If that becomes less than zero, we just put max_ending_here as 0.
        -- If the max_ending_here is greater than max_so_far, we replace max_so_far by max_ending_here.
        -- If the max_ending here is only less than the immediate number, we just substitute both max_till_here
            and max_so_far as arr[i];

    The above is the kadanes algorithm.
*/

package GeeksForGeeks.Arrays;
import java.io.*;
class kadanesAlgo
 {
	public static void main (String[] args)
	 {
	    
        BufferedReader reader = new BufferedReader(new 
            InputStreamReader(System.in));
        
    try{
        int T = Integer.parseInt(reader.readLine());
        for(int p=0;p<T;p++){
            int n = Integer.parseInt(reader.readLine());
            String arr[] = reader.readLine().split(" ");
            int arr1[] = new int[arr.length];
            for(int i=0;i<arr.length;i++){
                arr1[i] = Integer.parseInt(arr[i]); 
            }
            int max_so_far = arr1[0];
            int max_ending_here = arr1[0];
            // System.out.println(max_so_far);
            for(int i=1;i<arr1.length;i++){
                max_ending_here = max_ending_here + arr1[i];
                
                if(max_ending_here <0){
                    max_ending_here = 0;
                }
                if(max_ending_here>max_so_far && max_ending_here>0){
                    max_so_far = max_ending_here;
                }
                if(max_ending_here<arr1[i]){
                    max_ending_here = arr1[i];
                    max_so_far = arr1[i];
                }
            }
            System.out.println(max_so_far);
        }
    }
        
    catch(Exception e){
        
    }
	    
	 }
}