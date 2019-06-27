
public class PairSum{	

	public static void pairSum(int[] arr, int num){
		/* Your class should be named PairSum
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		 */
        int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
                if(arr[i]+arr[j] == num){
                    if(arr[i]<arr[j]){
                        System.out.println(arr[i]+" "+arr[j]);
                    }
                    else{
                        System.out.println(arr[j]+" "+arr[i]);
                    }
                }
            }
        }

	}
}