package TestPractice;

/**
 * resetMatrix
 */
public class resetMatrix {


    public static void  resetMatrix(int[][] input) {
        
        int rows = input.length;
        int columns = input[0].length;
        int track[][] = new int[rows*columns][2];
        int k =0;
        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                if(input[i][j] == 0){
                    track[k][0] = i;
                    track[k][1] = j;
                    System.out.println(i+" "+j);
                    k++;   
                }
            }
        }

        for(int i=0;i<k;i++){

            int j = track[i][0];
            for(int p=0;p<input[i].length;p++){
                input[j][p] = 0;
            }
            
            j = track[i][1];
            for(int p=0;p<input.length;p++){
                input[p][j] = 0;
            }
        }


        for(int i=0;i<input.length;i++){
            for(int j=0;j<input[i].length;j++){
                System.out.print(input[i][j]+" ");
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int[][] arr = {{1,0,1},{1,1,1},{1,1,1}};
        resetMatrix(arr);
    }
}