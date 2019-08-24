package Lecture18;
public class staircaseNormal {

	public static int findWays(int n){
		
        if(n == 0 || n == 1){
            return 1;
        }
        else if(n == 2){
            return 2;
        }
        else{
            return findWays(n-1)+findWays(n-2)+findWays(n-3);
        }
        
    }
    public static void main(String[] args) {
        int n = 50;
        long start = System.currentTimeMillis(); 
        int x = findWays(n);
        long end = System.currentTimeMillis();
        System.out.println(end-start+"ms"); 
        System.out.println(x);
    }
}
