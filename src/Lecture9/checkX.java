package Lecture9;

/**
 * checkX
 */
public class checkX {

    public static void checkX(int arr[],int n,int key,boolean key_ref) {
        if(n == -1){
            String res = (key_ref == true)?"present":"not present";
            System.out.println("Key "+res);
            return;
        }
        boolean new_key_ref = (arr[n] == key)?true:false;
        if(new_key_ref == false){
            checkX(arr,n-1,key,new_key_ref);
        }
        else{
            checkX(arr,-1,key,new_key_ref);
        }
    }
    public static void main(String[] args) {
        
        int arr[] = {1,2,3,4,5};
        int key = 30;
        checkX(arr,arr.length-1,key,false);
    }
}