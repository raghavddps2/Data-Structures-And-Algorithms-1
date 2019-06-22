package LearningFunctions;
import java.util.Scanner;
public class TotalSalary {

	public static int salaryCalc(char grade,int basic) {
		int allow;
        if(grade == 'A'){
            allow = 1700;
        }
        else if(grade == 'B'){
            allow = 1500;
        }
        else{
            allow = 1300;
        }
        double salary = basic + 0.2*basic + .5*basic + allow - .11*basic;
        int sal = (int)Math.round(salary);
        return sal;
	}
	
public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int basic = sc.nextInt();
        char grade = sc.next().charAt(0);
        
        int salary = salaryCalc(grade,basic);
        System.out.println(salary);
        sc.close();
        

	}
}
