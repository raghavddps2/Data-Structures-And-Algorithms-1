package Lecture8;
import java.util.*;
public class StringPallinrec {
    
    public static String checker(String input){
        
        if(input.length() == 0){
            return "";
        }
        String pallinCheck = isStringPallindrome(input.substring(0,input.length()-1));
            return (pallinCheck + input.charAt(input.length()-1));
    }
	public static boolean isStringPalindrome(String input) {
		
        String s = checker(input);
        if(s.equals(input)){
            return true;
        }
        return false;
	}
}
