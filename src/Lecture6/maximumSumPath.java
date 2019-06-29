public class maximumSumPath {

	public static long maximumSumPath1(int[] input1, int[] input2) {
		/* Your class should be named Solution
		* Don't write main().
		* Don't read input, they are passed as function arguments.
		* Return output and don't print it.
		* Taking input and printing output is handled automatically.
		*/
        int i=0,j=0;
        long s1 = 0;
        long s2 = 0;
        long arr1Sum = 0;
        long arr2Sum = 0;
       long maxSum = 0;
        while(i<input1.length && j<input2.length){
            if(input1[i]>input2[j]){
                s2 += input2[j];
                j++;
                
            }
            else if(input1[i]<input2[j]){
                s1 += input1[i];
                i++;
               
            }
            else{
                s1 += input1[i];
                s2 += input2[j];
                maxSum += Math.max(s1,s2);
                i++;
                j++;
                s1 = 0;
                s2 = 0;
            }
           // System.out.println(s1+" "+s2+" "+maxSum);
        }
        
        while(i != input1.length){
            maxSum += Math.max(input1[i],s2);
            s2 = 0;
            i++;
        }
        
        while(j != input2.length){
            maxSum += Math.max(input2[j],s1);
            s1 = 0;
            j++;
        }
        
        for(int p1=0;p1<input1.length;p1++){
            arr1Sum += input1[p1];
        }
        
        for(int p2=0;p2<input2.length;p2++){
            arr2Sum += input2[p2];
        }
		return     Math.max(maxSum,Math.max(arr1Sum,arr2Sum));
    }
    
    public static void main(String[] args){
        //Call the method here.
    }
}