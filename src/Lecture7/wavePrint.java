package Lecture7;
import java.util.Scanner;

public class wavePrint{

    public static void main(String[] args){


		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        
        for(int i=0;i<n;i++){
        int arr[][] = new int[n][m];
        
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
           }
           n = arr.length;
           m = arr[0].length;
        for(int j=0;j<m;j++){
            if(j%2 == 0){
                for(int i=0;i<n;i++){
                    System.out.print(arr[i][j]+" ");
                }
            }
            else{
                for(int i=n-1;i>=0;i--){
                    System.out.print(arr[i][j]+" ");
                }
            }   
    }

    }
}