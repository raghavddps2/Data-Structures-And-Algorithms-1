package DS.Recursion;

/**
 * removeConsecutiveDuplicates
 */
public class removeConsecutiveDuplicates {

    public static String remove(String s){
        if(s.length() == 1){
            return s.substring(0);
        }
        String c= "";
        if(s.charAt(0) != s.charAt(1)){
            c = s.substring(0,1);
        }
        String str = remove(s.substring(1));
        return c+str;
    }

 public static void main(String[] args) {
     

    String s = "aabbccd";
    System.out.println(remove(s));
 }   
}