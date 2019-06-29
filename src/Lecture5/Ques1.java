package Lecture5;
public class Ques1{	

	public static int findUnique(int[] arr){

        /* Your class should be named FindUnique
		 * Don't write main().
		 * Don't read input, it is passed as function argument.
		 * Return output and don't print it.
	 	 * Taking input and printing output is handled automatically.
		 */
        //Basically important thing is that we are keeping a count of the frequency of elements
        int res,k =0;
        int max = arr[0];
        for(int i=0;i<arr.length;i++){
            if(arr[i]>max){
                max = arr[i];
            }
        }
        int[] count = new int[max+1];
        for(int i=0;i<arr.length;i++){
            count[arr[i]]++;
        }
        for(int i=0;i<count.length;i++){
            if(count[i] == 1){
                k =i;
            }
        }
        return k;
	}
}