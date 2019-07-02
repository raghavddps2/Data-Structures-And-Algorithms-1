
public class replaceChar {

	public static String replaceCharacter(String input, char c1, char c2) {
		/* Your class should be named Solution
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
		 * Taking input and printing output is handled automatically.
		 */
        String s2 = "";
        for(int i=0;i<input.length();i++){
            if(input.charAt(i) == c1){
                s2 += c2;
            }
            else{
                s2 += input.charAt(i);
            }
        }
        return s2;
	}
}