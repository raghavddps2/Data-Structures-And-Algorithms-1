package GeeksForGeeks.Stacks;
import java.util.*;
import java.io.*;
/**
 * reverse
 * All we have to do is use stack to maintain the whole string and another stack 
 * for the basic word, that is all that is to be done.
 */
public class reverse {

    public static void main (String[] args)
	 {
	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     try{
            
            int T = Integer.parseInt(reader.readLine());
            for(int j=0;j<T;j++){
                Stack<Character> s1 = new Stack<Character>();
                Stack<Character> s2 = new Stack<Character>();
                s1.push('.');
                String str = reader.readLine();
                for(int i=0;i<str.length();i++){
                    s1.push(str.charAt(i));   
                }
                String str1 = "";
                while(!s1.isEmpty()){
                    if(s1.peek() == '.'){
                        while(!s2.isEmpty()){
                            str1 += s2.pop();
                        }
                        str1 += '.';
                        s1.pop();
                    }
                    else{
                        s2.push(s1.pop());
                    }
                }
                System.out.println(str1.substring(0,str1.length()-1));
            }
         }
         catch(Exception e){

         }
	 }
}