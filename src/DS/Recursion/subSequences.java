package DS.Recursion;

/**
 * return subSequences
 */
public class subSequences {

    public static String[] subsequences1(String s){


        if(s.length() == 0){
            String str[] = new String[1];
            str[0] = "";
            return str;        }
        String s1 = s.substring(0,1);
        String str1[] = subsequences1(s.substring(1));
        String str2[] = new String[str1.length*2];

        int p=0;
        for(p =0;p<str1.length;p++){
            str2[p] = str1[p];
        }
        for(int i=0;i<str1.length;i++){
            str2[p] = s1 + str1[i];
            p++; 
        }
        return str2;
    }
    public static void main(String[] args) {
        String s = "abc";
        String str[] = subsequences1(s);
        // System.out.println(str.length);
        for(String x: str){
            System.out.println(x);
        }
    }
}