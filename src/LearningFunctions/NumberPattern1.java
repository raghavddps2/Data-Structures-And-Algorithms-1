package LearningFunctions;
import java.util.Scanner;
public class NumberPattern1 {
	
	public static void printPattern1(int n) {
		 
        for(int i=1;i<=n;i++){
            for(int j=1;j<=i;j++){
                System.out.print("1");
            }
            System.out.println();
        }
	}

	public static void main(String[] args) {
	
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printPattern1(n);
        sc.close();
	}
	
}
