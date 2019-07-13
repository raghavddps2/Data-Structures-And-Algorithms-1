package Rec;
import java.util.ArrayList;

/**
 * returnPer
 */
public class returnPer {

    public static ArrayList<String> permutationsFunc(String str){

        if(str.length() == 0){
            ArrayList<String> arr = new ArrayList<String>();
            arr.add("");
            return arr;
        }

        String val1 = str.substring(0,1);
        String new_str = str.substring(1);
        ArrayList<String> arr = permutationsFunc(new_str);
        ArrayList<String> res = new ArrayList<String>();
        for (String val : arr) { 
            for (int i = 0; i <= val.length(); i++) { 
                res.add(val.substring(0, i) + val1 + val.substring(i)); 
            } 
        } 

        return res;


    }

    public static String[] permutations(String input) {
        
        ArrayList<String> arr = new ArrayList<String>();
        arr = permutationsFunc(input);
        String[] strArray = arr.toArray(new String[arr.size()]);  
        return strArray;

    }
    public static void main(String[] args) {
        
        String str ="abc";
        String strArray[] = permutations(str);
        for(String i: strArray){
            System.out.println(i);
        }

    }
}