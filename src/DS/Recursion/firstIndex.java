package DS.Recursion;

/**
 * firstIndex
 */
public class firstIndex {

    public static int firstIndex1(int arr[],int x,int n){
        if(n == arr.length){
            return -1;
        }
        if(arr[n] == x){
            return n;
        }
        return firstIndex1(arr,x,n+1);
    }

    public static int firstIndex0(int arr[],int x){

        int p = firstIndex1(arr,x,0);
        return p;

    }
    public static void main(String[] args) {
        

        int arr[] = {1,2,3,4,4,5,6};
        int a = firstIndex0(arr,4);
        System.out.println(a);
    }
}