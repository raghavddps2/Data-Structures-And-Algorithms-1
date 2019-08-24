package Lecture18;

/**
 * staircaseDp
 */
public class staircaseDp {

    public static long staircase(int n){
        long output[] = new long[n+1];
        output[0] = 1;
        output[1] = 1;
        output[2] = 2;
        for(int i=3;i<=n;i++){
            output[i] = output[i-1] + output[i-2] + output[i-3];
        }
        return output[n];
    }
    public static void main(String[] args) {
        int n = 4;
        System.out.println(staircase(n));
    }
}