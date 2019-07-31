package Lecture14;

/**
 * uniqueElement
 */
import java.util.*;
public class uniqueElement {
    public static int findUnique(int[] arr){
		/* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        Arrays.sort(arr);
        for(int i=0;i<arr.length;i+=2){
            if(i == arr.length-1){
                return arr[i];
            }
            if(arr[i] != arr[i+1]){
                return arr[i];
            }
        }
        return -1;
	}
}