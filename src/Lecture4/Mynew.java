import java.util.Scanner;
public class Main {
	
	public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        boolean isDecAllowed = true;
        boolean myRes = true;
        int count = 2;
        while(count<n){
            
            if(b<a){
                if(isDecAllowed == true){
                    //Awesome! Just go on and on and on till you survive xD
                }
                else{
                    myRes = false;
                }
            }
            else if(b>a){
               isDecAllowed = false;
            }
            else{
                myRes = false;
            }
            count++;
            a = b;
            b = sc.nextInt();
        }
            
        System.out.println(myRes);
        
    
        
        
    }
}

