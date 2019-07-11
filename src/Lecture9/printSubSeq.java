package Lecture9;

/**
 * printSubSeq
 */
public class printSubSeq {

    public static void subSequences(String input,String ans) {


        if(input.length() == 0){
            System.out.println(ans);
            return;
        }
        
        String ans1 = ans+input.charAt(0);
        String ans2 = ans;
        subSequences(input.substring(1),ans1);
        subSequences(input.substring(1),ans2);
    }
    public static void main(String[] args) {
        
        String a = "abc";
        subSequences(a,"");
    }
}