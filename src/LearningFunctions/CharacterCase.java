package LearningFunctions;
import java.util.Scanner;
public class CharacterCase {
	
	
	public static int characterIden(char ch) {
		int iden;
		boolean b1,b2;
        b1 = Character.isUpperCase(ch);
        b2 = Character.isLowerCase(ch);
        if(b1){
            iden = 1;
        }    
        else if(b2){
            iden = 0;
        }
        else{
            iden = -1;
        }
        return iden;
	}
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        char ch;
        ch = sc.next().charAt(0);
        int iden = characterIden(ch);
        System.out.println(iden);
        
        sc.close();
	}
}
