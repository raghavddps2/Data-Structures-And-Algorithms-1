package Lecture6;
public class AdditionArray{

    public static void main(String[] args){

        int arr1[] = new int[3];
        int arr2[] = new int[3];

        arr1[0] = 1;
        arr1[1] = 2;
        arr1[2] = 3;

        arr2[0] = 1;
        arr2[1] = 2;
        arr2[2] = 3;

        int i=0;
        int j=0;
        int k=0;
        int carry = 0;
        int arr3[] = new int[4];
        while(i<arr1.length && j<arr2.length){
            arr3[k] = arr1[i]+arr2[j]+carry;
            carry = arr3[k]/10;
            arr3[k] = arr3[k]%10;
            i++;
            j++;
            k++;
        }
        arr3[k] = carry;
        for(int p=arr3.length-1;p>=0;p--){
            System.out.print(arr3[p]);
        }


    }
}