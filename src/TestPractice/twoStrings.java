package TestPractice;

/**
 * twoStrings
 */
public class twoStrings {

    public static void twoSubstrings(String s,int i) {
        
        boolean flag1 = false;
        boolean flag2 = false;
        while(i<s.length()-1){
            if(s.substring(i,i+2).equals("AB")){
                i = i+2;
                flag1 = true;
            }
            if((i < s.length()-1) && s.substring(i,i+2).equals("BA")){
                i = i+2;
                flag2 = true;
            }
            else{
                i = i+1;
            }
        }

        if(flag1 && flag2){
            System.out.println("yes");
        }
        else{
            System.out.println("no");
        }

    }
    public static void main(String[] args) {
        
        String s = "AXBYBXA";
        twoSubstrings(s,0);
    }
}