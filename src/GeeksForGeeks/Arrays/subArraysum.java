package GeeksForGeeks.Arrays;

/**
 * subArraysum
 */
import java.util.*;
import java.lang.*;
import java.io.*;
public class subArraysum {

    
	public static void main (String[] args)
    {
        try{

            BufferedReader reader = new BufferedReader(new 
            InputStreamReader(System.in));
            
            int T = Integer.parseInt(reader.readLine());
            while(T-- > 0){
                String temp[] = reader.readLine().split(" ");
                int n = Integer.parseInt(temp[0]);
                int s = Integer.parseInt(temp[1]);
                
                int sum = 0;
                String arr[] = reader.readLine().split(" ");
                int arr1[] = new int[n+1];
                int low = 0;
                int high = 0;
                for(int i=0;i<arr.length;i++){
                    arr1[i]  = Integer.parseInt(arr[i]);
                }
                for(int i=0;i<arr1.length;i++){
                    
                    if(sum == s){
                        high = i;
                        // System.out.println(low+","+high);
                        break;
                    }
                    sum += arr1[i];
                    
                    if(sum > s){
                        while(sum>s){
                            // System.out.println(sum+" "+s);
                            if(sum == s){
                                break;
                            }
                            sum = sum-arr1[low];
                            low++;
                        }
                        // System.out.println("new");
                    }
                    
                    high = i;
                }
                
                if(sum != s){
                    System.out.println(-1);
                }
                else{
                    System.out.println((low+1)+" "+(high));
                }
                
            }
                
            }
        catch(Exception e){

        }
    }
}