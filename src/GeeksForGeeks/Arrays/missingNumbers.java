package GeeksForGeeks.Arrays;
import java.util.*;
import java.lang.*;
import java.io.*;
class missingNumbers
 {
	public static void main (String[] args)
	 {
	    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        try{
            int T = Integer.parseInt(reader.readLine());
            for(int i=0;i<T;i++){
                int n = Integer.parseInt(reader.readLine());
                int arr[] = new int[n-1];
                String inp[] = reader.readLine().split(" ");
                int sum1 = 0;
                for(int j=1;j<=n;j++){
                    sum1 += j;
                }
                int sum2 = 0;
                for(int j=0;j<arr.length;j++){
                    arr[j] = Integer.parseInt(inp[j]);
                    sum2 +=arr[j];
                }
                System.out.println(sum1-sum2);
            } 
        }
        catch(Exception e){
            
        }
            
	 }
	 }
