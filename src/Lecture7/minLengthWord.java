
public class Solution {
	
	public static String minLengthWord(String input){
		
		String s[] = input.split(" ");
        
        int min = Integer.MAX_VALUE;
        int minStrIndex = 0;
        for(int i=0;i<s.length;i++){
            if(s[i].length() < min){
                min = s[i].length();
                minStrIndex = i;
            }
        }
        return s[minStrIndex];

	}
}
