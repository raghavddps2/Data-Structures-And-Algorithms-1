import java.util.Scanner;
public class random {


	public static void main(String[] args) {
		
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int i;
		for(i=1;i<=(n/2+1);i++){
            for(int j=1;j<i;j++){
                System.out.print(" ");
            }
            for(int j=i;j<=2*i-1;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(;i<=n;i++){
            for(int j=1;j<=(n-i);j++){
                System.out.print(" ");
            }
            for(int k=1;k<=(n-i)+1;k++){
                System.out.print("*");
            }
            System.out.println();
        }
		
	}

}
