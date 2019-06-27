public class SortBinaryArray{	

	public static void sortBinaryArray(int[] arr){
		/* Your class should be named SortBinaryArray.
		 * Don't write main().
     		 * Don't read input, it is passed as function argument.
     		 * Update in the given array itself. Don't return or print anything.
     		 * Taking input and printing output is handled automatically.
                 */
        int count =0;
        for(int i=0;i<arr.length;i++){
            if(arr[i] == 0){
                count++;
            }
        }
        int counter = 0;
        for(int i=0;i<arr.length;i++){
             if(counter<count){
                 arr[i] = 0;
                 counter++;
             }   
            else{
                arr[i] = 1;
            }
        }

	}
}