package Lecture9;

/**
 * arraySumRec
 */
public class arraySumRec {

    public static void arraySumRec(int[] arr,int n,int ans){

        if(n == -1){
            System.out.println(ans);
            return;
        }

        int new_ans =arr[n]+ans;
        arraySumRec(arr,n-1,new_ans);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        arraySumRec(arr,arr.length-1,0);
    }
}