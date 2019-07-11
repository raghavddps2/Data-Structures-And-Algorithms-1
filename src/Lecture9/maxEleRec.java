package Lecture9;

/**
 * maxEleRec
 */
public class maxEleRec {

    public static void maxEle(int[] arr,int n,int max) {
        
        if(n == -1){
            System.out.println(max);
            return ;
        }

        int new_max  = (arr[n]>max)?arr[n]:max;
        maxEle(arr,n-1,new_max);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        maxEle(arr,arr.length-1,-1);
    }
}