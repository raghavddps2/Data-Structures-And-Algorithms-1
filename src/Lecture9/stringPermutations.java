package Lecture9;

/**
 * stringPermutations
 */
public class stringPermutations {
    
    static String arr[] = new String[1000];
    public static String[] myPermutFunc(String str,int i,int j) {
        
      return arr;
    }

    public static String[] permutationsOfStrings(String str) {
        
        int i=0;
        int j=0;
        String str2[] = myPermutFunc(str,i,j);
        return str2;
    }
    public static void main(String[] args) {
        
        String str = "";
        String strPermut[] = permutationsOfStrings(str);
        for(int i=0;i<strPermut.length;i++){
            System.out.println(strPermut[i]);
        }
    }
}