
public class Solution {
    static String ans = "";
    public static String replaceCharFunc(String input,char c1,char c2,int i){
        
        if(i == input.length()){
            return "";
        }
        else{
            String ans = replaceCharFunc(input,c1,c2,i+1);
            if(input.charAt(i) == c1){
                ans += Character.toString(c2);
            }
            else{
                ans += Character.toString(input.charAt(i));
            }
            return ans;
        }
       
    }
	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        String s = replaceCharFunc(input,c1,c2,0);
        StringBuilder str = new StringBuilder(s);
            
        return str.reverse().toString();

	}
}
