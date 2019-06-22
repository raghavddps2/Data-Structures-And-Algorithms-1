import java.util.Scanner;
public class TempTable {

	public static void printFahrenheitTable(int start, int end, int step) {
		
        
        
        for(int i=start;i<=end;i+=step){
            int C = ((i-32)*5)/9;
            System.out.print(i);
            System.out.print("\t"+C);
            System.out.println();
        }
		
	}
}