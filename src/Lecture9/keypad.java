package Lecture9;

/**
 * keypad
 */
public class keypad {

    public static String[] keypadCombinations(String str1,String str2) {


        if(str1.length() == 0){
            String out[] = new String[1];
            out[0] = "";
            return out;
        }

        String append  = str1.substring(0, 1);
        String[] out = keypadCombinations(str1.substring(1),str2);
        String[] ans = new String[out.length+str2.length()];
        for(int i=0;i<out.length;i++){
            ans[i] = out[i];
        }
        int j=0;
        for(int i=out.length;i<out.length+str2.length();i++){
            ans[i] = append + Character.toString(str2.charAt(i-out.length));
        }
        return ans;
    }

    public static void main(String[] args) {
        
        String str1 = "abc";
        String str2 = "def";
        String[] str3 = new String[str1.length()*str2.length()];
        str3 = keypadCombinations(str1,str2);
        for(int i=0;i<str3.length;i++){
            System.out.println(str3[i]);
        }
    }
}