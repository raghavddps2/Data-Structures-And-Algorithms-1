package Lecture7;
import java.util.*;
public class pallindrome {

	public static boolean checkPalindrome(String str){
		
        
        /*
        
            Algorithm: In this what we basically do is, we just start comparing from the start and go till,
                        the middle and compare one by one, if any character doesn't match, we return a false, else
                        we retrun true.
        
        */
        for(int i=0;i<str.length()/2;i++){
            if(str.charAt(i) == str.charAt(str.length()-i-1)){
                //just go on xD
            }
            else{
                return false;
            }
        }
        return true;

	}
}
