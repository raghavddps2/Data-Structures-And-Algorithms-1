package Lecture8;

/**
 * pairStar
 */
public class pairStar {

    public static String pairStars(String input,int i){

        if(i == input.length()-1){
            return Character.toString(input.charAt(i));
        }
        if(input.charAt(i) == input.charAt(i+1)){
            return (Character.toString(input.charAt(i)) + "*" + pairStars(input, i+1));
        }
        else{
            return  (Character.toString(input.charAt(i)) + pairStars(input, i+1));
        }
    }
    public static void main(String[] args) {
        
        String s = "abbc";
        String str = pairStars(s,0);
        System.out.println(str);
    }
}