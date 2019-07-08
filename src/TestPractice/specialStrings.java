package TestPractice;

/**
 * specialStrings
 */
public class specialStrings {

    public static String removeConsecutiveDuplicates(String str) {
	
        int i = 0;
        String str1 = "";
        while(i<str.length()-1){
            if(str.charAt(i) != str.charAt(i+1)){
                str1 += str.substring(i,i+1);
                i = i+1;
            }
            else{
                str1 += str.substring(i,i+1);
                i = i+2;
                if(str.charAt(i) == str.charAt(i+1)){
                    i = i+2;
                }
            }
        }
        if(i == str.length()-1 && str.charAt(i) != str.charAt(i-1)){
            str1 += str.substring(i,i+1);
        }
        return str1;

	}
    public static void main(String[] args) {
        
        String str = "abcdefffff";
        String str2 = removeConsecutiveDuplicates(str);
        System.out.println(str2);
    }
}