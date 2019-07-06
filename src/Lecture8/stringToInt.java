package Lecture8;

/**
 * stringToInt
 */
public class stringToInt {
    static int ans = 0;
    public static int convert(String input,int i,int j){

        if(i == input.length()){
            return 0;
        }
        ans += Math.pow(10,j)*(input.charAt(i)-'0');
        int ans1 = convert(input,i+1,j-1);
        return ans;
    }
    public static void main(String[] args) {
        
        String s = "1234";
       int n =  convert(s,0,s.length()-1);
       System.out.println(n);
    }
}