package Lecture8;

/**
 * removeX
 */

 
public class removeX {
    public static String replace(String input,int i){
        if(i == input.length()){
            return "";
        }
        if(input.charAt(i) == 'x'){
            return ("" + replace(input,i+1));
        }
        else{
            return (Character.toString(input.charAt(i)) + replace(input,i+1));
        }
     }
    public static void main(String[] args) {
        String s = "xabx";
       String str =  replace(s,0);
       System.out.println(str);
    }
}