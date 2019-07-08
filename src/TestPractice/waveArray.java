package TestPractice;

/**
 * waveArray
 */
public class waveArray {

    public static void wavePrint(int arr[][]){
		
        int rows = arr.length;
        int columns = arr[0].length;
        
        for(int p=0;p<columns;p++){
            if(p%2 == 0){
            
        		int j=p;
				for(int i=0;i<rows;i++){
           			System.out.print(arr[i][j]+" ");
        		}       
            }
            else{	
        		int j=p;
        		for(int i=rows-1;i>=0;i--){
            		System.out.print(arr[i][j]+" ");
        		}
            }
        }

	}
    public static void main(String[] args) {
        
        int[][] arr = {{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
        wavePrint(arr);
    }
}