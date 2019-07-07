package Lecture9;

/**
 * printSubSequences
 */
public class printSubSequences {
    static int i =1;
    public static void printSubSequences(String input,int start,int end){
        
        if(start == end){
            // if(i == 1){
            //     System.out.println(" ");
            //     i += 1;
            // }
            return;
        }
        else{
            System.out.println(input.substring(start,end));
            printSubSequences(input,start+1,end);
            printSubSequences(input,start,end-1);   
        }
    }
	public static void printSubsequences(String input) {
		printSubSequences(input,0,input.length());
	}
    public static void main(String[] args) {
        
        String str = "abc";
        printSubsequences(str);
    }
}