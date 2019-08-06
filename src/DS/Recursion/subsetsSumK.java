package DS.Recursion;

/**
 * subsetsSumK
 */
public class subsetsSumK {


    public static int[][] subsetsSumK1(int input[],int k,int si){
        

        if(input.length == si){
            if(k == 0){
                return (new int[1][10]);
            }
            else{
                return (new int[0][10]);
            }
        }
        
        int val = input[si];
        int temp1[][] = subsetsSumK1(input,k-input[si],si+1);
        int temp2[][] = subsetsSumK1(input,k,si+1);
        
        int out[][] = new int[temp1.length+temp2.length][];
       
        for(int i=0;i<temp2.length;i++){
            out[i] = temp2[i];
        }
        for(int i=0;i<temp1.length;i++){
            int j=0;
            out[i][j] = val;
            for(j=1;j<temp1[i].length;j++){
                out[i][j] = temp1[i][j];
            }
            
        }
        return out;
    }
	// Return a 2D array that contains all the subsets which sum to k
	public static int[][] subsetsSumK0(int input[], int k) {
		// Write your code here
        
        int res[][] = subsetsSumK1(input,k,0);
        return res;

        
	}
    public static void main(String[] args) {
        
        int input[] = {2,1,3,2};
        int k = 4;
        int[][] res = subsetsSumK0(input, k);
        for(int i=0;i<res.length;i++){
            System.out.println(res[i]);
            for(int j=0;j<res[i].length;j++){
                System.out.print(res[i][j]+" ");
            }
            System.out.println();
        }
    }
}