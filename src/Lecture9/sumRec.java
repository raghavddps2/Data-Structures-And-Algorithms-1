package Lecture9;

/**
 * sumRec
 */
public class sumRec {

    public static void sumRec(int n,int ans) {
        if(n == 0){
            System.out.println(ans);
            return;
        }
        int new_ans = n + ans;
        sumRec(n-1,new_ans);
    }
    public static void main(String[] args) {
        
        sumRec(10,0);
    }
}