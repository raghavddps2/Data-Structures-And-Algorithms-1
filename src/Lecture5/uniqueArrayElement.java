public class uniqueArrayElement{	

	public static int findUnique(int[] arr){

        
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