import java.util.Scanner;
public class NumberPattern {


	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        
        for(int i=1;i<=n;i++){
            int k = n-i+1;
            for(int j=1;j<=n;j++){
                if(j>=i){
                    System.out.print(n);
                }
                else{
                    System.out.print(k);
                    k++;
                }
            }
            System.out.println();
        }

		
	}

}
