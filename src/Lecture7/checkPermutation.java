import java.util.*;
public class solution {

	public static boolean isPermutation(String input1, String input2) {
	    
        String inputArray1[] = input1.split("");
        String inputArray2[] = input2.split("");
        
        Arrays.sort(inputArray1);
        Arrays.sort(inputArray2);
        
        boolean permutation = Arrays.equals(inputArray1,inputArray2);
        if(permutation){
            return true;
        }
        else{
            return false;
        }
        
	}
}
