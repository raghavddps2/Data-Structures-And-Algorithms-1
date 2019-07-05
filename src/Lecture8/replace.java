package Lecture8;
/**
 * replace
 */

public class replace {
    static String str = "";
    
    public static String myReplace(String input,int i){
        //System.out.println(input.substring(i,i+2));
        if(i >= input.length()-1){
            if(i == input.length()){
                return " ";
            }
            else{
                return (Character.toString(input.charAt(i)));
            }
                       
        }
        else{
            String sTemp = Character.toString(input.charAt(i)) + Character.toString(input.charAt(i+1));
            if(sTemp.equals("pi")){
                System.out.println("hi!");
               return ("3.14" + myReplace(input,i+2));
            }
            else{
               return  (Character.toString(input.charAt(i))+myReplace(input,i+1));
            }    
        }
        
        
    }
    public static void main(String[] args) {
        
        String s = "xpix";
        String str = myReplace(s,0);
        System.out.println(str);
    }
}