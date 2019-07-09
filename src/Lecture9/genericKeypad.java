package Lecture9;
import java.util.*;
import java.lang.*;
/**
 * genericKeypad
 */
public class genericKeypad {
   
	
    public static String helper(int i){
        String arr[] = {"abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        return arr[i-2];
    }
    
    public static String[] keypadCombinations(String str1,String str2) {


        if(str1.length() == 0){
            String out[] = new String[0];
            return out;
        }

        String append  = str1.substring(0, 1);
        String[] out = keypadCombinations(str1.substring(1),str2);
        String[] ans = new String[out.length+str2.length()];
        for(int i=0;i<out.length;i++){
            ans[i] = out[i];
        }
        for(int i=out.length;i<out.length+str2.length();i++){
            ans[i] = append + Character.toString(str2.charAt(i-out.length));
        }
        return ans;
    }
    
    public static String[] keypad(int n){
        
        int arr[] = new int[7];
        int count = 0;
        int i = 0;
        while(n!=0){
            int rem  = n%10;
            arr[i] = rem;
            n = n/10;
            count++;
            i++;
        }
        //System.out.println(count); 
        if  (count == 1){
            String str2[] = new String[helper(arr[0]).length()];
            for(int m=0;m<helper(arr[0]).length();m++){
                str2[m] = helper(arr[0]).substring(m,m+1);
            }
            return str2;
        }
        String[] str = keypadCombinations(helper(arr[1]),helper(arr[0]));
        int len = 1;
        for(int x=2;x<count;x++){
            len *= helper(arr[x]).length();
        }
        //System.out.println(len);
        String[] str2 = new String[str.length*len];
        //System.out.println(str.length*len);
        int k=0;
        int ref = str.length;
        for(int ik=2;ik<count;ik++){
            // System.out.println(ik);
            k = 0;
            for(int p=0;p<helper(arr[ik]).length();p++){
                for(int j=0;j<ref;j++){
                    str2[k] = helper(arr[ik]).substring(p,p+1) + str[j];
                    k++;
                }
            }
            //public static void arraycopy(Object src, int srcPos, Object dest, 
            //int destPos, int length)
            str = new String[k];
            System.arraycopy(str2,0,str,0,k);
            //  for(int t=0;t<k;t++){
            //      System.out.println(str[t]);
            //  }
             ref = str.length;
            // System.out.println(ref);
        }
        return str2;
        
    }
    
    

    public static void main(String[] args) {
        
        int n = 786;
        String[] str = keypad(n);
        // for(int i=0;i<str.length;i++){
        //     System.out.println(str[i]);
        // }
        
    }
}
