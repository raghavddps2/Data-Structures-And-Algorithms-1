public class CheckRotation1 {	

	public static int arrayRotateCheck(int[] arr){
		/* Your class should be named CheckRotation
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */

         //Super cool, just check as to if the element is greater than the next element and return accordingly.
        for(int i=0;i<arr.length-1;i++){
            if(arr[i]>arr[i+1]){
                return (i+1);
            }
        }
        return 0;

	}
}