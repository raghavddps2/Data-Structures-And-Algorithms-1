import java.util.Arrays;
// highest occurring character in the String.
public class solution {

	public static char highestOccuringCharacter(String inputString) {
		// //Write your code here
		String s2[] = inputString.split("");
		    Arrays.sort(s2);
		    int n = 123; 
		    int arr[] = new int[n];
		    for(int i=0;i<inputString.length();i++){
		        arr[inputString.charAt(i)] ++;
		    }
		    int max = Integer.MIN_VALUE;
		    int val = 0;
		    for(int i=0;i<arr.length;i++){
		        if(arr[i]>max){
		                val = i;
		                max = arr[i];
		        }
		    }
		return (char)val;
        
        This doesn't handle the case when the frequency of two characters is same. So, a wrong approach 
        
        
        
	}
}
