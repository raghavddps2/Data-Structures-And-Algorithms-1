
public class TripletSum{	

	public static void FindTriplet(int[] arr, int num){
		/* Your class should be named PairSum
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Print output and don't return it.
	 	 * Taking input is handled automatically.
		 */
       int n = arr.length;
        for(int i=0;i<n;i++){
            for(int j=i+1;j<n;j++){
               for(int k=j+1;k<n;k++){
                   if(arr[i]+arr[j]+arr[k] == num){
                       int a = Math.min(arr[i],Math.min(arr[j],arr[k]));
                       int b = Math.max(arr[i],Math.max(arr[j],arr[k]));
                       
                       int c = arr[i] + arr[j] + arr[k] - a -b;
                       System.out.println(a+" "+c+" "+b);
                   } 
               } 
            }
        }

	}
}