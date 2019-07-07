
package Lecture9;
import java.util.*;
/**
 * keypadCombinations
 */
public class keypadCombinations {
    static String[] combinationArray  = new String[1000];
    public static String[] combinations(ArrayList<?> str) {
           
        
    }
    public static String str(int n){
        switch(n){
            case 1:
                return "";
                
            case 2:
                return "abc";
            case 3:
                return "def";
                
            case 4:
                return "ghi";
                
            case 5:
                return "jkl";
            
            case 6:
                return "mno";
                
            case 7:
                return "pqrs";
                
            case 8:
                return "tuv";
                
            case 9:
                return "wxyz";
                
            default:
                return "";
        }
    }
    public static void main(String[] args) {
        ArrayList<String> digits = new ArrayList<String>(); 
        int n = 238;
        while(n!=0){
            int rem = n%10;
            digits.add(str(rem));
            n = n/10;
        }
        String str[] = new String[1000];
        str = combinations(digits);
        for(int i=0;i<str.length;i++){
            System.out.println(str[i]);
        }
    }
}