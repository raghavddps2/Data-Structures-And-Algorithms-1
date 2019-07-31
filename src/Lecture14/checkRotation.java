import java.util.*;
public class CheckRotation {	

	public static int arrayRotateCheck(int[] arr){
		/* Your class should be named CheckRotation
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        int arr2[] = new int[arr.length];
        for(int i=0;i<arr2.length;i++){
             arr2[i] = arr[i];
        }
        Arrays.sort(arr);
        if(arr2 == arr){
            return 0;
        }
        else{
                int d =1;
                int z = 1;
            while(z<arr.length){   
                int temp[] = new int[d];
                for(int i=0;i<d;i++){
                    temp[i] = arr[i];
                }
                for(int i=d;i<arr.length;i++){
                    arr[i-d] = arr[i];
                }
                for(int i=arr.length-d,k=0;i<arr.length;i++,k++){
                    arr[i] = temp[k];
                }
//                 for(int i=0;i<arr.length;i++){
//                     System.out.print(arr[i]+" ");
//                 }
//                                 System.out.println();

//                 for(int i=0;i<arr.length;i++){
//                     System.out.print(arr2[i]+" ");
//                 }
//                 System.out.println();
                if(Arrays.equals(arr2,arr)){
                    return (arr.length-z);
                }
                z++;
            }
                return 0;
            }
        }
        
	}
