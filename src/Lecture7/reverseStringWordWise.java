public class Solution {
	public static String reverseWordWise(String input) {
		
        String[] str = input.split(" ");
        String s2 = "";
        
        for(int i=str.length-1;i>=0;i--){
            s2 += str[i];
            s2 += " ";
        }
        return s2;
        

	}
}
