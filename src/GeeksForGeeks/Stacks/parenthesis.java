package GeeksForGeeks.Stacks;
import java.util.*;
import java.io.*;

/**
 * 
 * 
 * The entire concept was super simple. ALl we had to do is to put the opening 
 * into the stack and then compare with the input if it matches the top of the stack.
 * 
 * If that doesn't we simply, go for not balanced, else we say that the string is balanaced.
 */

class parenthesis
 {
	public static void main (String[] args)
	 {
	     BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
	     
	     try{
	           int T = Integer.parseInt(reader.readLine());
	           
	           for(int j=0;j<T;j++){
	            String str = reader.readLine();
                Stack<Character> st = new Stack<Character>();
                int flag = 0;
	                for(int i=0;i<str.length();i++){
	                    if(str.charAt(i) == '(' || str.charAt(i)  == '{' ||
	                    str.charAt(i)  == '['){
                            st.push(str.charAt(i));
                        }
	                    else{
                            // System.out.println(str.charAt(i));
	                        if(str.charAt(i) == ')'){
                                if(st.isEmpty()){
                                    System.out.println("not balanced");
                                    flag = 1;
                                    break;
                                }
                                else if(st.peek() == '('){
                                    // System.out.println(st.peek());
	                                st.pop();
                                }
                                else{
                                    System.out.println("not balanaced");
                                    flag = 1;
                                    break;
                                }
	                        }
	                        
	                        else if(str.charAt(i) == '}'){
                                // System.out.println(st.peek());
                                if(st.isEmpty()){
                                    System.out.println("not balanced");
                                    flag = 1;
                                    break;
                                }
	                            else if(st.peek() == '{'){
                                    // System.out.println(st.peek());
                                    st.pop();
                                }   
                                else{
	                                System.out.println("not balanced");
                                    flag = 1;
                                    break;
                                }
                                // System.out.println("pi");
	                        }
	                        else if(str.charAt(i) == ']'){
                                if(st.isEmpty()){
                                    System.out.println("not balanced");
                                    flag = 1;
                                    break;
                                }
	                            else if(st.peek() == '['){
                                    // System.out.println(st.peek());
                                    st.pop();
                                }   
                                else{
                                    // System.out.println(str.charAt(i));
	                                System.out.println("not balanced");
                                    flag = 1;
                                    break;
                                }
	                        }
	                    }
	                    
	                }
	                if(st.isEmpty() && (flag == 0)){
	                    System.out.println("Balanced");
                    }
                    else if(!st.isEmpty() && (flag == 0)){
                        System.out.println("not balanced");
                    }
	           }
	     }
	     catch(Exception e){
	         
	     }
	     
	     
     }
     
}