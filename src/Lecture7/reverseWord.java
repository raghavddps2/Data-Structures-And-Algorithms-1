public class Solution {

    
    public static String revWord(String str){
        String s2 = "";
        for(int i=str.length()-1;i>=0;i--){
            s2 += str.charAt(i);
        }
        return s2;
    }
	// Return the reversed string. No need to print
	public static String reverseEachWord(String input) {
		// Write your code here
        String str[] = input.split(" ");
        String s2 = "";
        
        for(int i=0;i<str.length;i++){
            s2 += revWord(str[i]);
            s2 += " ";
        }
         return s2;   
	}    
}
