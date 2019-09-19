package GeeksForGeeks.LinkedList;

/**
 * 2DArraytoLL
 */
public class 2DArraytoLL {

    /*
        @Algorithm:
            1. All we have to do is basically, just do it for the first element and ask recursion to 
                do the remaing things for us. This is as simple as saying.
                    temp.data = arr[i][j];
                    temp.right = construct(arr,i,j+1,m) 
                    temp.left = construct(arr,i+1,j,m)
            2. The above is how we follow the process.

    */
    static Node construct1(int arr[][],int i,int j,int n){
        if(i> n-1 || j> n-1){
            return null;
        }
        
        Node temp = new Node(arr[i][j]);
        temp.right = construct1(arr,i,j+1,n);
        temp.down = construct1(arr,i+1,j,n);
        return temp;
    }
    
    static Node construct(int arr[][],int n)
    {
        // What we have to do is basically, just convert the
        //Matrix to a 2-D linked list.
        
        int rows = arr.length;
        int columns = arr[0].length;
        
        return construct1(arr,0,0,n);
    }
}