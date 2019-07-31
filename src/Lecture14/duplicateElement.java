package Lecture14;

/**
 * duplicateElement
 */
public class duplicateElement {

    public static int duplicateElement(int input[]){

        int sumE = 0;
        for(int i=0;i<input.length;i++){
            sumE += input[i];
        }
        int n = input.length;
        int sumA = (n-2)*(n-1)/2;
        return  (sumE-sumA);
    }
}