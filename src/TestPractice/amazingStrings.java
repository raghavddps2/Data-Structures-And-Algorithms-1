package TestPractice;
import java.util.*;
/**
 * amazingStrings
 */
public class amazingStrings {

    public static void answer(String s1,String s2,String s3) {
        
        String str1 = s1+s2;
        char[] arr1 = str1.toCharArray();
        Arrays.sort(arr1);
        String first = new String(arr1);
        
        char[] arr2 = s3.toCharArray();
        Arrays.sort(arr2);
        String second = new String(arr2);

        if(first.length() != second.length()){
            System.out.println("no");
        }
        else{
            if(first.equals(second)){
                System.out.println("yes");
            }
            else{
                System.out.println("no");
            }
        }
    }
    public static void main(String[] args) {
        
        String str1 = "SANTACLAUS";
        String str2 = "DEDMOROZ";
        String str3 = "SANTAMOpROZDEDCLAUS";
        answer(str1,str2,str3);
    }
}