package Lecture9;

/**
 * checkAB
 */
public class checkAB {

          public static boolean checkAB(String input) {
            
            int n = input.length();
            if(input.charAt(0) != 'a'){
                    //System.out.println("Hey3");
                    return false;
            }
            
            else{
                    if(input.length() <= 1 ){
                return true;
            }
            else{
                int i = input.indexOf('a');
                if(i>-1){
                     
                    if(!(input.substring(i+1,i+2).equals("a") || input.substring(i+1,i+3).equals("bb")   || input.substring(i+1).equals(""))){
                       // System.out.println("Hey1");
                        return false;
                    }   
                }
                int j = input.indexOf("bb");
                if(j>-1){ 
                    if(!(input.substring(j+2).equals("") || input.charAt(j+2) == 'a' )){
                        //System.out.println("Hey2");
                        return false;
                    }   
                }
                checkAB(input.substring(1));
                return true;
            }          
            }
            
        }
    
    public static void main(String[] args) {
        
        String str = "abbbabaaa";
        boolean val = checkAB(str);
        System.out.println(val);
    }
}