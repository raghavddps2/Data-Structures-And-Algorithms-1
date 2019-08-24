package Lecture18;

/**
 * staircaseDp
 */
public class staircasememo {

    


    public static long findWays_helper(int n,long output[]){
        if(n == 0 || n == 1){
            return 1;
        }
        if(n == 2){
            return 2;
        }
        
        if(output[n] != 0){
            return output[n];
        }
        long x = findWays_helper(n-1,output);
        long y = findWays_helper(n-2,output);
        long z = findWays_helper(n-3,output);
        long ans = x+y+z;
        output[n] =  ans;
        return ans;
    }
    
	public static long findWays(int n){
		
        long output[] = new long[n+1];
        long start = System.currentTimeMillis(); 
        long x = findWays_helper(n,output);
        long end = System.currentTimeMillis(); 
        System.out.println(end-start+"ms");
        return x;
	}
    public static void main(String[] args) {
        int n = 50;
        System.out.println(findWays(n));
    }

}