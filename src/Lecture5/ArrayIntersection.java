import java.util.Arrays;
public class Intersection{
	
	public static void intersection(int[] arr1, int[] arr2){
		
        
        /*
        
            Algorithm:
                1. In the first step sort both the arrays.
                2. After both arrays are sorted, we check and compare elements one by one,
                    If, the element in array 1 is smaller than thta in array two, we just increment the pointer for
                    array1
                3. Same as step 2, we increase the value of j.
                4. AT this step, we compare and if both are equal, we print it and print both i and j.
        */
        
        Arrays.sort(arr1);
        Arrays.sort(arr2);
        int i=0,j=0;
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<arr2[j]){
                i++;
            }
            else if(arr1[i]>arr2[j]){
                j++;
            }
            else{
                System.out.println(arr1[i]);
                i++;
                j++;
            }
        }
	}
}