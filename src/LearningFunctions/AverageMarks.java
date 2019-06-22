package LearningFunctions;
import java.util.Scanner;
public class AverageMarks {

	public static int average(int marks1,int marks2,int marks3) {
		int average = (marks1+marks2+marks3)/3;
		return average;
	}
	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);        
        
		char a = sc.next().charAt(0);
        int marks1 = sc.nextInt();
        int marks2 = sc.nextInt();
        int marks3 = sc.nextInt();
        
        int average = average(marks1,marks2,marks3);
        System.out.println(a);
        System.out.println(average);
		sc.close();
	}

}
