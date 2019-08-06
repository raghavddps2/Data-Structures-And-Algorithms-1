public class solution {

    
    public static int binarySearch1(int input[],int element,int low,int high){
        
        int mid = (low+high)/2;
        if(low>high){
            return -1;
        }
        if(input[mid] == element){
            return mid;
        }
        if(input[mid]>element){
            return binarySearch1(input,element,low,mid-1);
        }
        return binarySearch1(input,element,mid+1,high);
        
        
    }
	// element - number to be searched
	public static int binarySearch(int input[], int element) {
    		// Write your code here
        int low = 0;
        int high = input.length-1;
        int index = binarySearch1(input,element,low,high);
        return index;
    }
    public static void main(String[] args) {
        int input[] = {1,2,3,4,5};
        int x = binarySearch(input, 5);
    }
}
