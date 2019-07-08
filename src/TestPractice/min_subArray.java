import java.util.*;

public class solution {

	public static ArrayList<Integer> smallestSubarray(int sum, ArrayList<Integer> input) {
		// Write your code here
        
		ArrayList<Integer> arr = new ArrayList<Integer>();
        Collections.sort(input,Collections.reverseOrder());
        
        int ans = 0;
        for(int i=0;i<input.size();i++){
            if(ans<sum){
                //System.out.print(ans);
                arr.add(input.get(i));
                ans += input.get(i);
            }
            if(ans == sum){
                break;
            }
        }
        Collections.sort(arr);
        return arr;
	}
}
