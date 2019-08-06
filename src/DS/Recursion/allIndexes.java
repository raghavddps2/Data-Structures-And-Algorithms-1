package DS.Recursion;

/**
 * allIndexes
 */
public class allIndexes {


    
    public static int[] allIndexes1(int[] arr,int x,int n){
        
        if(arr.length == n){
            return (new int[0]);
        }
        int arr2[] =  allIndexes1(arr, x, n+1);
        if(arr[n] == x){
            int arr1[] = new int[arr2.length+1];
            for(int i=0;i<arr2.length;i++){
                arr1[i] = arr2[i];
            }
            arr1[arr1.length-1] = n;
            return arr1;
        }
        return arr2;
    }

    public static int[] allIndexes0(int[] arr,int x){
        int arr1[] = allIndexes1(arr,x,0);
        return arr1;
    }
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,4,5,6};
        int a[] = allIndexes0(arr,4);
        // System.out.println(a);
        for(int x: a){
            System.out.print(x+" ");
        }
    }
}