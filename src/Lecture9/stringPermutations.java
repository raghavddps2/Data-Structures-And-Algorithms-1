package Lecture9;

/**
 * stringPermutations
 */
public class stringPermutations {

    public static String swap(String input,int i,int j){
        
        char arr[] = input.toCharArray();
            char temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            String str = new String(arr);
        return str;
    }
    public static void myPermuteFunc(String input,int i,int j){
        
        if(i == j){
            System.out.println(input);
        }
        else{
            for(int p = i;p<=j;p++){
                String str = swap(input,i,p);
                myPermuteFunc(str,i+1,j);
                str = swap(input,i,p);
            }
        }
    }
    public static void main(String[] args) {
        String str = "abc";
        myPermuteFunc(str,0,str.length()-1);   
    }
}