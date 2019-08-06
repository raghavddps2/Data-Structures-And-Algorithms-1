package DS.Recursion;

/**
 * lastIndex
 */
public class lastIndex {
    static int val = -1;
    public static int lastIndex1(int arr[],int x,int n){

        if(n == arr.length){
            return val;
        }
        if(arr[n] == x){
            val = n;
        }
        return lastIndex1(arr,x,n+1);


    }

    public static int lastIndex0(int arr[],int x){

        int p = lastIndex1(arr,x,0);
        return p;

    }
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,4,5,6};
        int a = lastIndex0(arr,4);
        System.out.println(a);
    }
}