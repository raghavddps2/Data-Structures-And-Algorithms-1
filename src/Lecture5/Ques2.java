public class DuplicateInArray{	

	public static int duplicate(int[] arr){  
		/* Your class should be named DuplicateInArray
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		*/
        int res,k =0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i] == 2){
                k =i;
            }
        }
        return k;

	}
}