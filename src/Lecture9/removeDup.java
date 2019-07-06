package Lecture9;

/**
 * removeDup
 */
public class removeDup {

    public static String  removeFunc(String str,int i) {
        
        if(i == str.length()-1){
            return Character.toString(str.charAt(i));
        }
        else if(i == str.length()){
            return "";
        }
        else{
            while(i<str.length()-1 && str.charAt(i) == str.charAt(i+1) ){
                i++;    
            }
                return str.charAt(i)+removeFunc(str,i+1);
        }
    }
    public static void main(String[] args) {
        
        String str = "aabccbaaa";
        String myStr = removeFunc(str,0);
        System.out.println(myStr);
    }
}