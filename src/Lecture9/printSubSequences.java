package Lecture9;
import java.util.*;
/**
 * printSubSequences
 */
public class printSubSequences {

    public static String[] subSequence(String input){

        if(input.length() == 0){
            String out[] = new String[1];
            out[0] = "";
            return out;
        }

        String append  = input.substring(0, 1);
        String[] out = subSequence(input.substring(1));
        String[] ans = new String[out.length*2];
        for(int i=0;i<out.length;i++){
            ans[i] = out[i];
        }
        for(int i=out.length;i<ans.length;i++){
            ans[i] = append + ans[i-out.length];
        }
        return ans;
    }
    public static void main(String[] args) {
        
        String str = "abc";
        String subSeq[] = new String[(int)Math.pow(2,str.length())];
        subSeq = subSequence(str);
        for(int i=0;i<subSeq.length;i++){
            System.out.println(subSeq[i]);
        }
    }
}