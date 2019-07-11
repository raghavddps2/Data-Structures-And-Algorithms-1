package Lecture9;

/**
 * lastIndexRec
 */
public class lastIndexRec {

    public static void lastIndexRec(int[] arr,int key,int si, int index) {
        
        if(si == arr.length){
            System.out.println(index);
            return;
        }

        if(arr[si] == key){
            index = si;
        }
        lastIndexRec(arr, key, si+1, index);
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,1};
        int key = 1;
        lastIndexRec(arr,key,0,-1);
    }
}