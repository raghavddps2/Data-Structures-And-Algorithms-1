package GeeksForGeeks.Queues;
import java.util.*;
class strings {
    
    public static void reverse(String str){
       
       Stack<Character> st = new Stack<Character>();
       for(int i=0;i<str.length();i++){
           st.push(str.charAt(i));
       }
       String str1 = new String();
       while(!st.isEmpty()){
            str1 += Character.toString(st.pop());
       } 
       System.out.println(str1);
    }

    public static void main(String[] args) {
        reverse("Raghav");
    }
}