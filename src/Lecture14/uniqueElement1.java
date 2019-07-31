package Lecture14;

/**
 * uniqueElement1
 */
public class uniqueElement1 {

    //This is probably the most simplified approach.
    /**
     * If two numbers are same, there XOR comes out to be the same.
     * So, we will get the unique element only if we xor all the elements.
     */

	public static int unique(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
        */
        int xorr = 0;
        for(int i=0;i<arr.length;i++){
            xorr = xorr^arr[i];
        }
        return xorr;
	}
     
}